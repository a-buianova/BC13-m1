package lesson02;

import java.math.BigInteger;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №2 Integer.");
        firstTask();
        findSquare();
        secondTask();
        findRectangle();
        thirdTask();
        findCube();
        forthTask();
        findGrains();
    }

    public static void firstTask() {
        System.out.println("1. Найти площадь и периметр квадрата");
    }

    public static void findSquare() {
        byte a = 11;
        byte square = (byte) (a * a);
        byte perimeter = (byte) (4 * a);
        System.out.println("Площадь квадрата =" + square);
        System.out.println("Периметр квадрата=" + perimeter);
    }

    public static void secondTask() {
        System.out.println("2. Найти площадь и периметр прямоугольника");
    }

    public static void findRectangle() {
        short a = 15;
        short b = 8;
        short square = (short) (a * b);
        short perimeter = (short) ((a + b) * 2);
        System.out.println("Площадь прямоугольника = " + square);
        System.out.println("Периметр прямоугольника = " + perimeter);
    }

    public static void thirdTask() {
        System.out.println("3. Найти площадь и периметр куба");
    }

    public static void findCube() {
        int a = 5_000;
        int square = (a * a) * 6;
        int perimeter = a * 12;
        System.out.println("Площадь куба = " + square);
        System.out.println("Периметр куба = " + perimeter);
    }

    public static void forthTask() {
        System.out.println("4. Найти количество зёрен на шахматной доске, если на первую клетку положить одно зёрнышко, на вторую клетку два зёрнышка, на третью в два раза больше, чем на предыдущей, то есть четыре и так далее");

        //количество зерен на доске это 2 в 64 степени -1+1, что равно 18 446 744 073 709 551 616 зёрен. А максимальное значение Long 9 223 372 036 854 775 807. Значение больше long, значит нужно расширение.
    }

    public static void findGrains() {
        BigInteger integer = new BigInteger("18446744073709551616");
        System.out.println("Количество зерен = " + integer);

    }


}