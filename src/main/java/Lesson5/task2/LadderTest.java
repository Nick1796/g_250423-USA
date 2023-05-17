package Lesson5.task2;

public class LadderTest {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        if (a < b){
            System.out.println("A less,them B");
        } else if (a > b) {
            System.out.println("A more, them B");
        } else {
            System.out.println("A equals B");
        }
        if (!(a < b)){
            System.out.println("A NOT less, them B");
        }
    }
}
