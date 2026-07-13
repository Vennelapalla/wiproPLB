// Interface 1
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

// Interface 2
interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

// Class implementing both interfaces
class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        // Call Vehicle interface's default method using super
        Vehicle.super.message();
        // Call FourWheeler interface's default method using super
        FourWheeler.super.message();
    }
}

// Main class to test
public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message(); // instantiate and call
    }
}