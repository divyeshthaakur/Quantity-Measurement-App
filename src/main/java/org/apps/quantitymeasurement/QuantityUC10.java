package org.apps.quantitymeasurement;

public class QuantityUC10<U extends IMeasurableUC10> {

    private double value;
    private U unit;

    public QuantityUC10(double value, U unit) {
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

    public QuantityUC10<U> add(QuantityUC10<U> other) {
        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sumBase = base1 + base2;
        double result = unit.convertFromBaseUnit(sumBase);

        return new QuantityUC10<>(result, unit);
    }

    public QuantityUC10<U> add(QuantityUC10<U> other, U targetUnit) {

        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sumBase = base1 + base2;
        double result = targetUnit.convertFromBaseUnit(sumBase);

        return new QuantityUC10<>(result, targetUnit);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof QuantityUC10<?> q)) return false;

        if (unit.getClass() != q.unit.getClass())
            return false;

        double base1 = unit.convertToBaseUnit(value);
        double base2 = ((IMeasurableUC10) q.unit).convertToBaseUnit(q.value);

        return Double.compare(base1, base2) == 0;
    }
}