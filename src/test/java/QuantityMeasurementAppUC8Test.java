import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC8Test {

    @Test
    public void testFeetEquality() {

        LengthUC8 l1 =
                new LengthUC8(1, LengthUnitUC8.FEET);

        LengthUC8 l2 =
                new LengthUC8(1, LengthUnitUC8.FEET);

        assertEquals(l1, l2);
    }

    @Test
    public void testInchesEquality() {

        LengthUC8 l1 =
                new LengthUC8(12, LengthUnitUC8.INCHES);

        LengthUC8 l2 =
                new LengthUC8(12, LengthUnitUC8.INCHES);

        assertEquals(l1, l2);
    }

    @Test
    public void testFeetInchesComparison() {

        LengthUC8 l1 =
                new LengthUC8(1, LengthUnitUC8.FEET);

        LengthUC8 l2 =
                new LengthUC8(12, LengthUnitUC8.INCHES);

        assertEquals(l1, l2);
    }

    @Test
    public void testAddition() {

        LengthUC8 l1 =
                new LengthUC8(1, LengthUnitUC8.FEET);

        LengthUC8 l2 =
                new LengthUC8(12, LengthUnitUC8.INCHES);

        LengthUC8 result =
                l1.add(l2);

        assertEquals(
                new LengthUC8(2, LengthUnitUC8.FEET),
                result
        );
    }

}