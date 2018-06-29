package Instruments;

import ENUMS.BrandType;
import ENUMS.CategoryType;

public abstract class Instrument {

    CategoryType category;
    BrandType brand;
    String model;
    double buyPrice;
    double sellPrice;

    public Instrument(CategoryType category, BrandType brand, String model, double buyPrice, double sellPrice) {
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public CategoryType getCategory() {
        return this.category;
    }

    public BrandType getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
