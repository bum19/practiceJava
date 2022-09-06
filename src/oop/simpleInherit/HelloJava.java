package oop.simpleInherit;

import oop.simpleInherit.Person;
import oop.simpleInherit.Programmer;

public class HelloJava {
    public static void main(String[] args) {
        //Person 객체 생성
        Person p = new Person();
        p.name = "김코딩";
        p.age = 24;
        p.learn();
        p.eat();
        p.walk();
        System.out.println(p.name);

        //Programmer 객체 생성
        Programmer pg = new Programmer();
        pg.name = "박해커";
        pg.age = 26;
        pg.learn();
        pg.coding();    //Programmer의 개별 기능
        System.out.println(pg.name);
    }
}
