package lesson06;

public class HomeWork06 {
    public static void main(String[] args) {
        firstTask1();
        split();
        firstTask2();
        split();
        secondTask();

    }

    public static void split() {
        System.out.println("-------------------");
    }

    public static void firstTask1() {
        int age = 45;
        String buy = sell(age);
        System.out.println(buy);

    }

    public static String sell(int age) {
        if (age >= 18) {
            return "Продажа разрешена";
        } else {
            return "Продажа запрещена";
        }
    }

    public static void firstTask2() {
        int age = 45;
        String buy = buyAlcohol(age);
        System.out.println(buy);

    }

    public static String buyAlcohol(int age) {

        String buy = "";
        switch (age) {
            case 10:
            case 17:
                buy = "Продажа запрещена";
                break;
            case 18:
            case 20:
            case 30:
                buy = "Спасибо за покупку";
                break;

            default:
                System.out.println("Предъявите паспорт, пожалуйста!");
                break;
        }
        return buy;
    }

    public static void secondTask() {
        int month = 13;
        String season = findSeason(month);
        System.out.println(season);
    }

    public static String findSeason(int month) {
        String season = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;

            default:
                System.out.println("Повторите, пожалуйста ввод: " + month + ". В году всего 12 месяцев!");
                break;
        }
        return season;
    }

}