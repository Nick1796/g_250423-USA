package Lesson12.Task1;

import Leasson8.task2.Cat;

public class StringTest {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Cat cat1 = new Cat (3, "Black");
        Cat cat2 = new Cat( 3, "Black");
        Cat cat3 = cat1;


        System.out.println(cat1 == cat2);
        System.out.println(cat1 == cat3);


        System.out.println(cat1.equals(cat2));

        String word1 = "Hello";
        String word2 = "Hello";

        System.out.println("Sravnenie obiektov ctrok po ix znaheniem");

        System.out.println(word1 == word2);

        System.out.println("sravnenie obiektov strok po ssilke");
        System.out.println(word1 == word2);

        cat3.setAge(7);
        System.out.println(cat1.getAge());
        System.out.println(cat2.getAge());




        word2 = word2 + "!!";

        System.out.println(word2);
        System.out.println(word1);




    }


}
