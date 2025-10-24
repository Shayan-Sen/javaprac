package accenture.C7.lesson3.adapter_builder;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MultiFileReader implements Closeable{

    private final List<BufferedReader> readers =  new ArrayList<BufferedReader>();

    public MultiFileReader(List<Path> paths) throws IOException {
        for (Path path : paths) {
            try{readers.add(Files.newBufferedReader(path));}
            catch(IOException e){e.printStackTrace();}
        }
    }

    public List<BufferedReader> getReaders() {
        return Collections.unmodifiableList(readers);
    }

    @Override
    public void close() {
        if (!readers.isEmpty()) {
            for (BufferedReader bufferedReader : readers) {
                try{bufferedReader.close();}
                catch(IOException e){e.printStackTrace();}
            }
        }
    }
}
