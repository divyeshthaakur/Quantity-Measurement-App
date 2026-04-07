package com.app.quantitymeasurement.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuantityMeasurementDTO {

    private String operation;

    private double resultValue;
    private String resultUnit;
    private String resultMeasurementType;

    private String resultString;   // for compare (true/false)

    private boolean error;
    private String errorMessage;
}