package org.apps.quantitymeasurement;

public enum VolumeUnitUC11 implements IMeasurableUC11 {

    LITRE(1.0),
    MILLILITRE(0.001),
    GALLON(3.78541);

    private final double conversionFactor;

    VolumeUnitUC11(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public double convertToBaseUnit(double value) {
        return value * conversionFactor;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / conversionFactor;
    }
}