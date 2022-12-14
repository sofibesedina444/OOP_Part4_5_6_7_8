package transport;

public enum Capacity {
    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(40, 50),
    BIG(60, 80),
    EXTRA_LARGE(100, 120);

    private final Integer minNumberSeats;
    private final Integer maxNumberSeats;

    Capacity(Integer minNumberSeats, Integer maxNumberSeats) {
        this.minNumberSeats = minNumberSeats;
        this.maxNumberSeats = maxNumberSeats;
    }

    public Integer getMinNumberSeats() {
        return minNumberSeats;
    }

    public Integer getMaxNumberSeats() {
        return maxNumberSeats;
    }

    @Override
    public String toString() {
        if (minNumberSeats == null) {
            return "Вместимость: " + "до " + minNumberSeats + " мест" + "\n";
        } else {
            return "Вместимость: " + minNumberSeats + " - " + maxNumberSeats + " мест" + "\n";
        }
    }
}
