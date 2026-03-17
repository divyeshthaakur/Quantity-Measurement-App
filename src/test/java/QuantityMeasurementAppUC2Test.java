import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apps.quantitymeasurement.QuantityMeasurementAppUC2.Feet;
import org.apps.quantitymeasurement.QuantityMeasurementAppUC2.Inches;
public class QuantityMeasurementAppUC2Test {

    @Test
    void givenSameFeet_ShouldReturnTrue() {
        Feet f1 = new Feet(1);
        Feet f2 = new Feet(1);
        assertTrue(f1.equals(f2));
    }


    @Test
    void givenDifferentFeet_ShouldReturnFalse() {

        Feet f1 = new Feet(1);
        Feet f2 = new Feet(2);
        assertFalse(f1.equals(f2));
    }


    @Test
    void givenSameInches_ShouldReturnTrue() {

        Inches i1 = new Inches(12);
        Inches i2 = new Inches(12);
        assertTrue(i1.equals(i2));
    }


    @Test
    void givenFeetAndInchesEqual_ShouldReturnTrue() {

        Feet f1 = new Feet(1);
        Inches i1 = new Inches(12);
        assertTrue(f1.equals(i1));
    }


    @Test
    void givenFeetAndInchesNotEqual_ShouldReturnFalse() {

        Feet f1 = new Feet(1);

        Inches i1 = new Inches(10);

        assertFalse(f1.equals(i1));
    }
}