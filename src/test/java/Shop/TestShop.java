package Shop;

import Shop.Accessories.AccessoryType;
import Shop.Accessories.DrumSticks;
import Shop.Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestShop {

    Shop shop;
    ArrayList<ISell> stock;
    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks(AccessoryType.DRUM_STICKS, "Oak", "Stagg", 15, 20, "7a");
        shop = new Shop();
        stock = new ArrayList<>();
    }


    @Test
    public void shopCanAddItems(){
        shop.add(drumSticks);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void shopCanRemoveItems(){
        shop.add(drumSticks);
        shop.remove(drumSticks);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void shopTotal(){
        shop.add(drumSticks);
        assertEquals(5, shop.totalMarkup());
    }
}
