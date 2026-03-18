package org.apps.quantitymeasurement;

public class LengthUC6 {

    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {

        INCHES(1.0),
        FEET(12.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double factor;

        LengthUnit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    public LengthUC6(double value, LengthUnit unit) {

        if (unit == null) {
            throw new IllegalArgumentException();
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException();
        }

        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit() {

        double inches = value * unit.getFactor();

        return Math.round(inches * 100.0) / 100.0;
    }

    private double convertFromBaseToTarget(
            double inches,
            LengthUnit target
    ) {

        double v = inches / target.getFactor();

        return Math.round(v * 100.0) / 100.0;
    }

    private boolean compare(LengthUC6 that) {

        return this.convertToBaseUnit()
                == that.convertToBaseUnit();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        LengthUC6 that = (LengthUC6) o;

        return compare(that);
    }

    public LengthUC6 convertTo(
            LengthUnit target
    ) {

        double base = convertToBaseUnit();

        double v =
                convertFromBaseToTarget(
                        base,
                        target
                );

        return new LengthUC6(v, target);
    }

    public LengthUC6 add(
            LengthUC6 that
    ) {

        if (that == null) {
            throw new IllegalArgumentException();
        }

        double b1 =
                this.convertToBaseUnit();

        double b2 =
                that.convertToBaseUnit();

        double sum =
                b1 + b2;

        double result =
                convertFromBaseToTarget(
                        sum,
                        this.unit
                );

        return new LengthUC6(
                result,
                this.unit
        );
    }

    @Override
    public String toString() {

        return String.format(
                "%.2f %s",
                value,
                unit
        );
    }
}