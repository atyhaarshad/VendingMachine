import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Crisp crisp;
    Drink cola;

    @Before
    public void setUp(){
        drawer = new Drawer(Code.A1, 1.00);
        crisp = new Crisp("Mexican Chilli", "McCoys");
        cola = new Drink("Cola", "Coca Cola");
    }

    @Test
    public void canAddProductToDrawer(){
        drawer.add(crisp);
        drawer.add(cola);
        assertEquals(2, drawer.getProductCount());
    }

    @Test
    public void canReturnProductToDrawer(){
        drawer.add(crisp);
        drawer.removeProduct();
        assertEquals(0, drawer.getProductCount());

    }
}
