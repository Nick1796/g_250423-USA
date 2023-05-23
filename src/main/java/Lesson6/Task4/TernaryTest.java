package Lesson6.Task4;

public class TernaryTest {

    public static void main(String[] args) {

        int a = 35;
        int b = 20;
        int max;

        // В переменную max записать максимальное значение из переменных a and b

  //      if ( a > b ){
   //         max = a;
   //     } else {
   //         max = b;
  //      }
        max = a > b ? a : b;
        System.out.println("Максимальное число - " + max);
    }
}
