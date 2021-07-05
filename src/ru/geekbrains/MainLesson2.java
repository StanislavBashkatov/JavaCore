package ru.geekbrains;

import java.util.Arrays;

public class MainLesson2 {


    public static void main(String[] args) {

        printArray(factoryArr(8));
    }


    //      int[] arr = {1, 0, 0, 0, 1, 0, 1, 1, 0, 0};
    //       {
    //          for (int i = 0; i < arr.length; i++) {
    //               arr[i] = 1 - arr[i];

    //          }


    //   int[] arr = new int[8];
    //  for (int i = 0; i < arr.length; i++) {
    //     arr[i] = i * 3;
    //  }

    // System.out.println(Arrays.toString(arr));


    //      int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    //    for (int i = 0; i < arr.length; i++) {
    //        if (arr[i] < 6) {
    //          arr[i] *= 2;
    //      }

    //   }
    //   System.out.println(Arrays.toString(arr));

    public static int[][] factoryArr(int n) {

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    arr[i][j] = 1;

                }

            }
        }

        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

    }

}





