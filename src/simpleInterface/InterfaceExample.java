package simpleInterface;
//인터페이스를 안썼을때 문제. provider2로 교체시 코드 수정 많이 발생
public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider2()); //코드변경1
    }
}

class User{
    public void callProvider(Provider2 provider){ //코드변경2. 단순한 코드라 그렇지, User내부에서 수많은거 바꿔줘야할수도있음.
        provider.call();
    }
}

class Provider{
    public void call(){
        System.out.println("공급자 기능 실행완료.");
    }
}

class Provider2{
    public void call(){
        System.out.println("공급자2 기능 실행완료");
    }
}