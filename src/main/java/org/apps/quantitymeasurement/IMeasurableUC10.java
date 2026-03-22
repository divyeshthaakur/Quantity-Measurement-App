package org.apps.quantitymeasurement;

public interface IMeasurableUC10 {

    public double getConversionFactor();

    public double convertToBaseUnit(double value);

    public double convertFromBaseUnit(double baseValue);

    public static void main(String[] args) {
        System.out.println("IMeasurableUC10 Interface");
    }
}