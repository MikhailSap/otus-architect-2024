package ru.sap.otus.architecture.hw01;

import java.util.List;

import static java.util.Collections.emptyList;

public class Quadratic {
    public static List<Double> solve(double a, double b, double c) {
        double disc = scoreD(a, b, c);
        if (disc < 0) {
            return emptyList();
        }

        return null;
    }

    private static double scoreD(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}
