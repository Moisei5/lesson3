package ru.moisei;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {  // это первая гед и чего сделать?
        onezero();
        massOrder();
        multiplyNumbers();
        diagMass();
        System.out.println(Arrays.toString(refund(2,40)));
        searchMinMax();
    }

    public static void onezero() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = arr;
        {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] == 0) {
                arr2[i] = 1;
            } else {
                if (arr2[i] == 1) {
                    arr2[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));

    }

    public static void massOrder() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagMass() {
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr[i].length - i - 1)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] refund(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }
        return arr;
    }
    public static void searchMinMax(){
        int[] arr = {1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ){
                max = arr[i];
            }
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}


