package lesson12;

public class HomeWork12 {
    public static void main(String[] args) {
        printStars(10);
    }

    public static void printStars(int n) {
        String star = "*";
        String space= " ";
        for (int i = 0; i < n; i++) { //цикл для количества строк
            int border = n - i - 1;
            for (int j = 0; j < border; j++) { //цикл для пробелов
                System.out.print(space); //печать пробелов
            }
            for (int k = border; k < n; k++) { //цикл для звездочек
                System.out.print(star); //печать звездочек
            }

            System.out.println();//вывод с новой строки
        }
    }
}