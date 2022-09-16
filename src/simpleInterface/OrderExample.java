package simpleInterface;
//실제 예제에서는 CafeCustomer를 인터페이스 Customer로 함. 너무간단한 예제일수록 interface와 추상클래스의 차이가 두드러지지않는듯.
//인터페이스는 두 독립된 기능을 연결시켜주는데서 효율적임. 커피사장/커피소비자를 독립적으로 놓을수가 없어서 클래스로 써도 ㄱㅊ아보임.
//만약 커피사장,자동차사장,음식점사장 <-> 소비자 이런식이면 interface가 효율적일수 있다는 생각이 듦.
class CafeCustomer{
    public String CafeCustomerName;

    public void setCafeCustomerName(String CafeCustomerName) {
        this.CafeCustomerName = CafeCustomerName;
    }

    public String getOrder(){
        return "";
    }
}
class CafeCustomerA extends CafeCustomer{
    public String getOrder(){
        return "ice americano";
    }
}
class CafeCustomerB extends CafeCustomer{
    public String getOrder(){
        return "strawberry latte";
    }
}


class CafeOwner{
    public void giveItem(CafeCustomer customer){
        System.out.println("give "+customer.getOrder());
    }
}

public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeowner = new CafeOwner();
        CafeCustomer cafeCustomerA = new CafeCustomerA();
        CafeCustomer cafeCustomerB = new CafeCustomerB();

        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
    }
}
