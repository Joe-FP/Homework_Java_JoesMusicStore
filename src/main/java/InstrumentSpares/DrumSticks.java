package InstrumentSpares;

import ENUMS.DrumstickSizeType;

public class DrumSticks extends InstrumentSpares implements Interfaces.iSell {

    DrumstickSizeType size;

    public DrumSticks(String brand, double buyPrice, double sellPrice, DrumstickSizeType size) {
        super(brand, buyPrice, sellPrice);
        this.size = size;
    }

    public DrumstickSizeType getSize() {
        return this.size;
    }

    public double calculateMarkup() {
        return ((super.sellPrice - super.buyPrice)/super.buyPrice);
    }
}
