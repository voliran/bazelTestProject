package com.example.mylibrary;

public class QuadraticSolver {

    public static double[] solveQE(double a, double b, double c) {

        if (a == 0) {
            throw new IllegalArgumentException("Коэффициент a не может быть равен 0");
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Действительных корней нет");
            return new double[0];
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        }
    }
}
