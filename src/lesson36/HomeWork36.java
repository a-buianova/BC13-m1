package lesson36;

import java.util.Arrays;

public class HomeWork36 {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(cyrillic0()));
        //System.out.println("--------------");
        System.out.println(Arrays.toString(cyrillic1()));
        System.out.println("--------------");
        System.out.println(Arrays.toString(cyrillic2()));

    }

    public static char[] cyrillic0() {
        char[] array = new char[64];
        for (int i = 0; i < 64; i++) {
            array[i] = (char) ('А' + i);
        }

        return array;
    }

    public static char[] cyrillic1() {
        char[] output = new char[64];
        for (char i = 'А'; i <= 'я'; i++) {
            output[i - 'А'] = i;
        }
        return output;
    }

    public static char[] cyrillic2() {
        char[] a = new char[66];
        char c = 'А';
        for (int i = 0; i < 66; i++) {
            if (i == 6) {
                a[i] = 'Ё';
            } else if (i == 39) {
                a[i] = 'ё';
            } else {
                a[i] = c++;
            }
        }
        return a;
    }
}