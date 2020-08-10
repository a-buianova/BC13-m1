package lesson33;

import lesson31.HomeWork31;
import lesson32.HomeWork32;

public class HomeWork33 {
    public static void main(String[] args) {
        int[] a1 = new int[]{4, 5, 6};//[0, 0, 0, 0, 0, 6]
        int[] a2 = new int[]{1, 2};//[0, 0, 0, 2]
        int[] a3 = new int[]{3};//[0, 3]
        HomeWork31.printArray(makeLast(a1));
        HomeWork31.printArray(makeLast(a2));
        HomeWork31.printArray(makeLast(a3));
        HomeWork32.split();
        int[] mb1 = new int[]{1, 2, 3};
        int[] mb2 = new int[]{1, 3};
        int[] kb1 = new int[]{7, 2, 3};
        int[] kb2 = new int[]{1};
        int[] nb1 = new int[]{1, 2};
        int[] nb2 = new int[0];
        System.out.println(start1(mb1, mb2));// →2
        System.out.println(start1(kb1, kb2));// →1
        System.out.println(start1(nb1, nb2));// →1
        HomeWork32.split();
        int[] mc1 = new int[]{1, 2};
        int[] mc2 = new int[]{3, 4};
        int[] kc1 = new int[]{4, 4};
        int[] kc2 = new int[]{2, 2};
        int[] nc1 = new int[]{9, 2};
        int[] nc2 = new int[]{3, 4};
        HomeWork31.printArray(plusTwo(mc1, mc2));//[1, 2, 3, 4]
        HomeWork31.printArray(plusTwo(kc1, kc2));//[4, 4, 2, 2]
        HomeWork31.printArray(plusTwo(nc1, nc2));//[9, 2, 3, 4]
        HomeWork32.split();
        int[] c1 = new int[]{1, 2, 3};//3
        int[] c2 = new int[]{1, 5, 3};//5
        int[] c3 = new int[]{5, 2, 3};//5
        System.out.println(maxTriple(c1));
        System.out.println(maxTriple(c2));
        System.out.println(maxTriple(c3));
        HomeWork32.split();
        int[] md1 = new int[]{4, 5};
        int[] md2 = new int[]{1, 2, 3};
        int[] kd1 = new int[]{4};
        int[] kd2 = new int[]{1, 2, 3};
        int[] nd1 = new int[0];
        int[] nd2 = new int[]{1, 2};
        HomeWork31.printArray(make2(md1, md2));//[4,5]
        HomeWork31.printArray(make2(kd1, kd2));//[4, 1]
        HomeWork31.printArray(make2(nd1, nd2));//[1, 2]
        HomeWork32.split();
        HomeWork31.printArray(makePi());
        HomeWork32.split();
        int[] d1 = new int[]{1, 2, 3};//[2, 3, 1]
        int[] d2 = new int[]{5, 11, 9};//[11, 9, 5]
        int[] d3 = new int[]{7, 0, 0};//[0, 0, 7]
        HomeWork31.printArray(rotateLeft3(d1));
        HomeWork31.printArray(rotateLeft3(d2));
        HomeWork31.printArray(rotateLeft3(d3));
        HomeWork32.split();
        int[] e1 = new int[]{1, 2, 3};//3
        int[] e2 = new int[]{1, 1};//2
        int[] e3 = new int[]{1, 1, 1, 1};//2
        System.out.println(sum2(e1));
        System.out.println(sum2(e2));
        System.out.println(sum2(e3));
        HomeWork32.split();
        int[] f1 = new int[]{2, 5};//true
        int[] f2 = new int[]{4, 3};//true
        int[] f3 = new int[]{4, 5};//false
        System.out.println(has23(f1));
        System.out.println(has23(f2));
        System.out.println(has23(f3));
        HomeWork32.split();
        int[] g1 = new int[]{2, 2};//true
        int[] g2 = new int[]{3, 3};//true
        int[] g3 = new int[]{2, 3};//false
        System.out.println(double23(g1));
        System.out.println(double23(g2));
        System.out.println(double23(g3));
        HomeWork32.split();
        int[] h1 = new int[]{1, 2};
        int[] h2 = new int[]{3, 4};
        int[] h3 = new int[]{1, 1};
        HomeWork31.printArray(biggerTwo(h1, h2));//[3,4]
        HomeWork31.printArray(biggerTwo(h2, h1));//[3,4]
        HomeWork31.printArray(biggerTwo(h3, h1));//[1,2]
        HomeWork32.split();
        int[] j1 = new int[]{1, 2, 3, 4};//[4, 2, 3, 1]
        int[] j2 = new int[]{1, 2, 3};//[3, 2, 1]
        int[] j3 = new int[]{8, 6, 7, 9, 5};//[5, 6, 7, 9, 8]
        HomeWork31.printArray(swapEnds(j1));
        HomeWork31.printArray(swapEnds(j2));
        HomeWork31.printArray(swapEnds(j3));
        HomeWork32.split();
        int[] k1 = new int[]{1, 2, 3};//[1,2]
        int[] k2 = new int[]{1, 2};//[1,2]
        int[] k3 = new int[]{1};//[1]
        HomeWork31.printArray(frontPiece(k1));
        HomeWork31.printArray(frontPiece(k2));
        HomeWork31.printArray(frontPiece(k3));
        HomeWork32.split();
        int[] me1 = new int[]{1, 2, 3};
        int[] me2 = new int[]{7, 9, 8};
        int[] ke1 = new int[]{1};
        int[] ke2 = new int[]{2};
        int[] ne1 = new int[]{1, 7};
        int[] ne2 = new int[0];
        HomeWork31.printArray(front11(me1, me2));//[1,7]
        HomeWork31.printArray(front11(ke1, ke2));//[1,2]
        HomeWork31.printArray(front11(ne1, ne2));//[1]
    }

    public static int[] makeLast(int[] array) {
        int[] result = new int[2 * array.length];
        result[result.length - 1] = array[array.length - 1];
        return result;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1)
            count++;
        if (b.length > 0 && b[0] == 1)
            count++;
        return count;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static int maxTriple(int[] input) {
        int mid = input.length / 2;
        int end = input.length - 1;
        int max = input[0];
        if (input[mid] > max) max = input[mid];
        if (input[end] > max) max = input[end];
        return max;
    }

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length == 0) {
            result[0] = b[0];
            result[1] = b[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = a[0];
            result[1] = a[1];
        }
        return result;
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static int[] rotateLeft3(int[] input) {
        return new int[]{input[1], input[2], input[0]};
    }

    public static int sum2(int[] array) {
        if (array.length == 0)
            return 0;
        if (array.length == 1)
            return array[0];
        return array[0] + array[1];
    }

    public static boolean has23(int[] input) {
        for (int value : input) {
            if (value == 2 || value == 3)
                return true;
        }
        return false;
    }

    public static boolean double23(int[] array) {
        int countTwo = 0;
        int countThree = 0;
        for (int value : array) {
            if (value == 2)
                countTwo++;
            if (value == 3)
                countThree++;
        }
        return countTwo == 2 || countThree == 2;
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] < b[0] + b[1])
            return b;
        return a;
    }

    public static int[] swapEnds(int[] input) {
        int first = input[0];
        int last = input[input.length - 1];
        input[0] = last;
        input[input.length - 1] = first;
        return input;
    }

    public static int[] frontPiece(int[] array) {
        if (array.length <= 1)
            return array;
        return new int[]{array[0], array[1]};
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return a;
        }
        if (a.length >= 1 && b.length == 0) {
            return new int[]{a[0]};
        }
        if (a.length >= 1) {
            return new int[]{a[0], b[0]};
        }
        return new int[]{b[0]};
    }
}