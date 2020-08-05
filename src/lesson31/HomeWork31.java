package lesson31;

public class HomeWork31 {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
        System.out.println("Reverse");
        printArray(reverse3(b1));
        printArray(reverse3(b2));
        printArray(reverse3(b3));

        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        System.out.println("middleWay");

        printArray(middleWay(mc1, mc2));
        printArray(middleWay(kc1, kc2));
        printArray(middleWay(nc1, nc2));
        System.out.println("middleWayAverage");

        printArray(middleWayAverage(mc1, mc2));
        printArray(middleWayAverage(kc1, kc2));
        printArray(middleWayAverage(nc1, nc2));


    }

    public static void printArray(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int i : arrayToPrint) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] reverse3(int[] b) {
        return new int[]{b[2], b[1], b[0]};
    }
//ssh-keygen -t rsa -b 4096 -C "a.a.krotenko@gmail.com"
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static int[] middleWayAverage(int[] a, int[] b) {
        return new int[]{findAverage(a), findAverage(b)};
    }

    private static int findAverage(int[] inputArray) {
        int sum = 0;
        for (int i : inputArray) {
            sum = sum + i;
        }
        return sum / inputArray.length;
    }
}