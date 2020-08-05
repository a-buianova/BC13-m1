package lesson21;

import java.util.Scanner;

public class HomeWork21 {
    public static void main(String[] args) {
        game();
        split();
        passGenerator();
    }

    public static void split (){
        System.out.println("---------------------------------");
    }

    public static void game() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Установите максимальный диапазон, например 100");
        int range = userInput.nextInt();

        int number = randomIntFromOneToMaxInclusive(range);
        System.out.println("Установите количество попыток");
        int tries = userInput.nextInt();
        int userNumber = 0;
        boolean checkWin=false;
        for (int i = 1; i <= tries; i++) {
            System.out.println("Попытка № " + i);
            userNumber = userInput.nextInt();
            if (number == userNumber) {
                System.out.println("Вы угадали! УРА!");
                break;
            }
            if (number > userNumber) {
                System.out.println("Не угадали. Загаданное число больше");
            } else {
                System.out.println("Не угадали. Загаданное число меньше");
            }
        }
        System.out.println("Попытки закончились. Загаданное число " + number + ". Давайте еще поиграем!");
    }

    public static int randomIntFromOneToMaxInclusive(int max) {
        return (int) (Math.random() * max) + 1;
    }

    public static void passGenerator() {

        System.out.println("Задайте длину пароля");
        Scanner input = new Scanner(System.in);
        int passLength = input.nextInt();
        if (passLength<1){
            System.out.println("Ошибка! Введите число больше 0.");
            return;
        }
        System.out.println("Какие символы должны быть в пароле? Только буквы (1) или буквы и цифры (2)?");
        int userChose = input.nextInt();
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = lower.toUpperCase();
        String digits = "0123456789";
        String symbols;
        if (userChose == 1) {
            symbols = lower + upper;
        } else if (userChose==2){
            symbols = digits + lower + upper;
        } else {
            System.out.println("Неправильный ввод. Введите 1 или 2!");
            return;
        }
        String result = generatePass(passLength, symbols);
        System.out.println("Ваш новый пароль: \n" + result);
    }

    public static String generatePass(int length, String symbols) {
        String result = "";
        for (int i = 0; i < length; i++) {
            int index = randomIntFromOneToMaxInclusive(symbols.length()) - 1;
            result += symbols.charAt(index);
        }
        return result;
    }
}