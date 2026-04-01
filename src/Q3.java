class BankSystem {

    void fraudCheck() {
        // Local Inner Class
        class FraudChecker {
            void check() {
                System.out.println("Fraud Check: Transaction is safe.");
            }
        }

        FraudChecker fc = new FraudChecker();
        fc.check();
    }

    void assignAuditor() {

        // Anonymous class using ABSTRACT CLASS
        Auditor auditor = new Auditor() {
            @Override
            void report() {
                System.out.println("Auditor Report: Everything looks good.");
            }
        };

        auditor.report();
    }
}

// Abstract class instead of interface
abstract class Auditor {
    abstract void report();
}

public class Q3 {
    public static void main(String[] args) {

        BankSystem bank = new BankSystem();
        bank.fraudCheck();
        bank.assignAuditor();
    }
}