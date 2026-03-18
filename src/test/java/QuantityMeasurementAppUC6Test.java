import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC6Test {

    @Test
    public void testAddition_SameUnit_FeetPlusFeet() {

        LengthUC6 l1 =
                new LengthUC6(
                        1,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 l2 =
                new LengthUC6(
                        2,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 result =
                QuantityMeasurementAppUC6
                        .demonstrateLengthAddition(
                                l1,
                                l2
                        );

        LengthUC6 expected =
                new LengthUC6(
                        3,
                        LengthUC6.LengthUnit.FEET
                );

        assertTrue(
                result.equals(expected)
        );
    }

    @Test
    public void testAddition_FeetPlusInches() {

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

        LengthUC6 result =
                QuantityMeasurementAppUC6
                        .demonstrateLengthAddition(
                                l1,
                                l2
                        );

        LengthUC6 expected =
                new LengthUC6(
                        2,
                        LengthUC6.LengthUnit.FEET
                );

        assertTrue(
                result.equals(expected)
        );
    }

    @Test
    public void testAddition_InchesPlusFeet() {

        LengthUC6 l1 =
                new LengthUC6(
                        12,
                        LengthUC6.LengthUnit.INCHES
                );

        LengthUC6 l2 =
                new LengthUC6(
                        1,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 result =
                QuantityMeasurementAppUC6
                        .demonstrateLengthAddition(
                                l1,
                                l2
                        );

        LengthUC6 expected =
                new LengthUC6(
                        24,
                        LengthUC6.LengthUnit.INCHES
                );

        assertTrue(
                result.equals(expected)
        );
    }

    @Test
    public void testAddition_WithZero() {

        LengthUC6 l1 =
                new LengthUC6(
                        5,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 l2 =
                new LengthUC6(
                        0,
                        LengthUC6.LengthUnit.INCHES
                );

        LengthUC6 result =
                QuantityMeasurementAppUC6
                        .demonstrateLengthAddition(
                                l1,
                                l2
                        );

        LengthUC6 expected =
                new LengthUC6(
                        5,
                        LengthUC6.LengthUnit.FEET
                );

        assertTrue(
                result.equals(expected)
        );
    }

    @Test
    public void testAddition_Negative() {

        LengthUC6 l1 =
                new LengthUC6(
                        5,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 l2 =
                new LengthUC6(
                        -2,
                        LengthUC6.LengthUnit.FEET
                );

        LengthUC6 result =
                QuantityMeasurementAppUC6
                        .demonstrateLengthAddition(
                                l1,
                                l2
                        );

        LengthUC6 expected =
                new LengthUC6(
                        3,
                        LengthUC6.LengthUnit.FEET
                );

        assertTrue(
                result.equals(expected)
        );
    }
}