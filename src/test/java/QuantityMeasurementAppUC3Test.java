import org.apps.quantitymeasurement.Length;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class QuantityMeasurementAppUC3Test {

    @Test
    public void testFeetEquality() {
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(1, Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testInchesEquality() {
        Length inches1 = new Length(1, Length.LengthUnit.INCHES);
        Length inches2 = new Length(1, Length.LengthUnit.INCHES);
        assertTrue(inches1.equals(inches2));
    }


    @Test
    public void testFeetInchesComparison() {
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(12, Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testFeetInequality() {
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(2, Length.LengthUnit.FEET);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testInchesInequality() {
        Length l1 = new Length(1, Length.LengthUnit.INCHES);
        Length l2 = new Length(2, Length.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testCrossUnitInequality() {
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(10, Length.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testMultipleFeetComparison() {
        Length l1 = new Length(2, Length.LengthUnit.FEET);
        Length l2 = new Length(24, Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }
}