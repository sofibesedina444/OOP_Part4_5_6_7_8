package transport;

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
    public String toString() {
        return mechanicName + " компания: " + company;
    }
}
