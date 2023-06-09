package Lesson11;

import java.util.Arrays;

public class Maain {


    public static void main(String[] args) {

        int[] array =  {2, 9, 1, 0, 12, 15, 8, 7, 21, 17, 4, 0, 9, 11, 14, 15};

        System.out.println("rezultat lineinogo poiska: "+ SearchUtils.LinearSeach(array, 15));


        System.out.println();

        System.out.println("icxodny massiv");

        System.out.println(Arrays.toString(array));



       // Arrays.sort(array);
        // SortWUtils.bubbleSort(array);
       // SortWUtils.insertionSort(array);
        SortWUtils.selectionSort(array);




        System.out.println("otsartirovanyi massiv");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("resultat dvoihnogo poiska: " +SearchUtils.binarySearch(array, 15));

        System.out.println();


        System.out.println("Resultat poiska jump: " +SearchUtils.jumpSearch(array, 15));





    }
}
