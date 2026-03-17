package org.apps.quantitymeasurement;

public class QuantityMeasurementAppUC2 {
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double toInches() {
            return value * 12;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null) return false;

            if (obj instanceof Feet) {
                Feet other = (Feet) obj;
                return this.value == other.value;
            }

            if (obj instanceof Inches) {
                Inches other = (Inches) obj;
                return this.toInches() == other.value;
            }

            return false;
        }
    }

    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        public double toFeet() {
            return value / 12;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null) return false;

            if (obj instanceof Inches) {
                Inches other = (Inches) obj;
                return this.value == other.value;
            }

            if (obj instanceof Feet) {
                Feet other = (Feet) obj;
                return this.value == other.toInches();
            }

            return false;
        }
    }
    public static void demonstrateFeetEquality() {

        Feet f1 = new Feet(1);
        Feet f2 = new Feet(1);

        System.out.println("Feet equality: " + f1.equals(f2));
    }

    public static void demonstrateInchesEquality() {

        Inches i1 = new Inches(12);
        Feet f1 = new Feet(1);

        System.out.println("Inches & Feet equality: " + i1.equals(f1));
    }

    public static void main(String[] args) {

        demonstrateFeetEquality();
        demonstrateInchesEquality();

    }
}
