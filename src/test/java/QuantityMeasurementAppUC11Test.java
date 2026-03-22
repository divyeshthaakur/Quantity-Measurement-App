import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC11Test {

    @Test
    public void litreEqualsMillilitre() {

        QuantityUC11<VolumeUnitUC11> l =
                new QuantityUC11<>(1.0,
                        VolumeUnitUC11.LITRE);

        QuantityUC11<VolumeUnitUC11> ml =
                new QuantityUC11<>(1000.0,
                        VolumeUnitUC11.MILLILITRE);

        assertTrue(l.equals(ml));
    }

    @Test
    public void gallonEqualsLitre() {

        QuantityUC11<VolumeUnitUC11> g =
                new QuantityUC11<>(1.0,
                        VolumeUnitUC11.GALLON);

        QuantityUC11<VolumeUnitUC11> l =
                new QuantityUC11<>(3.78541,
                        VolumeUnitUC11.LITRE);

        assertTrue(g.equals(l));
    }

    @Test
    public void addLitreAndMillilitre() {

        QuantityUC11<VolumeUnitUC11> l =
                new QuantityUC11<>(1.0,
                        VolumeUnitUC11.LITRE);

        QuantityUC11<VolumeUnitUC11> ml =
                new QuantityUC11<>(1000.0,
                        VolumeUnitUC11.MILLILITRE);

        QuantityUC11<VolumeUnitUC11> r =
                l.add(ml, VolumeUnitUC11.LITRE);

        assertEquals(2.0, r.getValue());
    }
}