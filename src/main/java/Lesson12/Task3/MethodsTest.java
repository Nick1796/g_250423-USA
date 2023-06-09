package Lesson12.Task3;

public class MethodsTest {

    public static void main(String[] args) {



        StringBuilder builder = new StringBuilder();

        builder.append("Banana").append("Apple").append("Orange").append("Orange").append("Peach");
        System.out.println(builder);

        builder.appendCodePoint(60);
        System.out.println(builder);

        // Удаление подстроки по индексам

        builder.delete(11, 17);
        System.out.println(builder);



//   Удаление символа по индексу
        builder.deleteCharAt(builder.length() -1);
        System.out.println(builder);



        // получаем символ по индексу

        System.out.println(builder.charAt(6));

        // получаем индекс по символу

        System.out.println(builder.indexOf("Apple"));



        //вставляем подстроку


        builder.insert(11, "Cherry");
        System.out.println(builder);

        // заменяем подстроку на другую полдстроку

        builder.replace(6, 11, "Watermelon");
        System.out.println(builder);

        // получаем подстроку
        System.out.println(builder.substring(16));
        System.out.println(builder.substring(16, 22));


        // переобразуем StringBuilder в String

        String result = builder.toString();
        System.out.println(result);

        builder.append("Blueberry");

        // Уменьшеаем размер внутреннего хранилища

        System.out.println("dlina " +builder.length());
        System.out.println("Emkost " +builder.capacity());
        builder.trimToSize();
        System.out.println("dlina " +builder.length());
        System.out.println("Emkost " +builder.capacity());





        // переворачивваем строку

        builder.reverse();
        System.out.println(builder);






    }


}
