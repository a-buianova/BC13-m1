package lesson03;

public class MagicDouble {
    public static void main(String[] args) {
        int min=30;
        int max=100;
        int result0= (int) (Math.random()* ((max-min)+1))+min;
        int result1= (int) (Math.random()* ((max-min)+1))+min;
        int result2= (int) (Math.random()* ((max-min)+1))+min;
        int result3= (int) (Math.random()* ((max-min)+1))+min;
        int result4= (int) (Math.random()* ((max-min)+1))+min;
        int result5= (int) (Math.random()* ((max-min)+1))+min;
        System.out.println(result0);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
