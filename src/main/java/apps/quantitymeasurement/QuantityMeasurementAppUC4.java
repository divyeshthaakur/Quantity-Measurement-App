package apps.quantitymeasurement;

public class QuantityMeasurementAppUC4{


    public static boolean demonstrateLengthEquality(
            LengthUC4 length1,
            LengthUC4 length2) {

        return length1.equals(length2);
    }


    public static boolean demonstrateLengthComparison(
            double value1,
            LengthUC4.LengthUnit unit1,
            double value2,
            LengthUC4.LengthUnit unit2) {

        LengthUC4 l1 = new LengthUC4(value1, unit1);
        LengthUC4 l2 = new LengthUC4(value2, unit2);

        boolean result = l1.equals(l2);

        System.out.println(
                value1 + " " + unit1 +
                        " == " +
                        value2 + " " + unit2 +
                        " -> " + result
        );

        return result;
    }


    public static void main(String[] args) {

        demonstrateLengthComparison(
                1.0, LengthUC4.LengthUnit.FEET,
                12.0, LengthUC4.LengthUnit.INCHES
        );

        demonstrateLengthComparison(
                1.0, LengthUC4.LengthUnit.YARDS,
                36.0, LengthUC4.LengthUnit.INCHES
        );

        demonstrateLengthComparison(
                100.0, LengthUC4.LengthUnit.CENTIMETERS,
                39.3701, LengthUC4.LengthUnit.INCHES
        );

        demonstrateLengthComparison(
                3.0, LengthUC4.LengthUnit.FEET,
                1.0, LengthUC4.LengthUnit.YARDS
        );

        demonstrateLengthComparison(
                30.48, LengthUC4.LengthUnit.CENTIMETERS,
                1.0, LengthUC4.LengthUnit.FEET
        );
    }
}