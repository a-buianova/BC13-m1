package lesson32;

import lesson31.BooleanArray;
import lesson31.HomeWork31;

public class HomeWork32 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5};//2,3,4
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};//7,5,3
        int[] a3 = new int[]{1, 2, 3};//1,2,3
        HomeWork31.printArray(midThree(a1));
        HomeWork31.printArray(midThree(a2));
        HomeWork31.printArray(midThree(a3));
        split();
        int[] b1 = new int[]{1, 3, 4, 5};//true
        int[] b2 = new int[]{2, 1, 3, 4, 5};//true
        int[] b3 = new int[]{1, 1, 1};//false
        System.out.println(unlucky1(b1));
        System.out.println(unlucky1(b2));
        System.out.println(unlucky1(b3));
        split();
        int[] c1 = new int[]{1, 2, 3};//false
        int[] c2 = new int[]{1, 2, 3, 1};//true
        int[] c3 = new int[]{1, 2, 1};//true
        System.out.println(sameFirstLast(c1));
        System.out.println(sameFirstLast(c2));
        System.out.println(sameFirstLast(c3));
        split();
        int[] d1 = new int[]{1, 2, 3};//6
        int[] d2 = new int[]{5, 11, 2};//18
        int[] d3 = new int[]{7, 0, 0};//7
        System.out.println(sum3(d1));
        System.out.println(sum3(d2));
        System.out.println(sum3(d3));

    }

    public static int[] midThree(int[] array) {
        int mid = array.length / 2;
        return new int[]{array[mid - 1], array[mid], array[mid + 1]};
    }

    public static boolean unlucky1(int[] input) {
        if (input.length < 2) return false;
        return (input[0] == 1 && input[1] == 3) ||
                (input[1] == 1 && input[2] == 3) ||
                (input[input.length - 2] == 1 && input[input.length - 1] == 3);
    }

    public static boolean sameFirstLast(int[] array) {
        return array.length >= 1 && array[0] == array[array.length - 1];
    }

    public static int sum3(int[] input) {
        return input[0] + input[1] + input[2];
    }

    public static void split() {

        System.out.println("-------------------");
    }
}
