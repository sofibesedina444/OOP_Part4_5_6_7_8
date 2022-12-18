package transport;

import java.util.Objects;

public class Mechanic <M extends Transport> {
    private final String mechanicName;
    private final String company;

    public Mechanic(String mechanicName, String company) {
        this.mechanicName = mechanicName;
        this.company = company;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public String getCompany() {
        return company;
    }

    public boolean getDiagnosed(M transport) {
        return transport.getDiagnosed();
    }

    public void fixTransport(M transport) {
        transport.fixTransport();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(mechanicName, mechanic.mechanicName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicName, company);
    }

    @Override
    public String toString() {
        return mechanicName + " компания: " + company;
    }
}
