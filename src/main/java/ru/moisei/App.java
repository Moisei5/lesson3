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
        System.out.println(Arrays.toString(refund(2, 40)));
        searchMinMax();
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
    //0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
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

    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    //значениями 1 2 3 4 5 6 7 8 … 100;
    public static void massOrder() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    //умножить на 2;
    public static void multiplyNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    //(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    //диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
    //[1][1], [2][2], …, [n][n];
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

    //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    //одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] refund(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }
        return arr;
    }

    //* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void searchMinMax() {
        int[] arr = {1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}


