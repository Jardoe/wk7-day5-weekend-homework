package Shop.Accessories;

public class DrumSticks extends Accessory{

    String stickType;

    public DrumSticks(AccessoryType type, String model, String make, int buyPrice, int sellPrice, String stickType) {
        super(type, model, make, buyPrice, sellPrice);
        this.stickType = stickType;
    }

    @Override
    public int calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }

    public String getStickType() {
        return stickType;
    }
}
