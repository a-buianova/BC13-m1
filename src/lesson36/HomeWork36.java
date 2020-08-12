package lesson36;

import java.util.Arrays;
import java.util.Random;

public class HomeWork36 {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(cyrillic0()));
        //System.out.println("--------------");
        System.out.println(Arrays.toString(cyrillic1()));
        System.out.println("--------------");
        System.out.println(Arrays.toString(cyrillic2()));
        System.out.println("--------------");
        System.out.println(Arrays.toString(mixSymbols1(cyrillic2())));
        System.out.println("--------------");
        System.out.println(Arrays.toString(mixSymbols2(cyrillic2())));
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
        char[] array = new char[66];
        char c = 'А';
        for (int i = 0; i < 66; i++) {
            if (i == 6) {
                array[i] = 'Ё';
            } else if (i == 39) {
                array[i] = 'ё';
            } else {
                array[i] = c++;
            }
        }
        return array;
    }

    public static char[] mixSymbols1(char[] input) {
        int size = input.length;
        char[] output = new char[size];
        int i = 0;
        while (i < size) {
            int randomIndex = (int) (Math.random() * size);
            if (input[randomIndex] != 0 && input[randomIndex] != i) {
                output[i] = input[randomIndex];
                input[randomIndex] = 0;
                i++;
            }
        }
        return output;
    }

    public static char[] mixSymbols2(char[] input) {
        for (int i = 0; i < input.length; i++) {
            int randomIndex = (int) (Math.random() * input.length);
            char temp = input[i];
            input[i] = input[randomIndex];
            input[randomIndex] = temp;
        }
        return input;
    }
}