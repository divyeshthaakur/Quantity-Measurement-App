package org.apps.quantitymeasurement;

public class QuantityUC11<U extends IMeasurableUC11> {

    private double value;
    private U unit;

    public QuantityUC11(double value, U unit) {

        if (unit == null)
            throw new IllegalArgumentException();

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    public double convertTo(U targetUnit) {

        double base = unit.convertToBaseUnit(value);

        return targetUnit.convertFromBaseUnit(base);
    }

    public QuantityUC11<U> add(QuantityUC11<U> other) {

        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sum = base1 + base2;

        double result = unit.convertFromBaseUnit(sum);

        return new QuantityUC11<>(result, unit);
    }

    public QuantityUC11<U> add(QuantityUC11<U> other, U targetUnit) {

        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sum = base1 + base2;

        double result = targetUnit.convertFromBaseUnit(sum);

        return new QuantityUC11<>(result, targetUnit);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof QuantityUC11<?> q))
            return false;

        if (unit.getClass() != q.unit.getClass())
            return false;

        double base1 = unit.convertToBaseUnit(value);
        double base2 =
                ((IMeasurableUC11) q.unit)
                        .convertToBaseUnit(q.value);

        return Double.compare(base1, base2) == 0;
    }
}