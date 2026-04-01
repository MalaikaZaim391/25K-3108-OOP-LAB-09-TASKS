interface WiFi {
    default void connect() {
        System.out.println("Connected using WiFi");
    }
}

interface Bluetooth {
    default void connect() {
        System.out.println("Connected using Bluetooth");
    }
}

class FAST {

    // Inner class
    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDepartment() {
            System.out.println("Department: " + deptName);
        }
    }
}

class SmartDevice implements WiFi, Bluetooth {

    //Resolving diamond problem
    @Override
    public void connect() {
        System.out.println("SmartDevice resolved conflict: Connecting...");
        WiFi.super.connect(); // choosing WiFi
    }
}

public class Q1 {
    public static void main(String[] args) {

        SmartDevice device = new SmartDevice();
        device.connect();

        FAST fast = new FAST();
        FAST.Department dept = fast.new Department("Computer Science");
        dept.showDepartment();
    }
}