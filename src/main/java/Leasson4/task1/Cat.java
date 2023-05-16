package Leasson4.task1;

public class Cat {

    public int age;
    public String color;


//    public Cat() {
//        System.out.println("Вызван конструктор Cat");
//
//    }
//
//    public Cat(int age) {
//        this.age = age;
//        System.out.println("Вызван конструктор с возрастом ");
//    }
//
//    public Cat(String color){
//        this.color = color;
//        System.out.println("вызван конструктор с цветом");
//    }
//
//    public Cat(int age, String color){
//        this.age = age;
//        this.color = color;
//        System.out.println("Вызван констркуктор с двумя параметрами");
//    }
    public Cat(){

    }
    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Cat(int age) {
        this.age = age;
    }
    public Cat(String color){
        this.color = color;
    }

}
