package Instruments;

import ENUMS.BrandType;
import ENUMS.CategoryType;
import ENUMS.GuitarSubType;
import Instruments.Instrument;

public class Guitar extends Instrument implements Interfaces.iSell, Interfaces.iPlay {

    GuitarSubType subType;

    public Guitar(CategoryType category, BrandType brand, String model, double buyPrice, double sellPrice, GuitarSubType subType) {
        super(category, brand, model, buyPrice, sellPrice);
        this.subType = subType;
    }

    public GuitarSubType getSubType() {
        return this.subType;
    }

    public double calculateMarkup() {
        return ((super.sellPrice - super.buyPrice)/super.buyPrice);
    }

    public String play() {
        return "Guitar noise...";
    }
}
