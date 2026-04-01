interface ElectricSystem {
    default void status() {
        System.out.println("Electric System Status: Battery is 80%");
    }
}

interface GPSSystem {
    default void status() {
        System.out.println("GPS System Status: Navigation is active");
    }
}

abstract class Vehicle {
    abstract void startEngine();
}

class SmartVehicle extends Vehicle implements ElectricSystem, GPSSystem {

    // Inner class Engine
    class Engine {
        void run() {
            System.out.println("Engine is running internally...");
        }
    }

    @Override
    void startEngine() {
        System.out.println("SmartVehicle started using Push Start.");
    }

    // resolve diamond conflict
    @Override
    public void status() {
        System.out.println("SmartVehicle resolves status conflict:");
        ElectricSystem.super.status();
        GPSSystem.super.status();
    }

    void useEngine() {
        Engine e = new Engine();
        e.run();
    }
}

public class Q5 {
    public static void main(String[] args) {
        SmartVehicle car = new SmartVehicle();
        car.startEngine();
        car.status();
        car.useEngine();
    }
}