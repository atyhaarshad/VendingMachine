import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coinsEntered;
    private CoinReturn coinReturn;
    private double credit;

    public VendingMachine(CoinReturn coinReturn, double credit) {
        this.coinReturn = coinReturn;
        this.coinsEntered = new ArrayList<Coin>();
        this.drawers = new ArrayList<Drawer>();
        this.credit = 0;
    }


    public double getTotalAmount(CoinReturn coinReturn) {
        return coinReturn.getTotalAmount(coinReturn);
    }


    public boolean validCoin(Coin coin) {
        if (coin.getCoinTypeValue() < CoinType.FIVE.getValue()){
            return false;
        } else {
            return true;
        }
    }


    public void addCoin(Coin coin) {
        if (validCoin(coin) == true){
            coinsEntered.add(coin);
        } else {
            coinReturn.addCoin(coin);
        }
    }

    public int getNoOfCoinsEntered(){
        return coinsEntered.size();
    }
}
