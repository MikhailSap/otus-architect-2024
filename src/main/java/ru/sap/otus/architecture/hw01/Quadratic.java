package ru.sap.otus.architecture.hw01;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class Quadratic {
    public static List<Double> solve(double a, double b, double c) {
        List<Double> solves = new ArrayList<>();
        double disc = scoreD(a, b, c);
        if (disc < 0) {
            return emptyList();
        }

        if (disc > 0) {
            solves.add(scoreSolve(b, Math.sqrt(disc), a));
            solves.add(scoreSolve(b, -Math.sqrt(disc), a));
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
