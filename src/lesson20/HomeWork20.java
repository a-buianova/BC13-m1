package lesson20;

public class HomeWork20 {
    public static void main(String[] args) {
        System.out.println(citySundayWeather("Саратов"));
        split();
        System.out.println(cityWeather("Женева", "Среда"));
        System.out.println(cityWeather("Париж", "Пятница"));
    }

    public static void split() {

        System.out.println("-------------------");
    }

    public static int citySundayWeather(String city) {
        int mondayDegree = 0;
        switch (city) {
            case "Берлин":
                mondayDegree = 20;
                break;
            case "Лондон":
                mondayDegree = 17;
                break;
            case "Лиссабон":
                mondayDegree = 25;
                break;
            case "Париж":
                mondayDegree = 23;
                break;
            case "Москва":
                mondayDegree = 19;
                break;
            case "Минск":
                mondayDegree = 18;
                break;
            case "Саратов":
                mondayDegree = 15;
                break;

            default:
                System.out.println("Нет данных для города " + city + " Введите другой город");
                return 0;

        }
        return mondayDegree + 6;
    }


    public static int cityWeather(String city, String day) {
        int mondayDegree = 0;
        switch (city) {
            case "Берлин":
                mondayDegree = 20;
                break;
            case "Лондон":
                mondayDegree = 17;
                break;
            case "Лиссабон":
                mondayDegree = 25;
                break;
            case "Париж":
                mondayDegree = 23;
                break;
            case "Москва":
                mondayDegree = 19;
                break;
            case "Минск":
                mondayDegree = 18;
                break;
            case "Саратов":
                mondayDegree = 15;
                break;
            default:
                System.out.println("Нет данных для города " + city + ". Введите другой город");
                return 0;
        }
        switch (day) {
            case "Понедельник":
                return mondayDegree;
            case "Вторник":
                return mondayDegree + 1;
            case "Среда":
                return mondayDegree + 2;
            case "Четверг":
                return mondayDegree + 3;
            case "Пятница":
                return mondayDegree + 4;
            case "Суббота":
                return mondayDegree + 5;
            case "Воскресенье":
                return mondayDegree + 6;
            default:
                System.out.println("Нет такого дня " + day + " Повторите ввод!");
        }
        return 0;
    }
}
