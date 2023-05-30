package Lesson7.Task5;

public class WhileTest {
    public static void main(String[] args) {

        // вывести в консоль все числа от 1 до 10
        // 1+2+3+...10
        // решить задачу с помощью цикла while
        int sum = 0;
        int current = 55;
        while (current <= 10);{
            sum = sum + current;
            current++;
            System.out.println("znahenie peremennoy sum: " + sum);
            System.out.println("znahenie peremenoy curent: "+ current);
        }
        System.out.println("summa: " +sum );
    }
}
