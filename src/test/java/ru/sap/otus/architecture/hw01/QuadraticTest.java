package ru.sap.otus.architecture.hw01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticTest {

    @Test
    public void noSolvesTest() {
        // уравнение x^2+1 = 0
        double a = 1;
        double b = 0;
        double c = 1;

        List<Double> solves = Quadratic.solve(a, b, c);
        assert solves != null;
        assertTrue(solves.isEmpty());
    }
}