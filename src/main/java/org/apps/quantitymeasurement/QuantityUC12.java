package org.apps.quantitymeasurement;

public class QuantityUC12<U extends IMeasurableUC12> {

    private double value;
    private U unit;

    public QuantityUC12(double value, U unit) {

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

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof QuantityUC12<?> q))
            return false;

        if (unit.getClass() != q.unit.getClass())
            return false;

        double b1 = unit.convertToBaseUnit(value);
        double b2 =
                ((IMeasurableUC12) q.unit)
                        .convertToBaseUnit(q.value);

        return Double.compare(b1, b2) == 0;
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }

    public double convertTo(U targetUnit) {

        double base =
                unit.convertToBaseUnit(value);

        return targetUnit.convertFromBaseUnit(base);
    }

    public QuantityUC12<U> add(
            QuantityUC12<U> other) {

        double b1 =
                unit.convertToBaseUnit(value);

        double b2 =
                other.unit.convertToBaseUnit(
                        other.value);

        double sum = b1 + b2;

        double r =
                unit.convertFromBaseUnit(sum);

        return new QuantityUC12<>(r, unit);
    }

    public QuantityUC12<U> add(
            QuantityUC12<U> other,
            U targetUnit) {

        double b1 =
                unit.convertToBaseUnit(value);

        double b2 =
                other.unit.convertToBaseUnit(
                        other.value);

        double sum = b1 + b2;

        double r =
                targetUnit.convertFromBaseUnit(sum);

        return new QuantityUC12<>(r,
                targetUnit);
    }

    // -------- SUBTRACT --------

    public QuantityUC12<U> subtract(
            QuantityUC12<U> other) {

        double b1 =
                unit.convertToBaseUnit(value);

        double b2 =
                other.unit.convertToBaseUnit(
                        other.value);

        double diff = b1 - b2;

        double r =
                unit.convertFromBaseUnit(diff);

        return new QuantityUC12<>(r, unit);
    }

    public QuantityUC12<U> subtract(
            QuantityUC12<U> other,
            U targetUnit) {

        double b1 =
                unit.convertToBaseUnit(value);

        double b2 =
                other.unit.convertToBaseUnit(
                        other.value);

        double diff = b1 - b2;

        double r =
                targetUnit.convertFromBaseUnit(diff);

        return new QuantityUC12<>(r,
                targetUnit);
    }

    // -------- DIVIDE --------

    public double divide(
            QuantityUC12<U> other) {

        if (other.value == 0)
            throw new ArithmeticException();

        double b1 =
                unit.convertToBaseUnit(value);

        double b2 =
                other.unit.convertToBaseUnit(
                        other.value);

        return b1 / b2;
    }
}