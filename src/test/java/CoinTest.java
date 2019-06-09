import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CoinTest {

    Coin fiftyP;
    Coin twentyP;

    @Before
    public void setUp(){
        fiftyP = new Coin(CoinType.FIFTY);
        twentyP = new Coin(CoinType.TWENTY);
    }

    @Test
    public void canGetCoinsValue(){
        assertEquals(0.50, fiftyP.getCoinTypeValue());
    }

}
