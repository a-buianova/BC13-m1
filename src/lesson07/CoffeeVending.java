package lesson07;

public class CoffeeVending {
    public static void main(String[] args) {
        int customerChoose1=11;
        int customerChoose2=12;
        int customerChoose3=13;
        int customerChoose4=14;
        int customerChoose5=144;
        coffeeSwitch(customerChoose1);
        coffeeSwitch(customerChoose2);
        coffeeSwitch(customerChoose3);
        coffeeSwitch(customerChoose4);
        coffeeSwitch(customerChoose5);
    }

public static void coffeeSwitch (int customerValue) {
    String result = "";
    switch (customerValue) {
        case 11:
            CoffeeRecipes.americano();
            break;
        case 12:
            CoffeeRecipes.cappuccino();
            break;
        case 13:
            CoffeeRecipes.hotWatter();
            break;
        case 14:
            CoffeeRecipes.latte();
            break;
        default:
            System.out.println("Извините, временно недоступно");
    }
}
}