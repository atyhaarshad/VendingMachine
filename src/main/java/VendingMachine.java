import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Drawer> drawers;
    private List<Coin> coinsEntered;
    private CoinReturn coinReturn;
    private double credit;

    public VendingMachine(List<Drawer> drawers, List<Coin> coinsEntered, CoinReturn coinReturn, double credit) {
        this.drawers = drawers;
        this.coinsEntered = coinsEntered;
        this.coinReturn = coinReturn;
        this.credit = credit;
    }

    public VendingMachine() {
        this.coinReturn = new CoinReturn();
        this.coinsEntered = new ArrayList<Coin>();
        this.drawers = new ArrayList<Drawer>();
        this.credit = 0;
    }

    public boolean validCoin(Coin coin) {
        return !(coin.getCoinTypeValue() < CoinType.FIVE.getValue());
    }

    public void addCoinValueToCredit(Coin coin){
        this.credit += coin.getCoinTypeValue();
    }


    public void addCoin(Coin coin) {
        if (validCoin(coin)){
            coinsEntered.add(coin);
            credit += coin.getCoinTypeValue();
            addCoinValueToCredit(coin);
        } else {
            coinReturn.addCoin(coin);
        }
    }

    public int getNoOfCoinsEntered(){
        return coinsEntered.size();
    }

//    public BuyResult buy(Code code){
//
//        for (Drawer drawer : drawers) {
//
//            if (drawer.getCode().equals(code)) {
//
//                if (this.credit >= drawer.getPrice()) {
//
//                    return new BuyResult(vend(drawer), true, new ArrayList<Coin>());
//                } else {
//
//                    for (Coin coin: coinsEntered) {
//
//                        this.coinReturn.addCoin(coin);
//                    }
//                }
//            }
//        }
//
//        return new BuyResult(null, false, coinsEntered);
//    }

    public Product buyProduct(Code code){

        for (Drawer drawer : drawers){
            if ( drawer.getCode().equals(code)){
                if (this.credit >= drawer.getPrice()){
                    return drawer.returnProduct();
                } else {
                    for (Coin coin: coinsEntered){
                        this.coinReturn.addCoin(coin);
                    }
                }
            }
        }

        return null;
    }

    public Product vend(Drawer drawer) {

        this.credit = 0;
        return drawer.removeProduct();
    }

}
