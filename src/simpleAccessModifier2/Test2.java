package simpleAccessModifier2;
import simpleAccessModifier.*;
public class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        //System.out.println(p.a); // 다른 클래스
        //System.out.println(p.b); // 다른 패키지
        //System.out.println(p.c); // 다른패키지 && 자식클래스아님
        System.out.println(p.d); //가능
    }
}
class Child extends Parent{
    public void printEach(){
        //System.out.println(super.a); //private이라 접근 불가능
        //System.out.println(super.b);// 다른패키지라 접근 불가능
        System.out.println(super.c);//다른패키지지만, 하위클래스라 접근가능
        System.out.println(super.d);

    }
}
/*
class Child extends Parent{ //parent가 protected 이상이면 불가능. 동일패키지 or 하위클래스가 아님.
}
 */

