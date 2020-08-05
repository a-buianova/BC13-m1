package lesson24;

public class HomeWork24 {
    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0));//10
        System.out.println(blueTicket(9, 2, 0));//0
        System.out.println(blueTicket(6, 1, 4));//10
        System.out.println(blueTicket(13, 7, 3));//5
        split();
        System.out.println(dateFashion(5, 10));//2
        System.out.println(dateFashion(5, 2));//0
        System.out.println(dateFashion(5, 5));//1
        split();
        System.out.println(sortaSum(3, 4));//7
        System.out.println(sortaSum(9, 4));//20
        System.out.println(sortaSum(10, 11));//21
    }

    private static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else
            return sum;
    }

    private static int dateFashion(int date, int you) {
        if ((you >= 8 || date >= 8) && you > 2 && date > 2) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == bc + 10 || ab == ac + 10) {
            return 5;
        } else if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }
        return 0;


    }

    public static void split() {

        System.out.println("-------------------");
    }

}
