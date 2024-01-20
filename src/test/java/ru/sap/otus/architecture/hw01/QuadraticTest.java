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
        // уравнение x^2+2x+1 = 0, конри x1 = x2 = -1
        double a = 1;
        double b = 2;
        double c = 1;

        List<Double> solves = Quadratic.solve(a, b, c);
        assertEquals(1, solves.size());
        assertTrue(solves.contains(-1D));
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