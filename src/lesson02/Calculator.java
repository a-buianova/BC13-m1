package lesson02;

public class Calculator {
    public static void main(String[] args) {
        helloLong();
        helloByte();
    }
    public static void helloLong (){
        long a=74567897L;
        long b= 123456789101L;
        long c=56_788_876_543_211_234L;
        long little = 100;
        long sum = a+b+c;
        System.out.println("Здесь должна быть сумма трех очень больших переменных "+sum
        );

    }

    public static void helloByte (){
        byte a=111;
        short b = 1111;
        int c = 1_111_111_111;
        long d = 2_3_4_5_6_7_8_7_9L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    public static void hallyHalloByte (){

    }

}
