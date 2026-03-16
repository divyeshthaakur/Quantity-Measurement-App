import org.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        Feet f = new Feet(12.0);
        Feet f1 = new Feet(12.0);
        assertEquals(f, f1);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet f = new Feet(12.0);
        Feet f1 = new Feet(13.0);
        assertNotEquals(f, f1);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet f = new Feet(12.0);
        Feet f1 = null;
        assertNotEquals(f, f1);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        Feet f = new Feet(12.0);
        String str = "12";
        assertNotEquals(f, str);
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet f = new Feet(12.0);
        assertEquals(f, f);
    }
}