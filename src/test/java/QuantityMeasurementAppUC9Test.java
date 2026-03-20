import org.apps.quantitymeasurement.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppUC9Test {

    @Test
    public void kilogramEquals1000Grams() {

        WeightUC9 w1 =
                new WeightUC9(
                        1,
                        WeightUnitUC9.KILOGRAM
                );

        WeightUC9 w2 =
                new WeightUC9(
                        1000,
                        WeightUnitUC9.GRAM
                );

        assertEquals(w1, w2);
    }

    @Test
    public void poundEquals453Point592Grams() {

        WeightUC9 w1 =
                new WeightUC9(
                        1,
                        WeightUnitUC9.POUND
                );

        WeightUC9 w2 =
                new WeightUC9(
                        453.592,
                        WeightUnitUC9.GRAM
                );

        assertEquals(w1, w2);
    }

    @Test
    public void additionOfWeightsEqualsExpected() {

        WeightUC9 w1 =
                new WeightUC9(
                        1,
                        WeightUnitUC9.KILOGRAM
                );

        WeightUC9 w2 =
                new WeightUC9(
                        1000,
                        WeightUnitUC9.GRAM
                );

        WeightUC9 result =
                w1.add(w2);

        assertEquals(
                new WeightUC9(
                        2,
                        WeightUnitUC9.KILOGRAM
                ),
                result
        );
    }
}