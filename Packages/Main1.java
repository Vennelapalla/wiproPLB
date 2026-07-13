class Vehicle {
    protected int speed = 100;

    public int speed() {
        return speed;
    }
}

class Logan extends Vehicle {
    @Override
    public int speed() {
        return super.speed();
    }

    public int gps() {
        System.out.println("GPS facility is available in Logan");
        return 1;
    }
}

class Ford extends Vehicle {
    @Override
    public int speed() {
        return super.speed();
    }

    public int tempControl() {
        System.out.println("Air conditioning control is available in Ford");
        return 1;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Logan logan = new Logan();
        Ford ford = new Ford();

        System.out.println("Logan speed: " + logan.speed());
        logan.gps();

        System.out.println("Ford speed: " + ford.speed());
        ford.tempControl();
    }
}