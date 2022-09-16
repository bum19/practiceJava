package simpleInterface;

interface Cover{
    public abstract void call();
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        User2 user = new User2();
        user.providerCall(new Provider3()); //코드변경 1번.
    }
}


class User2{
    public void providerCall(Cover cover){ //변경 x.
        cover.call();
    }
}

class Provider3 implements Cover{
    @Override
    public void call(){
        System.out.println("공급자3 기능 실행");
    }
}

class Provider4 implements Cover{
    @Override
    public void call() {
        System.out.println("공급자4 기능 실행");
    }
}