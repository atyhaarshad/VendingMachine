import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CoinReturnTest {

    CoinReturn coinReturn;
    Coin fiftyP;
    Coin twentyP;
    Coin pound;

    @Before
    public void setUp(){
        coinReturn = new CoinReturn();
        fiftyP = new Coin(CoinType.FIFTY);
        twentyP = new Coin(CoinType.TWENTY);
        pound = new Coin(CoinType.POUND);
    }

    @Test
    public void canGetTotalAmountInCoinReturn(){
        coinReturn.addCoin(fiftyP);
        coinReturn.addCoin(twentyP);
        coinReturn.addCoin(pound);
        assertEquals(1.70, coinReturn.getTotalAmount(coinReturn));
    }
}
