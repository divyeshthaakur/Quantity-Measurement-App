package org.apps.quantitymeasurement;

public class WeightUC9 {

    private double value;
    private WeightUnitUC9 unit;

    public WeightUC9(double value, WeightUnitUC9 unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        WeightUC9 that = (WeightUC9) o;

        return compare(that);
    }

    public WeightUC9 convertTo(WeightUnitUC9 targetUnit) {

        double base = convertToBaseUnit();

        double converted =
                convertFromBaseToTargetUnit(base, targetUnit);

        return new WeightUC9(converted, targetUnit);
    }

    public WeightUC9 add(WeightUC9 thatWeight) {

        return addAndConvert(thatWeight, this.unit);
    }

    public WeightUC9 add(
            WeightUC9 weight,
            WeightUnitUC9 targetUnit
    ) {

        return addAndConvert(weight, targetUnit);
    }

    private boolean compare(WeightUC9 thatWeight) {

        return Double.compare(
                this.convertToBaseUnit(),
                thatWeight.convertToBaseUnit()
        ) == 0;
    }

    private WeightUC9 addAndConvert(
            WeightUC9 weight,
            WeightUnitUC9 targetUnit
    ) {

        double sumBase =
                this.convertToBaseUnit()
                        + weight.convertToBaseUnit();

        double result =
                convertFromBaseToTargetUnit(
                        sumBase,
                        targetUnit
                );

        return new WeightUC9(result, targetUnit);
    }

    private double convertToBaseUnit() {

        return unit.convertToBaseUnit(value);
    }

    private double convertFromBaseToTargetUnit(
            double weightInBase,
            WeightUnitUC9 targetUnit
    ) {

        return targetUnit.convertFromBaseUnit(weightInBase);
    }

    @Override
    public String toString() {

        return value + " " + unit;
    }
}