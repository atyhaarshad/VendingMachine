public class Coin {

    CoinType coinType;

    public Coin(CoinType coinType) {
        this.coinType = coinType;
    }

    public double getCoinTypeValue(){
        return coinType.getValue();
    }

}
