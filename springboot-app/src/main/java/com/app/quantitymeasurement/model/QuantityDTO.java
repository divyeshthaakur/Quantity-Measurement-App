package com.app.quantitymeasurement.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuantityDTO {
    private double value;
    private String unit;
    private String measurementType;
}