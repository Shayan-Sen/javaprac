package accenture.C7.lesson3.builder;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UdaciSearchClients client = new UdaciSearchClients.Builder().setName("CatFacts LLC").setId(17)
                .setQuaterlyBudget(8000).setNumEmployees(5).setContractStart(Instant.now())
                .setContractLength(Duration.ofDays(180)).setTimeZones(List.of(ZoneId.of("America/Los_Angeles")))
                .setBillingAddress("555 Meowmers Ln, Riverside, CA 92501")
                .build();

        System.out.println(client.toString());
    }
}
