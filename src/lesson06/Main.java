package lesson06;

public class Main {

    public static void main(String[] args) {
       boolean knowledge,freeWorkSpace,myNewJob;
       knowledge = true;
       freeWorkSpace=false;
       myNewJob =knowledge&freeWorkSpace;
        System.out.println(myNewJob);

        boolean permissionMother, permissionFather, walkingBoy;
        permissionFather=true;
        permissionMother=false;
        walkingBoy=permissionFather | permissionMother;
        System.out.println(walkingBoy);
    }

    public static void review1() {
        int i = 1;
        byte b;
        short s;
        long l;
        int money = 10;
        int iphone = 1000;
        int devision = money / iphone;
        System.out.println(devision);
        double mld = 3.14;
        System.out.println(10.0 / 1000);
        System.out.println(Math.sqrt(mld));
        float muFloat = 45.9f;
    }
    public static void review2(){
        String s = "Мой пример строкового значения";
        System.out.println("Привет мир" + s);
        int dlina = s.length();
        String myNewString = s.substring(0, 15);

        char c1 = '0';
        char c2 = 115;
        char c3 = '\u0440';
        System.out.println(""+c1+c2+c3);
    }
}