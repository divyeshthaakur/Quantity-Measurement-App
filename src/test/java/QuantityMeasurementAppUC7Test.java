import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC7Test {

    @Test
    public void addFeetAndInches() {

        LengthUC7 oneFoot =
                new LengthUC7(1, LengthUC7.LengthUnit.FEET);

        LengthUC7 twelveInches =
                new LengthUC7(12, LengthUC7.LengthUnit.INCHES);

        LengthUC7 result =
                QuantityMeasurementAppUC7
                        .demonstrateLengthAddition(
                                oneFoot,
                                twelveInches,
                                LengthUC7.LengthUnit.FEET);

        assertEquals(
                new LengthUC7(2,
                        LengthUC7.LengthUnit.FEET),
                result);
    }

    @Test
    public void addFeetAndInchesTargetInches() {

        LengthUC7 oneFoot =
                new LengthUC7(1,
                        LengthUC7.LengthUnit.FEET);

        LengthUC7 twelveInches =
                new LengthUC7(12,
                        LengthUC7.LengthUnit.INCHES);

        LengthUC7 result =
                QuantityMeasurementAppUC7
                        .demonstrateLengthAddition(
                                oneFoot,
                                twelveInches,
                                LengthUC7.LengthUnit.INCHES);

        assertEquals(
                new LengthUC7(24,
                        LengthUC7.LengthUnit.INCHES),
                result);
    }

    @Test
    public void addYardAndFeetTargetYard() {

        LengthUC7 yard =
                new LengthUC7(1,
                        LengthUC7.LengthUnit.YARDS);

        LengthUC7 threeFeet =
                new LengthUC7(3,
                        LengthUC7.LengthUnit.FEET);

        LengthUC7 result =
                QuantityMeasurementAppUC7
                        .demonstrateLengthAddition(
                                yard,
                                threeFeet,
                                LengthUC7.LengthUnit.YARDS);

        assertEquals(
                new LengthUC7(2,
                        LengthUC7.LengthUnit.YARDS),
                result);
    }

    @Test
    public void addInchesToCentimeters() {

        LengthUC7 inch =
                new LengthUC7(1,
                        LengthUC7.LengthUnit.INCHES);

        LengthUC7 inch2 =
                new LengthUC7(1,
                        LengthUC7.LengthUnit.INCHES);

        LengthUC7 result =
                QuantityMeasurementAppUC7
                        .demonstrateLengthAddition(
                                inch,
                                inch2,
                                LengthUC7.LengthUnit.CENTIMETERS);

        assertEquals(
                new LengthUC7(5.08,
                        LengthUC7.LengthUnit.CENTIMETERS),
                result);
    }
}