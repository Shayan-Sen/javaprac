package accenture.C7.lesson3.expiration_manager;

import com.google.inject.Guice;

import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Main {
    public static void main(String[] args) {
        // TODO: Update this code to create a new Guice injector from the Guice module
        // you filled in.
        // Use Guice.createInjector(...) to do this.

        // TODO: Instead of calling the ExpirationChecker constructor here, use the
        // Guice injector to
        // get an instance of the ExpirationChecker.
        ExpirationChecker checker = Guice.createInjector(new ExpirationCheckerModule())
                .getInstance(ExpirationChecker.class);

        List<Path> paths = Arrays.stream(args).map(Path::of).collect(Collectors.toList());

        System.out.println("The following files are expired: "
                + checker.getExpiredFiles(paths, Duration.ofDays(28)));
    }
}
