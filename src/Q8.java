interface VoiceControl {
    default void executeCommand() {
        System.out.println("Voice Control: Command executed by voice.");
    }
}

interface RemoteControl {
    default void executeCommand() {
        System.out.println("Remote Control: Command executed by remote.");
    }
}

abstract class Appliance {
    abstract void turnOn();
}

class SmartAppliance extends Appliance implements VoiceControl, RemoteControl {

    class Settings {
        void showSettings() {
            System.out.println("Settings: Brightness = Medium, Mode = Eco");
        }
    }

    @Override
    void turnOn() {
        System.out.println("Appliance turned ON.");
    }

    @Override
    public void executeCommand() {
        System.out.println("Smart Appliance resolves command conflict:");
        VoiceControl.super.executeCommand();
        RemoteControl.super.executeCommand();
    }

    void showSettings() {
        Settings s = new Settings();
        s.showSettings();
    }
}

public class Q8 {
    public static void main(String[] args) {
        SmartAppliance fan = new SmartAppliance();
        fan.turnOn();
        fan.executeCommand();
        fan.showSettings();
    }
}