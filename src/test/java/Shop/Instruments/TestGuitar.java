package Shop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.GUITAR, "SG", "Gibson", 300, 500, 6 );
    }

    @Test
    public void instrumentHasType(){
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void instrumentHasModel(){
        assertEquals("SG", guitar.getModel());
    }

    @Test
    public void instrumentHasMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void instrumentHasBuyPrice(){
        assertEquals(300, guitar.getBuyPrice());
    }

    @Test
    public void instrumentHasSellPrice(){
        assertEquals(500, guitar.getSellPrice());
    }

    @Test
    public void instrumentHasNumberOfStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void instrumentHasMarkUp(){
        assertEquals(200, guitar.calculateMarkup());
    }

    @Test
    public void instrumentCanPlay(){
        assertEquals("GUITAR plays chord sound", guitar.play());
    }

    @Test
    public void canSetInstrumentSellPrice(){
        guitar.setSellPrice(550);
        assertEquals(550, guitar.getSellPrice());
    }

}