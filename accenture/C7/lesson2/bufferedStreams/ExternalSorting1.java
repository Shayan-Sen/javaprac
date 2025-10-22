package accenture.C7.lesson2.bufferedStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExternalSorting1 {

    private static final int SHARD_SIZE = 100;

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: MakeShards [input file] [output folder]");
            return;
        }
        Path input = Path.of(args[0]);
        Path outDir = Files.createDirectories(Path.of(args[1]));
        try(BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);){
            int shardNum = 0;
            String word  = reader.readLine();
            while (word != null) {
                List<String> shard = new ArrayList<String>(SHARD_SIZE);
                while (shard.size() < SHARD_SIZE) {
                    shard.add(word);
                    word = reader.readLine();
                }
            Collections.sort(shard);
            Path output = Path.of(outDir.toString(),getOutputFileName(shardNum));
            try (BufferedWriter writer = Files.newBufferedWriter(output,StandardCharsets.UTF_8);) {
                for(String s : shard.subList(0, shard.size()-1)){
                    writer.write(s);
                    writer.write(System.lineSeparator());
                }
                writer.write(shard.get(shard.size()-1));
            }
            shardNum++;
            }
        }
    }

    private static String getOutputFileName(int shardNum) { return String.format("shard%02d.txt", shardNum); }
}
