package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC9 {

    public static boolean demonstrateWeightEquality(
            WeightUC9 w1,
            WeightUC9 w2
    ) {
        return w1.equals(w2);
    }

    public static boolean demonstrateWeightComparison(
            double v1,
            WeightUnitUC9 u1,
            double v2,
            WeightUnitUC9 u2
    ) {

        WeightUC9 w1 = new WeightUC9(v1, u1);
        WeightUC9 w2 = new WeightUC9(v2, u2);

        return w1.equals(w2);
    }

    public static WeightUC9 demonstrateWeightConversion(
            double value,
            WeightUnitUC9 from,
            WeightUnitUC9 to
    ) {

        WeightUC9 w = new WeightUC9(value, from);

        return w.convertTo(to);
    }

    public static WeightUC9 demonstrateWeightAddition(
            WeightUC9 w1,
            WeightUC9 w2
    ) {

        return w1.add(w2);
    }

    public static WeightUC9 demonstrateWeightAddition(
            WeightUC9 w1,
            WeightUC9 w2,
            WeightUnitUC9 target
    ) {

        return w1.add(w2, target);
    }

}