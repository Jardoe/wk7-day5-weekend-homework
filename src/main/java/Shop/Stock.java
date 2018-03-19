package Shop;

public abstract class Stock {
    String model;
    String make;
    int buyPrice;
    int sellPrice;

    public Stock(String model, String make, int buyPrice, int sellPrice){
        this.model = model;
        this.make = make;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
