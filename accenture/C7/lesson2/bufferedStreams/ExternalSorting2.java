package accenture.C7.lesson2.bufferedStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class ExternalSorting2 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: ExternalSorting2 [input folder] [output file]");
            return;
        }
        List<Path> inputs = Files.walk(Path.of(args[0]), 1).skip(1).collect(Collectors.toList());
        Path output = Path.of(args[1]);
        List<BufferedReader> readerList = new ArrayList<BufferedReader>(inputs.size());
        try {
            for (Path input : inputs) {
                readerList.add(Files.newBufferedReader(input, StandardCharsets.UTF_8));
            }
            PriorityQueue<WordEntry> queue = new PriorityQueue<WordEntry>();
            for (BufferedReader reader : readerList) {
                String word = reader.readLine();
                if (word != null) {
                    queue.add(new WordEntry(word, reader));
                }
            }
            try (Writer writer = Files.newBufferedWriter(output)) {
                while (!queue.isEmpty()) {
                    WordEntry entry = queue.poll();
                    writer.write(entry.word);
                    writer.write(System.lineSeparator());
                    String word = entry.reader.readLine();
                    if (word != null) {
                        queue.add(new WordEntry(word, entry.reader));
                    }
                }
            }
        } finally {
            for (BufferedReader reader : readerList) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static final class WordEntry implements Comparable<WordEntry> {
        private final String word;
        private final BufferedReader reader;

        private WordEntry(String word, BufferedReader reader) {
            this.word = Objects.requireNonNull(word);
            this.reader = Objects.requireNonNull(reader);
        }

        @Override
        public int compareTo(WordEntry other) {
            return word.compareTo(other.word);
        }
    }
}
