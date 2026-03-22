import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTestUC10 {

    @Test
    public void lengthFeetEqualsInches() {

        QuantityUC10<LengthUnitUC10> feet =
                new QuantityUC10<>(1.0, LengthUnitUC10.FEET);

        QuantityUC10<LengthUnitUC10> inches =
                new QuantityUC10<>(12.0, LengthUnitUC10.INCHES);

        assertTrue(feet.equals(inches));
    }

    @Test
    public void lengthYardsEqualsFeet() {

        QuantityUC10<LengthUnitUC10> yard =
                new QuantityUC10<>(1.0, LengthUnitUC10.YARDS);

        QuantityUC10<LengthUnitUC10> feet =
                new QuantityUC10<>(3.0, LengthUnitUC10.FEET);

        assertTrue(yard.equals(feet));
    }

    @Test
    public void weightKilogramEqualsGrams() {

        QuantityUC10<WeightUnitUC10> kg =
                new QuantityUC10<>(1.0, WeightUnitUC10.KILOGRAM);

        QuantityUC10<WeightUnitUC10> g =
                new QuantityUC10<>(1000.0, WeightUnitUC10.GRAM);

        assertTrue(kg.equals(g));
    }

    @Test
    public void weightPoundEqualsGrams() {

        QuantityUC10<WeightUnitUC10> pound =
                new QuantityUC10<>(1.0, WeightUnitUC10.POUND);

        QuantityUC10<WeightUnitUC10> grams =
                new QuantityUC10<>(453.592, WeightUnitUC10.GRAM);

        assertTrue(pound.equals(grams));
    }

    @Test
    public void convertLengthFeetToInches() {

        QuantityUC10<LengthUnitUC10> feet =
                new QuantityUC10<>(1.0, LengthUnitUC10.FEET);

        double result =
                feet.convertTo(LengthUnitUC10.INCHES);

        assertEquals(12.0, result);
    }

    @Test
    public void convertWeightKgToGrams() {

        QuantityUC10<WeightUnitUC10> kg =
                new QuantityUC10<>(1.0, WeightUnitUC10.KILOGRAM);

        double result =
                kg.convertTo(WeightUnitUC10.GRAM);

        assertEquals(1000.0, result);
    }

    @Test
    public void addLengthFeetAndInches() {

        QuantityUC10<LengthUnitUC10> feet =
                new QuantityUC10<>(1.0, LengthUnitUC10.FEET);

        QuantityUC10<LengthUnitUC10> inches =
                new QuantityUC10<>(12.0, LengthUnitUC10.INCHES);

        QuantityUC10<LengthUnitUC10> result =
                feet.add(inches, LengthUnitUC10.FEET);

        assertEquals(2.0, result.getValue());
    }

    @Test
    public void addWeightKgAndGrams() {

        QuantityUC10<WeightUnitUC10> kg =
                new QuantityUC10<>(1.0, WeightUnitUC10.KILOGRAM);

        QuantityUC10<WeightUnitUC10> g =
                new QuantityUC10<>(1000.0, WeightUnitUC10.GRAM);

        QuantityUC10<WeightUnitUC10> result =
                kg.add(g, WeightUnitUC10.KILOGRAM);

        assertEquals(2.0, result.getValue());
    }

    @Test
    public void preventCrossTypeComparisonLengthVsWeight() {

        QuantityUC10<LengthUnitUC10> length =
                new QuantityUC10<>(1.0, LengthUnitUC10.FEET);

        QuantityUC10<WeightUnitUC10> weight =
                new QuantityUC10<>(1.0, WeightUnitUC10.KILOGRAM);

        assertFalse(length.equals(weight));
    }

    @Test
    public void preventCrossTypeAdditionLengthVsWeight() {

        QuantityUC10<LengthUnitUC10> length =
                new QuantityUC10<>(1.0, LengthUnitUC10.FEET);

        QuantityUC10<WeightUnitUC10> weight =
                new QuantityUC10<>(1.0, WeightUnitUC10.KILOGRAM);

        assertNotEquals(length, weight);
    }

    @Test
    public void addLengthYardsAndFeet() {

        QuantityUC10<LengthUnitUC10> yard =
                new QuantityUC10<>(1.0, LengthUnitUC10.YARDS);

        QuantityUC10<LengthUnitUC10> feet =
                new QuantityUC10<>(3.0, LengthUnitUC10.FEET);

        QuantityUC10<LengthUnitUC10> result =
                yard.add(feet, LengthUnitUC10.YARDS);

        assertEquals(2.0, result.getValue());
    }

    @Test
    public void addWeightTonnesAndKg() {

        QuantityUC10<WeightUnitUC10> tonne =
                new QuantityUC10<>(1.0, WeightUnitUC10.TONNE);

        QuantityUC10<WeightUnitUC10> kg =
                new QuantityUC10<>(1000.0, WeightUnitUC10.KILOGRAM);

        QuantityUC10<WeightUnitUC10> result =
                tonne.add(kg, WeightUnitUC10.TONNE);

        assertEquals(2.0, result.getValue());
    }

    @Test
    public void convertLengthYardsToInches() {

        QuantityUC10<LengthUnitUC10> yard =
                new QuantityUC10<>(1.0, LengthUnitUC10.YARDS);

        double result =
                yard.convertTo(LengthUnitUC10.INCHES);

        assertEquals(36.0, result);
    }

}