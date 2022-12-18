package transport;

public enum LoadCapacity {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float minWeight;
    private final Float maxWeight;

    LoadCapacity(Float minWeight, Float maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public float getMinWeight() {
        return minWeight;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        if (minWeight == null) {
            return "Грузоподъемность: " +
                    "до " + maxWeight + " тонн" + "\n";
        } else if (maxWeight == null) {
            return "Грузоподъемность: " +
                    "от " + minWeight + " тонн " + "\n";
        } else {
            return "Грузоподъемность: " +
                    "от " + minWeight + " тонн " +
                    "до " + maxWeight + " тонн" + "\n";
        }
    }
}
