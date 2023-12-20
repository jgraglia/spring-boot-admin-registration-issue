package com.netceler.admin;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class CustomHealthComponent implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("foo11", "bar").withDetail("tags", Set.of("A11", "B11")).build();
    }
}