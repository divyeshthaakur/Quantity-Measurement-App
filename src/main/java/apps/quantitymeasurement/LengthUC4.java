package apps.quantitymeasurement;

public class LengthUC4 {

    private double value;
    private LengthUnit unit;

    public enum LengthUnit {

        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }


    public LengthUC4(double value, LengthUnit unit) {

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }


    private double convertToBaseUnit() {

        double base = value * unit.getConversionFactor();

        return Math.round(base * 100.0) / 100.0;
    }


    public boolean compare(LengthUC4 thatLength) {

        if (thatLength == null) return false;

        return Double.compare(
                this.convertToBaseUnit(),
                thatLength.convertToBaseUnit()
        ) == 0;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        LengthUC4 thatLength = (LengthUC4) o;

        return compare(thatLength);
    }
}