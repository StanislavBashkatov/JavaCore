package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class MainLesson4 {
    static final int SIZE = 7;

    static final char DOT_X = 'X';
    static final char DOT_0 = '0';
    static final char DOT_EMPTY = '-';

    static char[][] map;


    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++)
                    map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i+1);
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i+1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();

        }

    }

}