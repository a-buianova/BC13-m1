package lesson10;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println(startHi("h"));
        System.out.println(Teen(20, 20, 10));
    }

    public static boolean startHi(String str) {
        // Given a string, return true if the string starts with "hi" and false otherwise
        if (str.length() < 2) return false;
        String twoChar = str.substring(0, 2);
        return twoChar.equals("hi");
    }

    public static boolean Teen(int a, int b, int c) {
        // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them areteen.
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }
}
