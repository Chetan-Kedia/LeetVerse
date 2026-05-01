abstract class PaymentAbstract {
    abstract void pay();

    void receipt() {
        System.out.println("Payment done successfully");
    }
}
