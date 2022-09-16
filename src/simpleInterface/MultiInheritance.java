package simpleInterface;

interface Animal { //인터페이스 선언. public abstract 생략가능
    public abstract void cry();
}

interface Pet{
    void play();
}

class Dog implements Animal,Pet{
    public void cry(){ // 메서드 오버라아ㅣ딩
        System.out.println("멍멍");
    }
    public void play(){
        System.out.println("원반 던지기");
    }
}

class Cat implements  Animal,Pet{
    @Override
    public void cry() {
        System.out.println("냐옹");
    }

    @Override
    public void play() {
        System.out.println("쥐잡기");
    }

}



public class MultiInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.cry();
        cat.play();
    }
}
