import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }

    public void addCoin(Coin coin) {
        this.coins.add(coin);
    }

    public double getTotalAmount() {

        double coinValue = 0;
        for (Coin coin : this.coins) {
            coinValue = coin.getCoinTypeValue() + coinValue;
        }
        return coinValue;
    }
}
