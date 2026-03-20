package org.apps.quantitymeasurement;

public class LengthUC8 {

    private double value;
    private LengthUnitUC8 unit;

    public LengthUC8(double value, LengthUnitUC8 unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        LengthUC8 that = (LengthUC8) o;

        return compare(that);
    }

    public LengthUC8 convertTo(LengthUnitUC8 targetUnit) {

        double base = convertToBaseUnit();

        double converted = convertFromBaseToTargetUnit(base, targetUnit);

        return new LengthUC8(converted, targetUnit);
    }

    public LengthUC8 add(LengthUC8 thatLength) {

        return addAndConvert(thatLength, this.unit);
    }

    public LengthUC8 add(LengthUC8 length, LengthUnitUC8 targetUnit) {

        return addAndConvert(length, targetUnit);
    }

    private boolean compare(LengthUC8 thatLength) {

        return Double.compare(
                this.convertToBaseUnit(),
                thatLength.convertToBaseUnit()
        ) == 0;
    }

    private LengthUC8 addAndConvert(LengthUC8 length, LengthUnitUC8 targetUnit) {

        double sumBase =
                this.convertToBaseUnit() +
                        length.convertToBaseUnit();

        double result =
                convertFromBaseToTargetUnit(sumBase, targetUnit);

        return new LengthUC8(result, targetUnit);
    }

    private double convertToBaseUnit() {

        return unit.convertToBaseUnit(value);
    }

    private double convertFromBaseToTargetUnit(
            double lengthInBase,
            LengthUnitUC8 targetUnit
    ) {

        return targetUnit.convertFromBaseUnit(lengthInBase);
    }

    @Override
    public String toString() {

        return value + " " + unit;
    }
}