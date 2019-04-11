package domain;

import java.util.ArrayList;
import java.util.List;

public class Beer {

    private String name;
    private double alcoholPercentage;
    private double price;
    private List<Flavor> flavors;
    private int value;
    private Viking viking;

    public Beer(){

    }

    public Beer(String name, double alcoholPercentage, double price, int value,Viking viking) {
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
        setName(name);
        setValue(value);
        setViking(viking);
        //flavors = new ArrayList<>();
    }

    public Viking getViking() {
        return viking;
    }

    public void setViking(Viking viking) {
        this.viking = viking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addToFlavorsList(Flavor flavor){
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

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                ", price=" + price +
                ", flavors=" + flavors +
                ", value=" + value +
                '}';
    }
}
