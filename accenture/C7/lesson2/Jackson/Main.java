package accenture.C7.lesson2.Jackson;

import java.nio.file.Files;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import accenture.C7.lesson1.searchClients.ClientStore;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: Main [fileName]");
            return;
        }
        Path path = Path.of(args[0]);
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.writeValue(Files.newBufferedWriter(path),ClientStore.getClients());
        System.out.println("Working");
    }
}
