package accenture.C7.lesson3.expiration_manager;

import com.google.inject.AbstractModule;

import java.time.Clock;

public final class ExpirationCheckerModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Clock.class).toInstance(Clock.systemUTC());
    bind(MetadataFetcher.class).to(MetadataFetcherImpl.class);
  }
}
