package domain;

import java.util.ArrayList;
import java.util.List;

public class Beer {

    private double alcoholPercentage;
    private double price;
    private List<Flavor> flavors;
    private int tag;
    private int value;

    public Beer(Viking viking, double alcoholPercentage, double price, int tag) {
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
        setTag(tag);
        flavors = new ArrayList<>();
    }

    public Beer(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addflavorsList(Flavor flavor){
        this.flavors.add(flavor);
    }
    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Beer{" +
                ", alcoholPercentage=" + alcoholPercentage +
                ", price=" + price +
                ", flavors=" + flavors +
                ", tag=" + tag +
                '}';
    }
}
