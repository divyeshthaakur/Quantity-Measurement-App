package org.apps.quantitymeasurement;

public interface IMeasurableUC11 {

    double getConversionFactor();

    double convertToBaseUnit(double value);

    double convertFromBaseUnit(double baseValue);
}