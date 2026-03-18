package org.apps.quantitymeasurement;

public class LengthUC7 {

    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        FEET(12),
        INCHES(1),
        YARDS(36),
        CENTIMETERS(0.393701);

        private final double toInches;

        LengthUnit(double toInches) {
            this.toInches = toInches;
        }

        public double toInches(double value) {
            return value * toInches;
        }

        public double fromInches(double inches) {
            return inches / toInches;
        }
    }

    public LengthUC7(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toInches(value);
    }

    private boolean compare(LengthUC7 that) {
        return Math.abs(this.toBase() - that.toBase()) < 0.0001;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LengthUC7)) return false;
        LengthUC7 that = (LengthUC7) obj;
        return compare(that);
    }

    public LengthUC7 convertTo(LengthUnit targetUnit) {
        double inches = toBase();
        double result = targetUnit.fromInches(inches);
        return new LengthUC7(result, targetUnit);
    }

    public LengthUC7 add(LengthUC7 length) {
        return add(length, this.unit);
    }

    public LengthUC7 add(LengthUC7 length, LengthUnit targetUnit) {
        return addAndConvert(length, targetUnit);
    }

    private LengthUC7 addAndConvert(LengthUC7 length, LengthUnit targetUnit) {
        double sumInches = this.toBase() + length.toBase();
        double result = targetUnit.fromInches(sumInches);
        return new LengthUC7(result, targetUnit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}