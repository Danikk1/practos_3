
package org.example;
import java.util.Scanner;

class Analizator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа через пробел (a, b и c):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isRightTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (isEquilateralTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (!isTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        }
    }

    // Проверка на прямоугольный треугольник по теореме Пифагора
    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
    }

    // Проверка на равнобедренный треугольник
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    // Проверка на равносторонний треугольник
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    // Проверка есть ли такой треугольник
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}
