package lesson38;

public class HomeWork38 {
    public static void main(String[] args) {

        int[] a1 = new int[]{2, 1, 2, 3, 4};//3
        int[] a2 = new int[]{2, 2, 0};//3
        int[] a3 = new int[]{1, 3, 5};//0
        System.out.println(countEvens(a1));
        System.out.println(countEvens(a2));
        System.out.println(countEvens(a3));
        System.out.println("-----------------");
        int[] b1 = new int[]{1, 2, 1, 1, 3};//4
        int[] b2 = new int[]{1, 4, 2, 1, 4, 1, 4};//6
        int[] b3 = new int[]{1, 4, 2, 1, 4, 4, 4};//6
        System.out.println(maxSpan(b1));
        System.out.println(maxSpan(b2));
        System.out.println(maxSpan(b3));
    }

    public static int maxSpan(int[] array) {
        int span = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    int dif = j - i + 1;
                    span = Math.max(dif, span);
                }
            }
        }
        return span;
    }


    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                count++;
        return count;
    }
}
