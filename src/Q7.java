interface InsuranceService {
    default void serviceStatus() {
        System.out.println("Insurance Status: Coverage Active");
    }
}

interface EmergencyService {
    default void serviceStatus() {
        System.out.println("Emergency Status: Ambulance Ready");
    }
}

abstract class Patient {
    abstract void getTreatment();
}

class SmartPatient extends Patient implements InsuranceService, EmergencyService {

    // Inner class Medical History
    class MedicalHistory {
        void showHistory() {
            System.out.println("Medical History: No major disease.");
        }
    }

    @Override
    void getTreatment() {
        System.out.println("Patient Treatment: General checkup done.");
    }

    @Override
    public void serviceStatus() {
        System.out.println("SmartPatient resolves service status:");
        InsuranceService.super.serviceStatus();
        EmergencyService.super.serviceStatus();
    }

    void showMedicalHistory() {
        MedicalHistory mh = new MedicalHistory();
        mh.showHistory();
    }
}

public class Q7 {
    public static void main(String[] args) {
        SmartPatient p = new SmartPatient();
        p.getTreatment();
        p.serviceStatus();
        p.showMedicalHistory();
    }
}