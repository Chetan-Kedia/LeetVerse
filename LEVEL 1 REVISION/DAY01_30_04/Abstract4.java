class Card extends PaymentAbstract {
    void pay() {
        System.out.println("Card payment processing...");
        receipt();
    }
}
