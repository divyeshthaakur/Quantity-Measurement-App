package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.app.quantitymeasurement.model.*;
import com.app.quantitymeasurement.repository.QuantityMeasurementRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

    private final QuantityMeasurementRepository repo;

    public QuantityMeasurementServiceImpl(QuantityMeasurementRepository repo) {
        this.repo = repo;
    }

    @Override
    public QuantityMeasurementDTO compare(QuantityDTO q1, QuantityDTO q2) {

        QuantityMeasurementDTO res = new QuantityMeasurementDTO();
        res.setOperation("COMPARE");

        try {
            double v1 = toBase(q1);
            double v2 = toBase(q2);

            res.setResultString(String.valueOf(Double.compare(v1, v2) == 0));
        } catch (Exception e) {
            res.setError(true);
            res.setErrorMessage(e.getMessage());
        }

        save(res);
        return res;
    }

    @Override
    public QuantityMeasurementDTO convert(QuantityDTO q1, QuantityDTO target) {

        QuantityMeasurementDTO res = new QuantityMeasurementDTO();
        res.setOperation("CONVERT");

        double base = toBase(q1);
        double result = fromBase(base, target);

        res.setResultValue(result);
        res.setResultUnit(target.getUnit());

        save(res);
        return res;
    }

    @Override
    public QuantityMeasurementDTO add(QuantityDTO q1, QuantityDTO q2) {

        QuantityMeasurementDTO res = new QuantityMeasurementDTO();
        res.setOperation("ADD");

        res.setResultValue(toBase(q1) + toBase(q2));

        save(res);
        return res;
    }

    @Override
    public QuantityMeasurementDTO divide(QuantityDTO q1, QuantityDTO q2) {

        QuantityMeasurementDTO res = new QuantityMeasurementDTO();
        res.setOperation("DIVIDE");

        double v2 = toBase(q2);

        if (v2 == 0) {
            throw new ArithmeticException("Divide by zero");
        }

        res.setResultValue(toBase(q1) / v2);

        save(res);
        return res;
    }

    // ================= DB =================

    private void save(QuantityMeasurementDTO dto) {
        QuantityMeasurementEntity e = new QuantityMeasurementEntity();
        e.setOperation(dto.getOperation());
        e.setResultValue(dto.getResultValue());
        e.setResultUnit(dto.getResultUnit());
        e.setResultString(dto.getResultString());
        e.setError(dto.isError());
        e.setErrorMessage(dto.getErrorMessage());

        repo.save(e);
    }

    private QuantityMeasurementDTO map(QuantityMeasurementEntity e) {
        return new QuantityMeasurementDTO(
                e.getOperation(),
                e.getResultValue(),
                e.getResultUnit(),
                e.getResultString(),
                e.isError(),
                e.getErrorMessage()
        );
    }

    @Override
    public List<QuantityMeasurementDTO> getHistoryByOperation(String op) {
        return repo.findByOperationIgnoreCase(op).stream().map(this::map).toList();
    }

    @Override
    public List<QuantityMeasurementDTO> getErrorHistory() {
        return repo.findByErrorTrue().stream().map(this::map).toList();
    }

    // ================= LOGIC =================

    private double toBase(QuantityDTO q) {

        if (q.getMeasurementType().equals("LengthUnit")) {
            switch (q.getUnit()) {
                case "INCHES": return q.getValue();
                case "FEET": return q.getValue() * 12;
            }
        }

        if (q.getMeasurementType().equals("TemperatureUnit")) {
            if (q.getUnit().equals("FAHRENHEIT"))
                return (q.getValue() - 32) * 5 / 9;
            return q.getValue();
        }

        throw new IllegalArgumentException("Invalid unit");
    }

    private double fromBase(double base, QuantityDTO target) {

        if (target.getMeasurementType().equals("LengthUnit")) {
            if (target.getUnit().equals("FEET")) return base / 12;
            return base;
        }

        if (target.getMeasurementType().equals("TemperatureUnit")) {
            if (target.getUnit().equals("FAHRENHEIT"))
                return (base * 9 / 5) + 32;
            return base;
        }

        throw new IllegalArgumentException("Invalid target");
    }
}