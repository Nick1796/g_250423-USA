package Lesson9.task1;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {


        Random random = new Random();

        for (int i = 0; i < 30; i++) ;
        {

            int randomNumber = random.nextInt(201) - 100;
            System.out.println(randomNumber + " ");
        }
    }
}


