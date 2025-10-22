package accenture.C7.lesson2.bufferedStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

public class ExternalSorting2 {
    public static void main(String[] args) throws IOException{
        if (args.length != 2) {
            System.out.println("Usage: ExternalSorting2 [input dir] [output file]");
            return;
        }

        List<Path> inputs = Files.walk(Path.of(args[0]),1).skip(1).toList();
        List<BufferedReader> readers = new ArrayList<BufferedReader>(inputs.size());
        PriorityQueue<WordEntry> words = new PriorityQueue<WordEntry>();
        Path outPath = Path.of(args[1]);
        try {
            for (Path input : inputs) {
                readers.add(Files.newBufferedReader(input,StandardCharsets.UTF_8));
            }
            for(BufferedReader reader: readers){
                String word = reader.readLine();
                words.add(new WordEntry(word, reader));
            }

            try (BufferedWriter writer = Files.newBufferedWriter(outPath);) {
                while (!words.isEmpty()) {
                    WordEntry entry = words.poll();
                    writer.write(entry.word);
                    writer.write(System.lineSeparator());
                    String word = entry.reader.readLine();
                    if (word!=null) {
                        words.add(new WordEntry(word,entry.reader));
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            if (!readers.isEmpty()) {
                for (BufferedReader reader : readers) {
                    try{ reader.close(); }
                    catch(IOException e){ e.printStackTrace(); }
                }
            }
        }

    }

    private static final class WordEntry implements Comparable<WordEntry>{
        private final String word;
        private final BufferedReader reader;
        
        private WordEntry(String word, BufferedReader reader){
            this.reader = Objects.requireNonNull(reader);
            this.word = Objects.requireNonNull(word);
        }

        @Override
        public int compareTo(WordEntry other){
            return word.compareTo(other.word);
        }
        
    }
}
