package lesson18;

public class HomeWork18 {
    public static void main(String[] args) {
        homeWork18_1_1(12, 1);
        split();
        homeWork18_1_2(13, 3);
        split();
        homeWork18_2_1(5, 17);
        split();
        homeWork18_2_2(5, 17);
        split();
        homeWork18_3_1(10);
        split();
        homeWork18_3_2(10);
    }

    public static void split() {

        System.out.println("-------------------");
    }

    public static void homeWork18_1_1(int a, int b) {
        int i = 0;
        if (b < 1) {
            return;
        }
        do {
            System.out.println(a);
            i++;
        } while (i < b);
    }

    public static void homeWork18_1_2(int a, int b) {
        int i = 0;
        while (i < b) {
            System.out.println(a);
            i++;
        }
        ;
    }

    public static void homeWork18_2_1(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
    }

    public static void homeWork18_2_2(int a, int b) {
        int i = a;
        if (i < 5) {
            return;
        }
        do {
            System.out.println(i);
            i++;
        } while (i <= b);
    }

    public static void homeWork18_3_1(int line) {
        String star = "*";
        String output = "";
        int i = 0;
        while (i < line) {
            output = output + star;
            System.out.println(output);
            i++;
        }
    }

    public static void homeWork18_3_2(int line) {
        String star = "*";
        String output = "";
        int i = 0;
        if (line < 0) {
            return;
        }
        do {
            output = output + star;
            System.out.println(output);
            i++;
        } while (i < line);

    }
}