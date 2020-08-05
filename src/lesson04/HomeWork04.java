package lesson04;

public class HomeWork04 {
    public static void main(String[] args) {
        trainingString();
    }

    public static void trainingString() {
        String firstName = "Anastasiia";
        String profession = "fundraiser";
        System.out.println("Тут будет имя, а затем профессия в кавычках:" + firstName + ",\"" + profession + "\"");

        String name = "Anastasiia";
        String secondName = "Buianova";
        String email = "a.a.krotenko@gmail.com";
        String address = "Barnimstr.38";

        System.out.println(" - Имя пользователя: " + name);
        System.out.println(" - Фамилия: " + secondName);
        System.out.println(" - Эл.почта: " + email);
        System.out.println(" - Адрес: " + address);

        String one = "Вход разрешён";
        String newString = one.substring(0, 5)+ "воспрещен";
        System.out.println("Тут будет выражение: " + newString);

        String newOne= "Осторожно, вход воспрещён";
        String title = newOne.toUpperCase();
        System.out.println(title);
    }

}