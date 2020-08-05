package lesson15;

public class HoneWork15 {
    public static void main(String[] args) {
        contains();
        split();
        endsWith();
        split();
        equals();
        split();
        equalsIgnoreCase();
        split();
        isEmpty();
        split();
        length();
        split();
        replace();
        split();
        startWith();
        split();
        substringExample();
        split();
        toLowerCase();
        split();
        toUpperCase();
        split();
        trim();
    }

    public static void split() {

        System.out.println("-------------------");
    }

    public static void contains() {
        String str0 = "Java string contains If else Example";
        if (str0.contains("Example")) {
            System.out.println("The Keyword :example: is found in given string");
        } else {
            System.out.println("The Keyword :example: is not found in the string");
        }

    }

    public static void endsWith() {
        String str1 = "Example";
        if (str1.endsWith("le")) {
            System.out.println("Слово заканчивается на le");
        } else {
            System.out.println("Плохое слово");
        }

    }

    public static void equals() {
        String str2 = "Example";
        String str3 = "Examples";
        if (str2.equals(str3)) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки не совпадают");
        }
    }

    public static void equalsIgnoreCase() {
        String str2 = "ExAmPlE";
        String str3 = "example";
        if (str2.equalsIgnoreCase(str3)) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки не совпадают");
        }

    }

    public static void isEmpty() {
        String str4 = "";
        String str5 = "example";
        System.out.println(str4.isEmpty());
        System.out.println(str5.isEmpty());
    }

    public static void length() {
        String str6 = "example";
        System.out.println(str6.length());
    }

    public static void replace() {
        String str7 = "Ensure";
        System.out.println(str7.replace("E", "I"));
    }

    public static void startWith() {
        String str8 = "Example";
        if (str8.startsWith("Ex")) {
            System.out.println("Слово начинается на Ex");
        } else {
            System.out.println("Плохое слово");
        }
    }

    public static void substringExample() {
        String str9 = "Ensure";
        System.out.println(str9.substring(2));
    }

    public static void toLowerCase() {
        String str10 = "ExAmPlE";
        System.out.println(str10.toLowerCase());
    }

    public static void toUpperCase() {
        String str11 = "ExAmPlE";
        System.out.println(str11.toUpperCase());

    }
    public static void trim() {
        String str12 = "   Ensure   ";
        System.out.println(str12.trim());
    }


}

