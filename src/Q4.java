interface GPS {
    void trackLocation();
}

interface Payment {
    void pay();
}

class RideApp {

    // Static inner class
    static class CompanyRules {
        static void showRules() {
            System.out.println("Company Rules: Wear seatbelt and follow traffic laws.");
        }
    }
}

class Ride implements GPS, Payment {

    @Override
    public void trackLocation() {
        System.out.println("GPS Tracking: Location is being tracked.");
    }

    @Override
    public void pay() {
        System.out.println("Payment Done using Card.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Ride r = new Ride();
        r.trackLocation();
        r.pay();

        RideApp.CompanyRules.showRules();
    }
}