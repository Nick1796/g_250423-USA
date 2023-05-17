package Lesson5.task2;

public class NestedIfTest {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 5;

        if (a < b) {
            System.out.println("A smoll, them B");

            if (a < c) {
            System.out.println( "and a smoll, them C");
        }

        }
    }
}
