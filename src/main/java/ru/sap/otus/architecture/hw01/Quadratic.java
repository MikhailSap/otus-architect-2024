package ru.sap.otus.architecture.hw01;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class Quadratic {
    private final static double EPSILON = 0.00000001;

    public static List<Double> solve(double a, double b, double c) {
        if (Math.abs(a) < EPSILON) {
            throw new IllegalArgumentException("Коэффициент a не может быть равен 0");
        }

        List<Double> solves = new ArrayList<>();
        double disc = scoreD(a, b, c);
        if (disc < 0) {
            return emptyList();
        }

        if (disc >= EPSILON) {
            solves.add(scoreSolve(b, Math.sqrt(disc), a));
            solves.add(scoreSolve(b, -Math.sqrt(disc), a));
        }

        // тут брать модуль не имеет смысла т. к. в этот иф могут попасть только положительные числа
        if (disc < EPSILON) {
            solves.add(scoreSolve(b, Math.sqrt(disc), a));
        }

        return solves;
    }

    private static double scoreD(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private static double scoreSolve(double b, double sqrtDisc, double a) {
        return (-b + sqrtDisc) / (2 * a);
    }
}
