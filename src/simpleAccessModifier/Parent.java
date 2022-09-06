package simpleAccessModifier;

 class Test1 {
    public static void main(String[] args) {
        Parent p = new Parent();

      //  System.out.println(p.a); //동일 클래스 내에 없음
        System.out.println(p.b); //동일 패키지 내에 있음
        System.out.println(p.c); //동일 패키지 내에 있음 or 하위클래스
        System.out.println(p.d); //접근제어 없음
    }
}

public class Parent{
    private int a =1;
    int b= 2;
    protected int c= 3;
    public int d= 4;

    public void printEach(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}