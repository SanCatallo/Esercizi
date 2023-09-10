package Esercizi.DefaultMethodsOverride;

import java.util.Objects;

public class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone: " + brandName + "Model: " + modelName + "Battery: " + batterymAh + "Price: " + producerPrice + "Retail: " + retailPrice;
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Smartphone that = (Smartphone) a;
        return batterymAh == that.batterymAh &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(producerPrice, that.producerPrice) &&
                Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) this.producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) this.retailPrice.clone();
        return clonedSmartphone;
    }
}