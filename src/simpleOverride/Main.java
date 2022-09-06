package simpleOverride;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bike(),new Car(), new MotorBike()};
        for(Vehicle vehicle: vehicles)
            vehicle.run();
    }
}

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle{
    void run(){
        System.out.println("MotorBike is running");
    }
}
