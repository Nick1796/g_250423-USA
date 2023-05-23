package Lesson3.HomeWork;

import java.util.Scanner;

public class HWScanner {

    public static void main(String[] args) {

        System.out.println("Введите 2 слова с четным кол-вом букв: ");
        Scanner scanner = new Scanner(System.in);
        String world = scanner.nextLine();
        String world1 = scanner.nextLine();
        System.out.println("Вы ввели слово: "+world);
        System.out.println("Вы ввели слово: "+world1);

        if (world.length() % 2 !=0 || world.length() % 2 !=0) {
            System.out.println("не корректные данные: ");

        }

        int s = world.length() / 2;
        int s1 = world.length() /2;



      //  System.out.println("Первая половина слова: " + world.substring(0, s));
       // System.out.println("Вторая половина слова: " + world1.substring(s1));

        System.out.println(world.substring(0, s) + world1.substring(s1));









    }
}
