package Lesson3.HomeWork;

import java.util.Scanner;

public class HWScanner {

    public static void main(String[] args) {

        System.out.println("Введите 2 слова с четным кол-вом букв: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Вы ввели слово: "+s);

        System.out.println("Первая половина слова: " + s.substring(0,2));
        System.out.println("Вторая половина слова: " + s.substring(2,4));






    }
}
