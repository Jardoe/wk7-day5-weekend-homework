package Shop.Accessories;
import Shop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDrumSticks {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(AccessoryType.DRUM_STICKS, "Oak", "Stagg", 15, 20, "7a" );
    }

    @Test
    public void accessoryHasType(){
        assertEquals(AccessoryType.DRUM_STICKS, drumSticks.getType());
    }

    @Test
    public void accessoryHasModel(){
        assertEquals("Oak", drumSticks.getModel());
    }

    @Test
    public void accessoryHasMake(){
        assertEquals("Stagg", drumSticks.getMake());
    }

    @Test
    public void accessoryHasBuyPrice(){
        assertEquals(15, drumSticks.getBuyPrice());
    }

    @Test
    public void accessoryHasSellPrice(){
        assertEquals(20, drumSticks.getSellPrice());
    }

    @Test
    public void accessoryHasNumberOfStrings(){
        assertEquals("7a", drumSticks.getStickType());
    }

    @Test
    public void accessoryHasMarkUp(){
        assertEquals(5, drumSticks.calculateMarkup());
    }

    @Test
    public void canSetAccessorySellPrice(){
        drumSticks.setSellPrice(25);
        assertEquals(25, drumSticks.getSellPrice());
    }

}

