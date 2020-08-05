package lesson03;

public class HomeWork03 {
    public static void main(String[] args) {
        findSquareCircle();
        findCircumference();
        findEuroCost();
        areaRatio();
        areaDifference();
        findFinalSum();
    }

    public static void findSquareCircle() {

        final double PI = 3.14;
        double r = 56;
        double square = Math.PI * Math.pow(r, 2);
        System.out.println("1.Площадь круга = " + square);
    }

    public static void findCircumference() {
        final double PI = 3.14;
        double r = 12;
        double circumference = Math.PI * r * 2;
        System.out.println("2.Длина окружности = " + circumference);
    }

    public static void findEuroCost() {
        float exchangeRate = 1.1F;
        float euroCost = 1 / exchangeRate;
        System.out.println("3.Стоимость евро =" + euroCost);
    }

    public static void areaRatio() {
        int Belarus = 207_595;
        int Ukraine = 603_628;
        double areaRatio = (double) Belarus / Ukraine;
        System.out.println("4.Cоотношение площади Беларуси к площади Украины =" + areaRatio);
    }

    public static void areaDifference() {
        int Moscow = 2_511;
        float Berlin = 891.8F;
        float areaDifference = Moscow / Berlin;
        System.out.println("5.Москва больше Берлина в " + areaDifference + " раз");
    }

    public static void findFinalSum () {

        double money = 1_000;
        double percent = 3.5;
        double multiplier = 1 + percent / 100;
        double sum01 = money * multiplier;
        double sum02 = sum01 * multiplier;
        double sum03 = sum02 * multiplier;
        double sum04 = sum03 * multiplier;
        double sum05 = sum04 * multiplier;
        double sum06 = sum05 * multiplier;
        double sum07 = sum06 * multiplier;
        double finalSum=money*7*0.035+money;

        System.out.println("6.Через 7 лет клиент получит " + sum07 +" евро");
        System.out.println("6.Еще один вариант " + finalSum + " евро");}
}
