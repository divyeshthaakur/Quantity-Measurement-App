
import apps.quantitymeasurement.LengthUC4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC4Test {
    @Test
    public void testFeetEquality() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        LengthUC4 l2 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testInchesEquality() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.INCHES);
        LengthUC4 l2 = new LengthUC4(1, LengthUC4.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testFeetInchesComparison() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        LengthUC4 l2 = new LengthUC4(12, LengthUC4.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void testFeetInequality() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        LengthUC4 l2 = new LengthUC4(2, LengthUC4.LengthUnit.FEET);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testInchesInequality() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.INCHES);
        LengthUC4 l2 = new LengthUC4(2, LengthUC4.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testCrossUnitInequality() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        LengthUC4 l2 = new LengthUC4(10, LengthUC4.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void testMultipleFeetComparison() {
        LengthUC4 l1 = new LengthUC4(2, LengthUC4.LengthUnit.FEET);
        LengthUC4 l2 = new LengthUC4(24, LengthUC4.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void yardEquals36Inches() {

        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.YARDS);
        LengthUC4 l2 = new LengthUC4(36, LengthUC4.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void centimeterEquals39Point3701Inches() {

        LengthUC4 l1 = new LengthUC4(100, LengthUC4.LengthUnit.CENTIMETERS);
        LengthUC4 l2 = new LengthUC4(39.3701, LengthUC4.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void threeFeetEqualsOneYard() {

        LengthUC4 l1 = new LengthUC4(3, LengthUC4.LengthUnit.FEET);
        LengthUC4 l2 = new LengthUC4(1, LengthUC4.LengthUnit.YARDS);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void thirtyPoint48CmEqualsOneFoot() {
        LengthUC4 l1 = new LengthUC4(30.48, LengthUC4.LengthUnit.CENTIMETERS);
        LengthUC4 l2 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }


    @Test
    public void yardNotEqualToInches() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.YARDS);
        LengthUC4 l2 = new LengthUC4(10, LengthUC4.LengthUnit.INCHES);
        assertFalse(l1.equals(l2));
    }


    @Test
    public void referenceEqualitySameObject() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        assertTrue(l1.equals(l1));
    }


    @Test
    public void equalsReturnsFalseForNull() {
        LengthUC4 l1 = new LengthUC4(1, LengthUC4.LengthUnit.FEET);
        assertFalse(l1.equals(null));
    }


    @Test
    public void reflexiveSymmetricAndTransitiveProperty() {
        LengthUC4 a = new LengthUC4(1, LengthUC4.LengthUnit.YARDS);
        LengthUC4 b = new LengthUC4(3, LengthUC4.LengthUnit.FEET);
        LengthUC4 c = new LengthUC4(36, LengthUC4.LengthUnit.INCHES);
        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }


    @Test
    public void differentValuesSameUnitNotEqual() {
        LengthUC4 l1 = new LengthUC4(2, LengthUC4.LengthUnit.YARDS);
        LengthUC4 l2 = new LengthUC4(3, LengthUC4.LengthUnit.YARDS);
        assertFalse(l1.equals(l2));
    }
}