package ru.geekbrains.LessonOneToFour;

import java.util.Random;
import java.util.Scanner;

public class MainLesson3 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int answer;
        int max = 10;
        do {
            int secret = random.nextInt(max);
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println(" Please enter a number between 0 and " + (max - 1));

                int userNumber = sc.nextInt();
                if (userNumber > secret) {
                    System.out.println(" userNumber > secret ");
                }
                if (userNumber < secret) {
                    System.out.printf(" userNumber < secret ");
                }
                if (userNumber == secret) {
                    guess = true;
                    break;
                }
            }

            if (guess) {
                System.out.printf(" You guess! " + secret);
            } else {
                System.out.println(" You can not guess, number is" + secret);
            }

            System.out.println(" Repeat ? Yes - 1");
            answer = sc.nextInt();
        }
        while (answer == 1);
        System.out.println(" Bye ");
    }
}

