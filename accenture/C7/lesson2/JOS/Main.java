package accenture.C7.lesson2.JOS;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import accenture.C7.lesson1.searchClients.ClientStore;
import accenture.C7.lesson1.searchClients.SearchClients;

public class Main {
    public static void main(String[] args) throws Exception{
        if (args.length != 1) {
            System.out.println("Usage: Main [fileName]");
            return;
        }
        Path path = Path.of(args[0]);
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path));) {
            out.writeObject(ClientStore.getClients());
        }catch(Exception e){e.printStackTrace();}
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path));) {
            List<SearchClients> clients = (List<SearchClients>) in.readObject();
            for (SearchClients searchClients : clients) {
                System.out.println(searchClients.toString());
            }
        }catch(Exception e){e.printStackTrace();}
    }
}
