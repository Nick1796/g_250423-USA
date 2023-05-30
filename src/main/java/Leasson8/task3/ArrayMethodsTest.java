package Leasson8.task3;

import java.util.Arrays;

public class ArrayMethodsTest {

    public static void main(String[] args) {

        int[] sourse = {8, 2, 7, 1, 8, 2, 6, 5, 4, 0, 9};
        int [ ] target = sourse.clone();
        System.out.println("sourse: " + Arrays.toString(sourse));
        System.out.println("target: "+ Arrays.toString(target));

        int [] numbers = Arrays.copyOf(sourse, 5);
        System.out.println(Arrays.toString(numbers));

        int [ ] numbers1 = Arrays.copyOfRange(sourse, 4,8);
        System.out.println(Arrays.toString(numbers1));

        Arrays.sort(sourse);
        System.out.println(Arrays.toString(sourse));
    }
}
