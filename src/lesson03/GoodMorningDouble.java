package lesson03;

public class GoodMorningDouble {
    public static void main(String[] args) {
helloDouble();
findSquareCircle();
helloDoubleTwo();
    }

    public static void helloFloat() {
        float a, b, c, d, e, f, g;
        a = (float) 3.5;
        b = 5.4F;
        c = 11.11f;
        d = a + b + c;
        f = 10.0f;
    }

    public static void helloDouble() {
      double a,b,c;
      int d,e,f;

      d=10; //у меня есть 10 евро.
      f=1000; //а айфон стоит 1000 евро.

      //сколько айфоном я могу купить за 10 евро

        e=d/f;

        System.out.println("Количество купленных айфонов "+e);

        a=10.0; //10 евро и ноль центов.
        b=20.0; //20 евро стоит 1 кг черешни.
        c=a/b;//количество черешни, которое я могу себе позволить

        System.out.println("Количество черешни, которое я куплю "+c);

    }
    public static void findSquareCircle (){
        final double PI=3.14;
        final double minTemp = 18;
        final double maxTemp = 26;

        double r = 10;
        double square =PI*r*r;
        double anotherSquare= Math.PI*Math.pow(r,2);
        double anotherPI=Math.PI;
        System.out.println("Площадь круга от Java = "+ anotherSquare);
        System.out.println("Площадь, посчитанная руками = "+ square);

    }

    public static void helloDoubleTwo(){
        double a=10;
        double b=5;
        double c=Math.pow (b,a);
        System.out.println("Вроде как 5 в степени 10"+c);
    }
}
