package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC7 {

    public static boolean demonstrateLengthEquality(
            LengthUC7 length1,
            LengthUC7 length2) {

        return length1.equals(length2);
    }

    public static boolean demonstrateLengthComparison(
            LengthUC7 length1,
            LengthUC7 length2) {

        return length1.equals(length2);
    }

    public static LengthUC7 demonstrateLengthConversion(
            LengthUC7 length) {

        return length.convertTo(LengthUC7.LengthUnit.INCHES);
    }

    public static LengthUC7 demonstrateLengthConversion(
            LengthUC7 length,
            LengthUC7.LengthUnit toUnit) {

        return length.convertTo(toUnit);
    }

    public static LengthUC7 demonstrateLengthAddition(
            LengthUC7 length1,
            LengthUC7 length2) {

        return length1.add(length2);
    }

    public static LengthUC7 demonstrateLengthAddition(
            LengthUC7 length1,
            LengthUC7 length2,
            LengthUC7.LengthUnit targetUnit) {

        return length1.add(length2, targetUnit);
    }

    public static void main(String[] args) {

        LengthUC7 l1 =
                new LengthUC7(1, LengthUC7.LengthUnit.FEET);

        LengthUC7 l2 =
                new LengthUC7(12, LengthUC7.LengthUnit.INCHES);

        LengthUC7 result =
                demonstrateLengthAddition(
                        l1,
                        l2,
                        LengthUC7.LengthUnit.FEET);

        System.out.println(result);
    }
}