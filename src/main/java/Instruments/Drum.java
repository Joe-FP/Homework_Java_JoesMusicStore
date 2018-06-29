package Instruments;

import ENUMS.BrandType;
import ENUMS.CategoryType;
import ENUMS.DrumSubType;
import Instruments.Instrument;

public class Drum extends Instrument implements Interfaces.iSell, Interfaces.iPlay  {

    DrumSubType subType;

    public Drum(CategoryType category, BrandType brand, String model, double buyPrice, double sellPrice, DrumSubType subType) {
        super(category, brand, model, buyPrice, sellPrice);
        this.subType = subType;
    }

    public DrumSubType getSubType() {
        return this.subType;
    }

    public double calculateMarkup() {
        return ((super.sellPrice - super.buyPrice)/super.buyPrice);
    }

    public String play() {
        return "Boom boom boom";
    }
}
