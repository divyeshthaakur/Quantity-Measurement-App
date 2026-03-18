package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC6 {

    public static boolean demonstrateLengthEquality(
            LengthUC6 l1,
            LengthUC6 l2
    ) {

        boolean result = l1.equals(l2);

        if (result) {
            System.out.println(
                    "The two length measurements are equal.");
        } else {
            System.out.println(
                    "The two length measurements are not equal."
            );
        }

        return result;
    }

    public static boolean demonstrateLengthComparison(

            double v1,
            LengthUC6.LengthUnit u1,

            double v2,
            LengthUC6.LengthUnit u2
    ) {

        LengthUC6 l1 =
                new LengthUC6(v1, u1);

        LengthUC6 l2 =
                new LengthUC6(v2, u2);

        return demonstrateLengthEquality(
                l1,
                l2
        );
    }

    public static LengthUC6 demonstrateLengthConversion(

            double value,
            LengthUC6.LengthUnit from,
            LengthUC6.LengthUnit to
    ) {

        LengthUC6 l =
                new LengthUC6(value, from);

        return l.convertTo(to);
    }

    public static LengthUC6 demonstrateLengthConversion(

            LengthUC6 length,
            LengthUC6.LengthUnit to
    ) {

        return length.convertTo(to);
    }

    public static LengthUC6 demonstrateLengthAddition(

            LengthUC6 l1,
            LengthUC6 l2
    ) {

        return l1.add(l2);
    }

    public static void main(String[] args) {

        LengthUC6 l1 =
                new LengthUC6(
                        1,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 l2 =
                new LengthUC6(
                        12,
                        LengthUC6.LengthUnit.INCHES
                );

        LengthUC6 r =
                demonstrateLengthAddition(
                        l1,
                        l2
                );

        System.out.println(r);
    }
}