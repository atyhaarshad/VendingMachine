import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.*;

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
        this.vendingMachine = new VendingMachine();
        this.pound = new Coin(CoinType.POUND);
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
        vendingMachine.addCoin(pound);
        assertEquals(1, vendingMachine.getNoOfCoinsEntered());
    }

    @Test
    public void canCheckCoinValid(){
        assertTrue(vendingMachine.validCoin(pound));
    }

    @Test
    public void canCheckCoinInvalid(){
        assertFalse(vendingMachine.validCoin(twoP));
    }

    @Test
    public void canBuyProduct(){

        Drawer drawer = new Drawer(Code.A1, 1.00);
        drawer.add(new Drink("cola", "coca cola"));
        List<Drawer> drawers = singletonList(drawer);
        List<Coin> coins = singletonList(new Coin(CoinType.POUND));
        this.vendingMachine = new VendingMachine(drawers, coins, new CoinReturn(), 1.00);

        BuyResult result = this.vendingMachine.buy(Code.A1);

        assertTrue(result.isSuccessful());
        assertNotNull(result.getProduct());
    }

    @Test
    public void canNotBuyProduct_notEnoughMoney(){

        Drawer drawer = new Drawer(Code.A1, 1.00);
        drawer.add(new Drink("cola", "coca cola"));
        List<Drawer> drawers = singletonList(drawer);
        List<Coin> coins = singletonList(new Coin(CoinType.FIFTY));
        this.vendingMachine = new VendingMachine(drawers, coins, new CoinReturn(), 0.5);

        BuyResult result = this.vendingMachine.buy(Code.A1);

        assertFalse(result.isSuccessful());
        assertNull(result.getProduct());
    }
}
