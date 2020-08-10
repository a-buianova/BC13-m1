package lesson36;

import java.util.Arrays;

public class HomeWork36 {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(cyrillic()));
        System.out.println(Arrays.toString(cyrillic2()));

    }

    public static char[] cyrillic() {
        //    char[] output=new char[64];
        //  for (char i = 'А'; i <= 'я'; i++) {
        //    output[i-'А']=i;
        //}
        char[] a = new char[64];
        for (int i = 0; i < 64; i++) {
            a[i] = (char) ('А' + i);
        }


        return a;
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