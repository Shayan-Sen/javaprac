package accenture.C7.lesson2.fileNPathAPI1;

import java.nio.file.Path;

public class PathApiDemo {
    public static void main(String[] args) {
        Path path = Path.of(".");
        System.out.println("Path: " + path.toAbsolutePath().toString());
    }
}
