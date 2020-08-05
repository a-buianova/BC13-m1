package lesson13;

public class HomeWork13 {
    public static void main(String[] args) {
        findNumber();
        split();
        System.out.println(year(15));
        split();
        System.out.println(evenNumber(19));
        split();
        System.out.println(primeNumber(15));
        split();
        System.out.println(leapYear(2000));
    }

    public static void split() {

        System.out.println("-------------------");
    }

    public static void findNumber() {
        for (int i = 1; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44)
                System.out.println(i);

        }
    }

    public static boolean year(int year) {

        return year % 4 == 0;
    }

    public static boolean evenNumber(int number) {

        return number % 2 == 0;
    }

    public static boolean primeNumber(int n) {
        //Простые числа - это числа, которые делятся на 1 и на само себя без остатка. Например: 1, 2, 3, 5, 7, 11, 13, 17, 19 и т.д.
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean leapYear(int year) {

        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}