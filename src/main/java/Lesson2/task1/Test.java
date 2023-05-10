package Lesson2.task1;

import jdk.dynalink.beans.StaticClass;

public class Test {
    public static void main(String[] args) {


     Tiger bigTiger;
     bigTiger = new Tiger();
    System.out.println(bigTiger.weight);

     bigTiger.weight = 150;

     Tiger smallTiger = new Tiger ();
     smallTiger.weight = 100;

     System.out.println(bigTiger.weight);
     System.out.println(smallTiger.weight);

     bigTiger.sleep();
     smallTiger.sleep();
     System.out.println(Tiger.LegsCount);


    }
}
