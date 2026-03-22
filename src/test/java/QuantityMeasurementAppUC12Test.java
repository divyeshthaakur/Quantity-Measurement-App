import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC12Test {

    @Test
    public void testSubtraction() {

        QuantityUC12<LengthUnitUC12> a =
                new QuantityUC12<>(10,
                        LengthUnitUC12.FEET);

        QuantityUC12<LengthUnitUC12> b =
                new QuantityUC12<>(5,
                        LengthUnitUC12.FEET);

        assertEquals(5,
                a.subtract(b).getValue());
    }

    @Test
    public void testDivision() {

        QuantityUC12<WeightUnitUC12> a =
                new QuantityUC12<>(10,
                        WeightUnitUC12.KILOGRAM);

        QuantityUC12<WeightUnitUC12> b =
                new QuantityUC12<>(5,
                        WeightUnitUC12.KILOGRAM);

        assertEquals(2,
                a.divide(b));
    }

    @Test
    public void testVolume() {

        QuantityUC12<VolumeUnitUC12> a =
                new QuantityUC12<>(1,
                        VolumeUnitUC12.LITRE);

        QuantityUC12<VolumeUnitUC12> b =
                new QuantityUC12<>(1000,
                        VolumeUnitUC12.MILLILITRE);

        assertTrue(a.equals(b));
    }
}