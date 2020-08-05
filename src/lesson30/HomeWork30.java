package lesson30;

public class HomeWork30 {
    public static void main(String[] args) {
        System.out.println(greatestCommonDevisor(17, -7));
        System.out.println(leastCommonMultiple(3, 4));
        printCharArray(charArray(10));
    }

    private static int leastCommonMultiple(int a, int b) {
        return a / greatestCommonDevisor(a, b) * b;
    }

    private static int greatestCommonDevisor(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return greatestCommonDevisor(b, a % b);
    }

    public static char[] charArray(int length) {
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            char newChar = (char) (Math.random() * 65535);
            arr [i]=newChar;
        }
        return arr;
    }

    private static void printCharArray(char[] chars) {
        System.out.println("Массив символов длиной - " + chars.length);
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
        System.out.println();
    }


}
