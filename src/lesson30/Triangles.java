package lesson30;

import sun.security.mscapi.CPublicKey;

public class Triangles {
    public static void main(String[] args) {
        firstTriangle(6);
        secondTriangle1(6);
        secondTriangle2(6);

    }

    private static void firstTriangle(int raw) {
        String space = " ";
        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= raw - i; j++) {
                System.out.print(space);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(i);
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void secondTriangle1(int lines) {
        String space = " ";
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(space);
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void secondTriangle2(int lines) {
        String space = " ";
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines * 2 - 1; j++) {
                int a = Math.abs(lines - j) + 1;
                if (a <= i)
                    System.out.print(a);
                else
                    System.out.print(space);
            }
            System.out.println();
        }

        System.out.println();
    }
}
