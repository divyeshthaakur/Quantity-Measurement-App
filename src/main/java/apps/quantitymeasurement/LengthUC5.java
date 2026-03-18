package apps.quantitymeasurement;

public class LengthUC5 {

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


    public LengthUC5(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit (inches)
    private double convertToBaseUnit() {
        double inches = value * unit.getFactor();
        return Math.round(inches * 100.0) / 100.0;
    }

    // compare helper
    private boolean compare(LengthUC5 that) {
        return this.convertToBaseUnit() ==
                that.convertToBaseUnit();
    }

    // equals override
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        LengthUC5 that = (LengthUC5) o;

        return compare(that);
    }

    public LengthUC5 convertTo(LengthUnit targetUnit) {

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target null");
        }

        double base = convertToBaseUnit();

        double result =
                base / targetUnit.getFactor();

        result =
                Math.round(result * 100.0) / 100.0;

        return new LengthUC5(result, targetUnit);
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