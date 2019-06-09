import java.util.ArrayList;

public class VendingMachine { // 187

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coinsEntered;
    private CoinReturn coinReturn;

    public VendingMachine(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
        this.coinsEntered = new ArrayList<Coin>();
        this.drawers = new ArrayList<Drawer>();
    }


    public double getTotalAmount(CoinReturn coinReturn) {
        return coinReturn.getTotalAmount(coinReturn);
    }



    public boolean isCoinValid(Coin coin) {
        if (coin.getCoinTypeValue() < 0.05){
            return false;
        } else {
            return true;
        }
    }
}
