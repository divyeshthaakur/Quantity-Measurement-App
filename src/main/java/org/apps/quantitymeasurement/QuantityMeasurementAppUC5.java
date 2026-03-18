package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC5 {

    public static boolean demonstrateLengthEquality(
            LengthUC5 l1,
            LengthUC5 l2
    )
    {

        boolean result = l1.equals(l2);

        if (result) {
            System.out.println(
                    "The two length measurements are equal."
            );
        } else {
            System.out.println(
                    "The two length measurements are not equal."
            );
        }

        return result;
    }

    public static boolean demonstrateLengthComparison(

            double v1,
            LengthUC5.LengthUnit u1,

            double v2,
            LengthUC5.LengthUnit u2
    ) {

        LengthUC5 l1 = new LengthUC5(v1, u1);

        LengthUC5 l2 = new LengthUC5(v2, u2);

        return demonstrateLengthEquality(l1, l2);
    }

    public static LengthUC5 demonstrateLengthConversion(

            double value,

            LengthUC5.LengthUnit from,

            LengthUC5.LengthUnit to
    ) {

        LengthUC5 l = new LengthUC5(value, from);

        return l.convertTo(to);
    }

    public static LengthUC5 demonstrateLengthConversion(

            LengthUC5 length,

            LengthUC5.LengthUnit to
    ) {

        return length.convertTo(to);
    }

    public static double convert(

            double value,

            LengthUC5.LengthUnit source,

            LengthUC5.LengthUnit target
    ) {

        if (source == null || target == null) {
            throw new IllegalArgumentException();
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException();
        }

        double base =
                value * source.getFactor();

        double result =
                base / target.getFactor();

        return result;
    }


    public static void main(String[] args) {

        LengthUC5 l1 =
                new LengthUC5(
                        3,
                        LengthUC5.LengthUnit.FEET
                );

        LengthUC5 l2 =
                new LengthUC5(
                        36,
                        LengthUC5.LengthUnit.INCHES
                );

        demonstrateLengthEquality(l1, l2);


        LengthUC5 r =
                demonstrateLengthConversion(
                        3,
                        LengthUC5.LengthUnit.FEET,
                        LengthUC5.LengthUnit.INCHES
                );

        System.out.println(r);
    }
}