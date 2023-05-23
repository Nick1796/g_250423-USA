package Lesson6.Task2;

public class SwitchTest {

    public static void main(String[] args) {


        int value = 2;
        int b = 23;


        switch (value){
            case 1:
                System.out.println("Значение переменной равно 1.");
                break;
            case 2:
                if (b == 5){
                    System.out.println("Значение переменной b равно 5.");
                }
                System.out.println("Значение переменной равно 2.");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Значение переменной равно5, или 6, или 7. ");
                break;
            default:
                System.out.println("Это какое-то другое значение.");
                break;

        }

        System.out.println("Конец программы.");
    }
}
