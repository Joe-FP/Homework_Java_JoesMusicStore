package InstrumentSpares;

public abstract class InstrumentSpares {

    String brand;
    double buyPrice;
    double sellPrice;

    public InstrumentSpares(String brand, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
