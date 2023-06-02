package Lesson8.task1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite hoslo");
        int input = scanner.nextInt();
        int sum = 0;
        int currentDigit;

        while (input > 0) {
             currentDigit = input % 10;


            sum = sum += currentDigit;
            input = input / 10;
        }
        System.out.println("Symma vsex cifr hisla ravna: " + sum);
    }

    }

