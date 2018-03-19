package Shop.Accessories;

import Shop.Interfaces.ISell;
import Shop.Stock;

public abstract class Accessory extends Stock implements ISell{

    private AccessoryType type;

    public Accessory(AccessoryType type, String model, String make, int buyPrice, int sellPrice) {
        super(model, make, buyPrice, sellPrice);
        this.type = type;
    }


    public AccessoryType getType() {
        return type;
    }
}
