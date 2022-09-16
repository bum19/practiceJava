package simplePolymorphism;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object);//t
        System.out.println(animal instanceof Animal);//t
        System.out.println(animal instanceof Bat);//f

        Animal cat = new Cat();
        System.out.println(cat instanceof Object);//t
        System.out.println(cat instanceof Animal);//t
        System.out.println(cat instanceof Cat);//t
        System.out.println(cat instanceof Bat); //f
    }
}

class Animal{}
class Bat extends Animal{}
class Cat extends Animal{}