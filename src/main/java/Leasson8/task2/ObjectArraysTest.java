package Leasson8.task2;

public class ObjectArraysTest {


    public static void main(String[] args) {

        Cat [] cats = new Cat[5];
        System.out.println(cats[3]);


        Cat cat = new Cat( 7, "Black");

        cats[3]= cat;
        System.out.println(cats[3].getColor());


        Cat[] cats1 = {new  Cat(4, "White"), new Cat(2, "Gray"), cat};
        System.out.println("Vozrst vsex cats v massive: ");
        for (Cat curentCat : cats1){
            System.out.println(curentCat.getAge());
        }

        System.out.println(cats1[3].getColor());




    }
}
