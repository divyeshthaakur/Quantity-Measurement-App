import org.apps.quantitymeasurement.LengthUC5;
import org.apps.quantitymeasurement.QuantityMeasurementAppUC5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppUC5Test {

    @Test
    public void convertFeetToInches() {
        LengthUC5 result = QuantityMeasurementAppUC5.demonstrateLengthConversion(3.0, LengthUC5.LengthUnit.FEET, LengthUC5.LengthUnit.INCHES);
        LengthUC5 expected = new LengthUC5(36, LengthUC5.LengthUnit.INCHES);
        assertTrue(QuantityMeasurementAppUC5.demonstrateLengthEquality(result, expected));
    }


    @Test
    public void convertYardToInches() {
        LengthUC5 y = new LengthUC5(2, LengthUC5.LengthUnit.YARDS);
        LengthUC5 r = QuantityMeasurementAppUC5.demonstrateLengthConversion(y, LengthUC5.LengthUnit.INCHES);
        LengthUC5 e = new LengthUC5(72, LengthUC5.LengthUnit.INCHES);
        assertTrue(r.equals(e));
    }

    @Test
    public void testStaticConvert() {
        double r =QuantityMeasurementAppUC5.convert(1, LengthUC5.LengthUnit.FEET, LengthUC5.LengthUnit.INCHES);
        assertEquals(12, r);
    }
}