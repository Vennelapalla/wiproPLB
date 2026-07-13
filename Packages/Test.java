abstract class Vehicle {

    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP01AB1234";
    }

    public String getOwnerName() {
        return "Jyoshna";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio Facility Available");
    }
}

class Honda extends Vehicle {

    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "AP02CD5678";
    }

    public String getOwnerName() {
        return "Jyoshna";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player Facility Available");
    }
}

public class Test {

    public static void main(String[] args) {

        Hero h = new Hero();
        System.out.println("Hero Details");
        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        h.radio();

        System.out.println();

        Honda c = new Honda();
        System.out.println("Honda Details");
        System.out.println(c.getModelName());
        System.out.println(c.getRegistrationNumber());
        System.out.println(c.getOwnerName());
        System.out.println(c.getSpeed());
        c.cdplayer();
    }
}