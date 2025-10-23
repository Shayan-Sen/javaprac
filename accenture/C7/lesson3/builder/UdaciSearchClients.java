package accenture.C7.lesson3.builder;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;
import java.util.Objects;

public class UdaciSearchClients {
    private final String name;
    private final long id;
    private final int quarterlyBudget;
    private final int numEmployees;
    private final Instant contractStart;
    private final Duration contractLength;
    private final List<ZoneId> timeZones;
    private final String billingAddress;

    private UdaciSearchClients(
            String name,
            long id,
            int quarterlyBudget,
            int numEmployees,
            Instant contractStart,
            Duration contractLength,
            List<ZoneId> timeZones,
            String billingAddress) {
        this.name = name;
        this.id = id;
        this.quarterlyBudget = quarterlyBudget;
        this.numEmployees = numEmployees;
        this.contractStart = contractStart;
        this.contractLength = contractLength;
        this.timeZones = timeZones;
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getQuarterlyBudget() {
        return quarterlyBudget;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public Instant getContractStart() {
        return contractStart;
    }

    public Duration getContractLength() {
        return contractLength;
    }

    public Instant getContractEnd() {
        return getContractStart().plus(getContractLength());
    }

    public List<ZoneId> getTimeZones() {
        return timeZones;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    @Override
    public String toString() {
        return "UdacisearchClient{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", quarterlyBudget=" + getQuarterlyBudget() +
                ", numEmployees=" + getNumEmployees() +
                ", contractStart=" + getContractStart() +
                ", contractLength=" + getContractLength() +
                ", timeZones=" + getTimeZones() +
                ", billingAddress='" + getBillingAddress() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof UdaciSearchClients))
            return false;
        UdaciSearchClients that = (UdaciSearchClients) o;
        return id == that.id &&
                quarterlyBudget == that.quarterlyBudget &&
                numEmployees == that.numEmployees &&
                name.equals(that.name) &&
                contractStart.equals(that.contractStart) &&
                contractLength.equals(that.contractLength) &&
                timeZones.equals(that.timeZones) &&
                billingAddress.equals(that.billingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                id,
                quarterlyBudget,
                numEmployees,
                contractStart,
                contractLength,
                timeZones,
                billingAddress);
    }

    public static final class Builder {
        private String name;
        private long id;
        private int quarterlyBudget;
        private int numEmployees;
        private Instant contractStart;
        private Duration contractLength;
        private List<ZoneId> timeZones;
        private String billingAddress;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setQuaterlyBudget(int quarterlyBudget) {
            this.quarterlyBudget = quarterlyBudget;
            return this;
        }

        public Builder setNumEmployees(int numEmployees) {
            this.numEmployees = numEmployees;
            return this;
        }

        public Builder setContractStart(Instant contractStart) {
            this.contractStart = contractStart;
            return this;
        }

        public Builder setContractLength(Duration contractLength) {
            this.contractLength = contractLength;
            return this;
        }

        public Builder setTimeZones(List<ZoneId> timeZones) {
            this.timeZones = timeZones;
            return this;
        }

        public Builder setBillingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public UdaciSearchClients build() {
            return new UdaciSearchClients(name, id, quarterlyBudget, numEmployees, contractStart, contractLength,
                    timeZones, billingAddress);
        }
    }
}
