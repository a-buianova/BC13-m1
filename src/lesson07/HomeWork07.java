package lesson07;

public class HomeWork07 {
    public static void main(String[] args) {
        firstTask();
    }

    public static void firstTask() {
        //Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        // при езде до 50 км/час нарушений нет;
        // за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        // за превышение скорости от 16 км/час — 40 евро штрафа;
        // за езду от 100 км/час до 130 км/час — штраф 500 евро;
        // и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства.


        System.out.println(speedLimits(45));
        System.out.println(speedLimits(55));
        System.out.println(speedLimits(69));
        System.out.println(speedLimits(80));
        System.out.println(speedLimits(110));
        System.out.println(speedLimits(300));

        System.out.println(waysOfViking1(2));

    }

    public static String speedLimits(int speed) {
        if (speed <= 50) {
            return "Нарушений нет";
        } else if (speed <=65) {
            return "Устное порицание и лекция на 5 минут";
        } else if (speed <100) {
            return "40 евро штраф";
        } else if (speed <= 130) {
            return "штраф 500 евро";
        } else {
            return "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        }
    }
    public static String waysOfViking1 (int way){
        String result ="";
        if (way ==1) {
            result = "коня потеряешь";
        }  else if (way==2) {
            result = "жизнь потеряешь";
        } else if (way ==3) {
            result = "счастье обретешь";
        }
    return result;
    }

}