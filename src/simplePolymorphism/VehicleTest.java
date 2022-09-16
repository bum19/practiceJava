package simplePolymorphism;

public class VehicleTest {
    public static void main(String[] args){
        Car car = new Car();

        Vehicle vehicle = car;
        Car car2 = (Car)vehicle;
        //MotorBike motorBike = (MotorBike) car; //error. 서로 상속관계가아님.
    }
}

class Vehicle{

}

class Car extends Vehicle{

}

class MotorBike extends Vehicle{

}