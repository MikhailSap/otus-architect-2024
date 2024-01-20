package ru.sap.otus.architecture.hw01;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class QuadraticTest {

    @Test
    public void noSolvesTest() {
        // уравнение x^2+1 = 0
        double a = 1;
        double b = 0;
        double c = 1;

        List<Double> solves = Quadratic.solve(a, b, c);
        assertTrue(solves.isEmpty());
    }

    @Test
    public void twoSolvesTest() {
        // уравнение x^2-1 = 0, конри x1=1, x2=-1
        double a = 1;
        double b = 0;
        double c = -1;

        List<Double> solves = Quadratic.solve(a, b, c);
        assertEquals(2, solves.size());
        assertTrue(solves.contains(1D));
        assertTrue(solves.contains(-1D));
    }

    @Test
    public void oneSolvesTest() {
        // уравнение 0.5x^2+0.0001x+0.0000000025 = 0, конри x1 = x2 = -2.928932188134525E-5
        double a = 0.5;
        double b = 0.0001;
        double c = 0.0000000025;

        List<Double> solves = Quadratic.solve(a, b, c);
        assertEquals(1, solves.size());
        assertTrue(solves.contains(-2.928932188134525E-5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalATest() {
        // коэффициент a = 0, ожидаем исключение
        double a = 0;
        double b = 2;
        double c = 1;
        Quadratic.solve(a, b, c);
    }
}