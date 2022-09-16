package simpleAbstract;

abstract class Animal{
    public String kind;
    public abstract void sound();
}

class Dog extends Animal{
    public Dog(){
        this.kind = "포유류";
    }
    public void sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    public Cat() {
        this.kind = "포유류";
    }
    public void sound(){
        System.out.println("냐옹");
    }
}

public class DogExample {
    public static void main(String[] args) throws Exception{
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}

class fin_parent{}
final class fin_child extends fin_parent{}
interface a{}
interface b extends a{}