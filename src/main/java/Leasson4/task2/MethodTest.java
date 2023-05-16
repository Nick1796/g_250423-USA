package Leasson4.task2;

public class MethodTest {

    public static void main(String[] args) {
        System.out.println("Начало работы");
        System.out.println("Объявляем переменные");
        int a = 7;
        int b = 9;


        System.out.println("Вызываем метод");
       int c = add(a,b);
        System.out.println("Результат работы программы: ");

        System.out.println(c);
        System.out.println("Конец работы");
    }

    public static int add(int a, int b){
        System.out.println("Метод начал работу");
        int result = a + b;
        System.out.println("Метод закончил работу");
        return result;




    }

}
