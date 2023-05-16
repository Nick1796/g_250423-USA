package Leasson4.task1;

public class CatTest {
    public static void main(String[] args) {


        System.out.println("Перед созданием кота.");
        Cat firstCat = new Cat();
        System.out.println("После создания кота.");
        Cat secondCat = new Cat(  7);

        System.out.println("Возраст первого кота:" );
        System.out.println(firstCat.age);

        System.out.println("Возраст второго кота: ");
        System.out.println(secondCat.age);

        System.out.println("создаем третьего кота");
        Cat thirdCat = new Cat("Черный");


        System.out.println("цвет третьего кота");
        System.out.println(thirdCat.color);


        System.out.println("Создаем четвертого кота");
        Cat fourthCat = new Cat ( 3,  "рыжий");

        System.out.println("возраст четвертого кота: ");
        System.out.println(fourthCat.age);
        System.out.println("цвет черного кота");
        System.out.println(fourthCat.color);


    }
}
