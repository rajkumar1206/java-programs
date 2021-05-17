package Lab2;

class Car {
    int speed = 180;

    public Car() {
        System.out.println("Brought a new Car");
    }

    public void drive() {
        System.out.println("Car driving at " + this.speed + " kmph");
    }
}

class Benz extends Car {
    int speed = 235;
    public Benz() {
        super();
        System.out.println("Brought a new Benz");
    }

    public void drive() {
        super.drive();
        System.out.println("Car driving at " + this.speed + " kmph");
    }

    public void compare() {
        System.out.println("Car drives at " + super.speed);
        System.out.println("But Benz drives at " + this.speed);
    }
}

public class Program9 {
    public static void main(String[] args) {
        Benz car = new Benz();

        car.drive();
        car.compare();
    }
}
