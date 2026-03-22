package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC12 {

    public static <U extends IMeasurableUC12>
    boolean demonstrateEquality(
            QuantityUC12<U> q1,
            QuantityUC12<U> q2) {

        return q1.equals(q2);
    }

    public static <U extends IMeasurableUC12>
    QuantityUC12<U> demonstrateAddition(
            QuantityUC12<U> q1,
            QuantityUC12<U> q2) {

        return q1.add(q2);
    }

    public static <U extends IMeasurableUC12>
    QuantityUC12<U> demonstrateSubtraction(
            QuantityUC12<U> q1,
            QuantityUC12<U> q2) {

        return q1.subtract(q2);
    }

    public static <U extends IMeasurableUC12>
    double demonstrateDivision(
            QuantityUC12<U> q1,
            QuantityUC12<U> q2) {

        return q1.divide(q2);
    }
}