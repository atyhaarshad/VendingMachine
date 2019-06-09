import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin pound;
    Coin fiftyP;
    Coin twentyP;
    Coin tenP;
    Coin fiveP;
    Coin oneP;
    Coin twoP;
    CoinReturn coinReturn;

    @Before
    public void setUp(){
        vendingMachine = new VendingMachine(coinReturn);
        pound = new Coin(CoinType.POUND);
        fiftyP = new Coin(CoinType.FIFTY);
        twentyP = new Coin(CoinType.TWENTY);
        tenP = new Coin(CoinType.TEN);
        fiveP = new Coin(CoinType.FIVE);
        oneP = new Coin(CoinType.ONE);
        twoP = new Coin(CoinType.TWO);
        coinReturn = new CoinReturn();

    }

    @Test
    public void canAddCoinToMachine(){
        coinReturn.addCoin(pound);
        assertEquals(1.00, vendingMachine.getTotalAmount(coinReturn));
    }

    @Test
    public void canCheckCoinValid(){
        assertEquals(false, vendingMachine.isCoinValid(twoP));
    }
}
