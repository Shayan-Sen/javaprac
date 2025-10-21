package accenture.C7.lesson2.fileNPathAPI1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileApiDemo {
    public static void main(String[] args) throws IOException {
        StandardOpenOption inOptions = StandardOpenOption.READ;
        StandardOpenOption[] outOptions = {StandardOpenOption.WRITE,StandardOpenOption.CREATE};
        InputStream in = Files.newInputStream(Path.of(args[0]), inOptions);
        OutputStream out = Files.newOutputStream(Path.of(args[1]), outOptions);

        in.transferTo(out);

        in.close();
        out.close();
    }
}
