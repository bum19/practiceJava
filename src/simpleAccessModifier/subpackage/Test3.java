package simpleAccessModifier.subpackage;

import simpleAccessModifier.Parent;

public class Test3 {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.printEach();
    }
}

class Child2 extends Parent {
    public void printEach(){
        //System.out.println(this.a);
        //System.out.println(super.b); // default가 동일패키지만 접근가능했음. 패키지 내의 패키지라도 이건 마찬가지인듯

        //셋다 같은 변수를 접근해서 출력함.
        System.out.println(this.c);
        System.out.println(super.c);
        System.out.println(c);
    }
}
