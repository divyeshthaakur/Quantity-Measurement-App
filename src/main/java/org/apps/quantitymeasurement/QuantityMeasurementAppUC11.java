package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC11 {

    public static <U extends IMeasurableUC11>
    boolean demonstrateEquality(
            QuantityUC11<U> q1,
            QuantityUC11<U> q2) {

        return q1.equals(q2);
    }

    public static <U extends IMeasurableUC11>
    QuantityUC11<U> demonstrateConversion(
            QuantityUC11<U> q,
            U target) {

        double v = q.convertTo(target);

        return new QuantityUC11<>(v, target);
    }

    public static <U extends IMeasurableUC11>
    QuantityUC11<U> demonstrateAddition(
            QuantityUC11<U> q1,
            QuantityUC11<U> q2) {

        return q1.add(q2);
    }

    public static <U extends IMeasurableUC11>
    QuantityUC11<U> demonstrateAddition(
            QuantityUC11<U> q1,
            QuantityUC11<U> q2,
            U target) {

        return q1.add(q2, target);
    }

    public static void main(String[] args) {

        QuantityUC11<VolumeUnitUC11> v1 =
                new QuantityUC11<>(1.0,
                        VolumeUnitUC11.LITRE);

        QuantityUC11<VolumeUnitUC11> v2 =
                new QuantityUC11<>(1000.0,
                        VolumeUnitUC11.MILLILITRE);

        System.out.println(
                demonstrateEquality(v1, v2)
        );
    }
}