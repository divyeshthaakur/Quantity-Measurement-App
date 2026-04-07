package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.model.QuantityDTO;
import com.app.quantitymeasurement.model.QuantityMeasurementDTO;

import java.util.List;

public interface IQuantityMeasurementService {

    QuantityMeasurementDTO compare(QuantityDTO q1, QuantityDTO q2);
    QuantityMeasurementDTO convert(QuantityDTO q1, QuantityDTO target);
    QuantityMeasurementDTO add(QuantityDTO q1, QuantityDTO q2);
    QuantityMeasurementDTO divide(QuantityDTO q1, QuantityDTO q2);

    List<QuantityMeasurementDTO> getHistoryByOperation(String op);
    List<QuantityMeasurementDTO> getErrorHistory();
}