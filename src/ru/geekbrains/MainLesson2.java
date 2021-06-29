package ru.geekbrains;

import java.util.Arrays;

public class MainLesson2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0, 1, 1, 0, 0};
        {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1 - arr[i];

            }
            System.out.println(Arrays.toString(arr));
        }

    }
}

