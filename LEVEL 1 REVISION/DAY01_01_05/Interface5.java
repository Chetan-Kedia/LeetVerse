public class MainInterface {
    public static void main(String[] args) {
        UPIInterface upi = new UPIInterface();
        CardInterface card = new CardInterface();
        NetBankingInterface net = new NetBankingInterface();
        upi.pay();
        card.pay();
        net.pay();
    }
}
