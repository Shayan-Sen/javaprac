package accenture.C7.lesson3.expiration_manager;

import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Guice;
import com.google.inject.Injector;

public final class ExpirationCheckerTest {
    public static void main(String[] args) {

        FakeClock fakeClock = new FakeClock();
        Map<Path, Instant> fakeModifiedTimes = new HashMap<>();
        FakeMetadataFetcher fakeMetadataFetcher = new FakeMetadataFetcher(fakeModifiedTimes);

        Path expired = Path.of("/test/expired");
        Path notExpired = Path.of("/test/not-expired");
        fakeModifiedTimes.put(expired, fakeClock.instant().minus(Duration.ofDays(31)));
        fakeModifiedTimes.put(notExpired, fakeClock.instant().minus(Duration.ofDays(27)));

        Injector injector = Guice.createInjector(
                b -> b.bind(Clock.class).toInstance(fakeClock),
                b -> b.bind(MetadataFetcher.class).toInstance(fakeMetadataFetcher));

        ExpirationChecker checker = injector.getInstance(ExpirationChecker.class);

        List<Path> expiredFiles = checker.getExpiredFiles(List.of(expired, notExpired), Duration.ofDays(30));

        assert expiredFiles.equals(List.of(expired));
    }
}
