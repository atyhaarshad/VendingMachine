import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    private ArrayList<Coin> coinsEntered;
    private ArrayList<Drawer> drawers;
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
        vendingMachine = new VendingMachine(coinReturn, 0);
        pound = new Coin(CoinType.POUND);
        fiftyP = new Coin(CoinType.FIFTY);
        twentyP = new Coin(CoinType.TWENTY);
        tenP = new Coin(CoinType.TEN);
        fiveP = new Coin(CoinType.FIVE);
        oneP = new Coin(CoinType.ONE);
        twoP = new Coin(CoinType.TWO);
        coinReturn = new CoinReturn();
        coinsEntered = new ArrayList<Coin>();
        drawers = new ArrayList<Drawer>();

    }

    @Test
    public void canAddCoinToMachine(){
        vendingMachine.addCoin(pound);
        assertEquals(1, vendingMachine.getNoOfCoinsEntered());
    }

    @Test
    public void canCheckCoinValid(){
        assertEquals(false, vendingMachine.validCoin(twoP));
    }

}
