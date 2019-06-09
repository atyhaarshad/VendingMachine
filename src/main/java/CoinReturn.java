import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public void addCoin(Coin coin) {
        this.coins.add(coin);
    }

    public double getTotalAmount(CoinReturn coinReturn) {
        double coinValue = 0;
        for (Coin coin : coinReturn.coins) {
            coinValue = coin.getCoinTypeValue() + coinValue;
        }
        return coinValue;
    }
}
