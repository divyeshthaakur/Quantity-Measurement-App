package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC3 {

    public static boolean demonstrateLengthEquality(
            Length length1,
            Length length2) {

        return length1.equals(length2);
    }


    public static void demonstrateFeetEquality() {

        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(1, Length.LengthUnit.FEET);

        System.out.println(demonstrateLengthEquality(l1, l2));
    }


    public static void demonstrateInchesEquality() {

        Length l1 = new Length(1, Length.LengthUnit.INCHES);
        Length l2 = new Length(1, Length.LengthUnit.INCHES);

        System.out.println(demonstrateLengthEquality(l1, l2));
    }


    public static void demonstrateFeetInchesComparison() {

        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(12, Length.LengthUnit.INCHES);

        System.out.println(demonstrateLengthEquality(l1, l2));
    }


    public static void main(String[] args) {

        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}