package Leasson8.task1;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {


        int[] numbers = new int[10];
        double[] doubleArray;
        boolean[] booleanArray;

        numbers[5] = 17;

        System.out.println(numbers[5]);
        System.out.println(numbers[3]);

// вывод всех значений
        int[] numbers1 = {4, 3, 9, 6, 7, 15, 17, 3, 4, 0, 9};
        System.out.println("Dlina massiva:  " + numbers1.length);
        System.out.println("Znachenie v yacheike 4: " + numbers1[4]);

        for (int i = 0; i < numbers1.length; i++){
            System.out.print(numbers1[i]);
            if (i < numbers1.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("vivod vseh zncheni v cikle for-each: ");
        for (int value : numbers1){
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Vivod vsex znaheni s pomohi gotovogo mtoda: ");
        System.out.println(Arrays.toString(numbers1));

    }
}
