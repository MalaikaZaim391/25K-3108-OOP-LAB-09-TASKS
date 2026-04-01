interface IoTDevice {

    default void update() {
        System.out.println("IoT Device Updating firmware...");
    }

    static void info() {
        System.out.println("IoT Info: This device supports smart updates.");
    }
}

class SmartSensor implements IoTDevice {
}

public class Q6 {
    public static void main(String[] args) {
        SmartSensor sensor = new SmartSensor();

        sensor.update();     //default method
        IoTDevice.info();    //static method (called by interface name)
    }
}