package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC8 {

    public static boolean demonstrateLengthEquality(
            LengthUC8 length1,
            LengthUC8 length2
    ) {
        return length1.equals(length2);
    }

    public static boolean demonstrateLengthComparison(
            double value1,
            LengthUnitUC8 unit1,
            double value2,
            LengthUnitUC8 unit2
    ) {

        LengthUC8 l1 =
                new LengthUC8(value1, unit1);

        LengthUC8 l2 =
                new LengthUC8(value2, unit2);

        return l1.equals(l2);
    }

    public static LengthUC8 demonstrateLengthConversion(
            double value,
            LengthUnitUC8 fromUnit,
            LengthUnitUC8 toUnit
    ) {

        LengthUC8 length =
                new LengthUC8(value, fromUnit);

        return length.convertTo(toUnit);
    }

    public static LengthUC8 demonstrateLengthConversion(
            LengthUC8 length,
            LengthUnitUC8 toUnit
    ) {

        return length.convertTo(toUnit);
    }

    public static LengthUC8 demonstrateLengthAddition(
            LengthUC8 length1,
            LengthUC8 length2
    ) {

        return length1.add(length2);
    }

    public static LengthUC8 demonstrateLengthAddition(
            LengthUC8 length1,
            LengthUC8 length2,
            LengthUnitUC8 targetUnit
    ) {

        return length1.add(length2, targetUnit);
    }

    public static void main(String[] args) {

        LengthUC8 l1 =
                new LengthUC8(1, LengthUnitUC8.FEET);

        LengthUC8 l2 =
                new LengthUC8(12, LengthUnitUC8.INCHES);

        System.out.println(l1.equals(l2));
    }
}