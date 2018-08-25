package pl.coderstrust.sort;

/**
 * Created by Adam on 2018-02-15.
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] firstArray = {3, 2, 1, 8, 10};
        int[] secondArray = firstArray.clone();

        nimNumber(secondArray);

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

    }

    public static int[] nimNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                showTable(array, j);
            }

        }
        return array;
    }

    private static void showTable(int[] array, int j) {
        if (array[j - 1] > array[j]) {
            swap(array, j);

        }
    }

    private static void swap(int[] array, int j) {
        int temp;
        temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }
}
