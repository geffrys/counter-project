package com.geff.nopmocounter.infraestructure.controller;

import org.junit.jupiter.api.Test;

public class HealthCheckControllerTest {
    @Test
    void testGetHealth() {
        HealthCheckController healthCheckController = new HealthCheckController();
        String response = healthCheckController.getHealth();
        assert "OK".equals(response) : "Health check response should be 'OK'";
    }
}
