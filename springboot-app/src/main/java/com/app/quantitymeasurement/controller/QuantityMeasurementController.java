package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.model.*;
import com.app.quantitymeasurement.service.IQuantityMeasurementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quantities")
public class QuantityMeasurementController {

    private final IQuantityMeasurementService service;

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    @PostMapping("/compare")
    public ResponseEntity<?> compare(@RequestBody QuantityInputDTO input) {
        return ResponseEntity.ok(service.compare(
                input.getThisQuantityDTO(),
                input.getThatQuantityDTO()));
    }

    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestBody QuantityInputDTO input) {
        return ResponseEntity.ok(service.divide(
                input.getThisQuantityDTO(),
                input.getThatQuantityDTO()));
    }

    @GetMapping("/history/operation/{op}")
    public ResponseEntity<?> history(@PathVariable String op) {
        return ResponseEntity.ok(service.getHistoryByOperation(op));
    }
}