package Lesson12.Task2;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        System.out.println("dlina" +builder.length());
        System.out.println("Emkocti" +builder.capacity());


        StringBuilder builder1 = new StringBuilder(50);
        System.out.println("Emkost new obiekta " +builder1.capacity());

        StringBuilder builder2 = new StringBuilder("Hwllo");
        System.out.println("Dlina 3 obiekta " +builder2.length());
        System.out.println("Emkost 3 obiekta " +builder2.capacity());








    }
}
