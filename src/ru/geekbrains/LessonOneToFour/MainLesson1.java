package ru.geekbrains.LessonOneToFour;

import java.time.Year;

public class MainLesson1{

    public static void main(String[] args) {
        System.out.println(calc(1, 2, 4, 4));
        System.out.println("Hello World");
        System.out.println(number(12, 3));
        System.out.println(numberFull(-1));
        hello("Anton");
        theYear(9);
        int a = 1;
        char b = 'b';
        byte c = 127;
        boolean d = true;
        long e = 7788992L;
        float f = 3.33f;
        double g = 4.55;
    }

    public static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean number(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static boolean numberFull(int a) {
        return a > 0;
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);

    }

    public static void theYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");

    }
}