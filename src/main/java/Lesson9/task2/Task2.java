package Lesson9.task2;

public class Task2 {


    //Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.

    //  Пример 1:

    //  Вход:
    //  N = 4, K = 6
    //  arr[] = {1, 5, 7, 1}
    //   Вывод: 2
    //   Объяснение:
    //   arr[0] + arr[1] = 1 + 5 = 6
    //  arr[1] + arr[3] = 5 + 1 = 6.

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 3, 2, 7, 4};
        System.out.println(getNumberOfPairs(array, 6));
    }

    public static int getNumberOfPairs(int[] array, int sum) {
        int numberOfPairs = 0;


        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];

            for (int j = i; j < array.length; j++) {
                if (current + array[j] == sum) {
                    numberOfPairs++;

                }

            }
        }


return numberOfPairs;
}

}
