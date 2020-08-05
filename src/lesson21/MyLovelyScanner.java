package lesson21;

import java.util.Scanner;

public class MyLovelyScanner {
    public static void main(String[] args) {
        //helloUser();
        //ystem.out.print("Hello World");
        //Scanner input=new Scanner(System.in);
        findNumber(100);
    }

    public static void helloUser() {

        String name = "", surname = "", gender = "", email = "";
        int age = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        name = userInput.next();
        System.out.println("Как твоя фамилия?");
        surname = userInput.next();
        System.out.println("Твой пол");
        gender = userInput.next();
        System.out.println("Твоя электронная почта");
        email = userInput.next();
        System.out.println("Твой возраст");
        age = userInput.nextInt();

        System.out.println("Добро пожаловать на сайт" + name);
        System.out.println("Проверьте свои данные: " + name + surname + gender + email + age);
    }

    public static void findNumber(int n) {
        int userNumber = 0;
        int number = (int) (Math.random() * ((n - 1) + 1)) + 1;
        System.out.println(number);

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter max ties");
        int tries = userInput.nextInt();
        for (int i = 1; i <= tries; i++) {
            System.out.println(i + "попытка");
            userNumber = userInput.nextInt();
            if (number == userNumber) {
                System.out.println("Вы угадали! УРА!");
                return;
            }
            if (number > userNumber) {
                System.out.println("Не угадали. Загаданное число больше");
            } else {
                System.out.println("Не угадали. Загаданное число меньше");
            }
        }
        System.out.println("Попытки закончились");
    }
}