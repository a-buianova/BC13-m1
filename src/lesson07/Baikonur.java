package lesson07;

public class Baikonur {
    public static void main(String[] args) {
        double shuttleSpeed1 = 5.2;
        double shuttleSpeed2 = 15.1;

        shuttleStart(shuttleSpeed1);
        shuttleStart(shuttleSpeed2);

    }

    public static void shuttleStart(double speed) {
        final double SUPERCONSTANT_G = 10;
if (speed < SUPERCONSTANT_G){
    System.out.println("Первоначальное ускорение недостаточно");
    System.out.println("Ракета не может стартовать");
}
else {
    System.out.println("Ракета улетает в космос");
}
    }
}
