package Lab3;

interface Tyre {
    public void move();
    static void type() {
        System.out.println("Type is made with Carbon Content");
    }
}

interface Door {
    public int noOfDoor = 4;
    public void open();
}

class Car {
    int speed = 180;

    public Car() {
        System.out.println("Brought a new Car");
    }

    public void drive() {
        System.out.println("Car driving at " + this.speed + " kmph");
    }
}

class Benz extends Car implements Tyre, Door {
    int speed = 235;
    public Benz() {
        super();
        System.out.println("Brought a new Benz");
    }

    public void drive() {
        super.drive();
        System.out.println("Car driving at " + this.speed + " kmph");
    }

    @Override
    public void move() {
        System.out.println("Car starts moving!");
        Tyre.type();
    }

    @Override
    public void open() {
        System.out.println("Door Opened");
        System.out.println(this.noOfDoor);
    }
}

public class Program11 {
    public static void main(String[] args) {
        Benz car = new Benz();
        car.open();
        car.move();
        car.drive();
    }
}
