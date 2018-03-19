package Shop.Instruments;

public class Guitar extends Instrument {

    int stringNumber;

    public Guitar(InstrumentType type, String model, String make, int buyPrice, int sellPrice, int stringNumber) {
        super(type, model, make, buyPrice, sellPrice);
        this.stringNumber = stringNumber;
    }


    public int getStrings() {
        return stringNumber;
    }

    @Override
    public int calculateMarkup() {
        return getSellPrice()-getBuyPrice();
    }

    @Override
    public String play(){
        return getType() + " plays chord sound";
    }
}
