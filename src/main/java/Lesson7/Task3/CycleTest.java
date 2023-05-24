package Lesson7.Task3;

public class CycleTest {

    public static void main(String[] args) {

        // vivesti v konsol clovo 10 raz
        int a = 0;
        for (; a < 10; a = a +3) {
            System.out.println("Hello");
            System.out.println(a);
        }
        System.out.println("Konec cikla");

        System.out.println("Vtoraya zadaha");
        // vivesti v consol chisla ot 10 do 1 v poryadke ybuvanuia
        for (int i = 10; i>= 1; i--){
            System.out.println(i);
        }
    }

}
