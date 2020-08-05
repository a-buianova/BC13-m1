package lesson13;

public class Exercises {
    public static void main(String[] args) {
        multiplicationTable();

    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println("");
        }
    }
}
