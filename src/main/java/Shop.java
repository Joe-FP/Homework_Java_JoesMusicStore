import Instruments.Instrument;
import InstrumentSpares.InstrumentSpares;
import Interfaces.iSell;

import java.util.ArrayList;

public class Shop {

    private String shopName;
    private ArrayList<iSell> stock;

    public Shop(String shopName) {
        this.shopName = shopName;
        stock = new ArrayList<iSell>();
    }

    public void addStockItem(iSell item){
        this.stock.add(item);
    }

    public void removeStockItem(iSell item){
        this.stock.remove(item);
    }

    public ArrayList<iSell> stock(){
        return stock;
    }

    public double getProjectedProfitOnCurrentStock(){
        double totalCostToBuy = 0;
        double totalCostToSell = 0;
        double totalProfit;

        for(iSell stockItem : stock){
            if(stockItem instanceof Instrument){
                totalCostToBuy += ((Instrument)stockItem).getBuyPrice();
                totalCostToSell += ((Instrument)stockItem).getSellPrice();
            }else{
                totalCostToBuy += ((InstrumentSpares)stockItem).getBuyPrice();
                totalCostToSell += ((InstrumentSpares)stockItem).getSellPrice();
            }
        }
        totalProfit = totalCostToSell - totalCostToBuy;
        return totalProfit;
    }

}
