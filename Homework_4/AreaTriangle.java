package com.geekbrains.lesson_4.Homework_4;

public class AreaTriangle {
    public static double areaTriangle(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Такой треугольник создать нельзя.");
        }

        if ((a + b) > c || (a + c) > b || (b + c) > a) {
            throw new Exception("Сумма двух сторон треугольника должна быть больше третьей стороны");
        }

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static void main(String[] args) throws Exception {
        areaTriangle(1, 2, 3);
    }
}
