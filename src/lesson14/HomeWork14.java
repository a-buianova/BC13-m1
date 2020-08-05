package lesson14;

public class HomeWork14 {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
        split();
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
        split();
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
        split();
        findSum(123);
        findSum(768);
    }

    public static void split() {

        System.out.println("-------------------");
    }

    public static String minCat(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        if (lengthA == lengthB)
            return a + b;
        if (lengthA > lengthB) {
            int diff = lengthA - lengthB;
            return a.substring(diff, lengthA) + b;
        } else {
            int diff = lengthB - lengthA;
            return a + b.substring(diff, lengthB);
        }

    }

    public static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            output += str.charAt(i);
            output += str.charAt(i);
        }
        return output;
    }


    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c)
            return 0;
        if (a == b)
            return c;
        if (b == c)
            return a;
        if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }

    public static void findSum(int number) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + (number % 10);
            number /= 10;
        }
        System.out.println("Сумма: " + sum);
    }

}

