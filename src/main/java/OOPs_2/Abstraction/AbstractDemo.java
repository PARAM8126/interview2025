
// Abstract class needs to be extended and its method implemented.
// It cannot be instantiated.

package oops02.abstraction;

abstract class Vehicle {
    public abstract void start();  // Fixed: added public and void
}

class Car extends Vehicle {
    public void start() {
        System.out.println("starts with key");
    }
}

class Scooter extends Vehicle {
    public void start() {
        System.out.println("starts with kick");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car ob = new Car();
        ob.start();

        System.out.println("---------------------");

        Scooter ob2 = new Scooter();
        ob2.start();
    }
}
