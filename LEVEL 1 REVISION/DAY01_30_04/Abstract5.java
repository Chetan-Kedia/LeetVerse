public class MainAbstract {
    public static void main(String[] args) {
        UPI upi = new UPI();
        Card card = new Card();
        NetBanking net = new NetBanking();
        upi.pay();
        card.pay();
        net.pay();
    }
}
