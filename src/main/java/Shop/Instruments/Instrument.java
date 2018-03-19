package Shop.Instruments;

import Shop.Interfaces.IPlay;
import Shop.Interfaces.ISell;
import Shop.Stock;


public abstract class Instrument extends Stock implements IPlay, ISell{

    private InstrumentType type;

    public Instrument(InstrumentType type, String model, String make, int buyPrice, int sellPrice) {
        super(model, make, buyPrice, sellPrice);
        this.type = type;
    }




    @Override
    public String play() {
        return null;
    }

    public InstrumentType getType() {
        return type;
    }
}
