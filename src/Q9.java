interface OnlinePayment {
    default void pay() {
        System.out.println("Paid using Online Payment (Card).");
    }
}

interface CashPayment {
    default void pay() {
        System.out.println("Paid using Cash on Delivery.");
    }
}

abstract class Order {
    abstract void processOrder();
}

class SmartOrder extends Order implements OnlinePayment, CashPayment {

    class Invoice {
        void generateInvoice() {
            System.out.println("Invoice Generated: Order #101, Amount: 5000 PKR");
        }
    }

    @Override
    void processOrder() {
        System.out.println("Order processed successfully.");
    }

    @Override
    public void pay() {
        System.out.println("SmartOrder resolves payment conflict:");
        OnlinePayment.super.pay();
        CashPayment.super.pay();
    }

    void printInvoice() {
        Invoice inv = new Invoice();
        inv.generateInvoice();
    }
}

public class Q9 {
    public static void main(String[] args) {
        SmartOrder order = new SmartOrder();
        order.processOrder();
        order.pay();
        order.printInvoice();
    }
}