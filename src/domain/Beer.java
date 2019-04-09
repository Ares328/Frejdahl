package domain;

import java.util.ArrayList;
import java.util.List;

public class Beer {

    private Viking viking;
    private double alcoholPercentage;
    private double price;
    private List<Flavor> flavors;
    private int tag;

    public Beer(Viking viking, double alcoholPercentage, double price, int tag) {
        setViking(viking);
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
        setTag(tag);
        flavors = new ArrayList<>();
    }

    public Beer(){

    }

    public void addflavorsList(Flavor flavor){
        this.flavors.add(flavor);
    }

    public Viking getViking() {
        return viking;
    }

    public void setViking(Viking viking) {
        this.viking = viking;
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
                "viking=" + viking +
                ", alcoholPercentage=" + alcoholPercentage +
                ", price=" + price +
                ", flavors=" + flavors +
                ", tag=" + tag +
                '}';
    }
}
