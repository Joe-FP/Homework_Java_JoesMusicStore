package InstrumentSpares;

public class GuitarStrings extends InstrumentSpares implements Interfaces.iSell {

    double length;
    double diameter;

    public GuitarStrings(String brand, double buyPrice, double sellPrice, double length, double diameter) {
        super(brand, buyPrice, sellPrice);
        this.length = length;
        this.diameter = diameter;
    }

    public double getLength() {
        return this.length;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double calculateMarkup() {
        return ((super.sellPrice - super.buyPrice)/super.buyPrice);
    }
}
