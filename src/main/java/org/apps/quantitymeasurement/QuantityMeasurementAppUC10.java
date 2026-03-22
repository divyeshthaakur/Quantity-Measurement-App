package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC10 {

    public static <U extends IMeasurableUC10> boolean demonstrateEquality(
            QuantityUC10<U> q1,
            QuantityUC10<U> q2) {

        return q1.equals(q2);
    }

    public static <U extends IMeasurableUC10> QuantityUC10<U> demonstrateConversion(
            QuantityUC10<U> q,
            U target) {

        double val = q.convertTo(target);
        return new QuantityUC10<>(val, target);
    }

    public static <U extends IMeasurableUC10> QuantityUC10<U> demonstrateAddition(
            QuantityUC10<U> q1,
            QuantityUC10<U> q2) {

        return q1.add(q2);
    }

    public static <U extends IMeasurableUC10> QuantityUC10<U> demonstrateAddition(
            QuantityUC10<U> q1,
            QuantityUC10<U> q2,
            U target) {

        return q1.add(q2, target);
    }

    public static void main(String[] args) {

        QuantityUC10<WeightUnitUC10> w1 =
                new QuantityUC10<>(1000, WeightUnitUC10.GRAM);

        QuantityUC10<WeightUnitUC10> w2 =
                new QuantityUC10<>(1, WeightUnitUC10.KILOGRAM);

        System.out.println(demonstrateEquality(w1, w2));
    }
}
