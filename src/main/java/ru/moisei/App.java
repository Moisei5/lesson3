package ru.moisei;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
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

    public static void mass (String[] args) {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
                System.out.println(Arrays.toString(arr));

    }
}

