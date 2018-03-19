package Shop;

import Shop.Interfaces.ISell;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<>();
    }

    public int countStock() {
        return stock.size();
    }

    public void add(ISell object) {
        stock.add(object);
    }

    public void remove(ISell object) {
        stock.remove(object);
    }

    public int totalMarkup() {
        int total = 0;
        for(ISell stock : stock){
           int sale = stock.calculateMarkup();
           total += sale;
        }
        return total;
    }
}
