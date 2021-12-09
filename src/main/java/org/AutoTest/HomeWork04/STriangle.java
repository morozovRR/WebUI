package org.AutoTest.HomeWork04;

public class STriangle {
    public static double areaOfATriangle(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) throw new Exception();
        double inputData = (a + b + c) / 2;
        return Math.sqrt(inputData * (inputData - a) * (inputData - b) * (inputData - c));
    }
}
