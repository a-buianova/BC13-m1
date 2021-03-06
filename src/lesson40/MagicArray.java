package lesson40;

import java.util.Arrays;

public class MagicArray {
    public static void main(String[] args) {
        int[] myArray = createArray(10);
        System.out.println(Arrays.toString(myArray));
        int[] sortArray = getMeSortArray(myArray);
        System.out.println(Arrays.toString(sortArray));
        int[] sortArray2 = bubbleSort(myArray);
        System.out.println(Arrays.toString(sortArray2));

    }

    private static int[] getMeSortArray(int[] myArray) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return myArray;
    }

    public static int[] bubbleSort(int[] myArray) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    count++;
                }
            }
        }
        return myArray;
    }


    public static int[] createArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }


}
