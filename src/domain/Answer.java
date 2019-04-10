package domain;

public class Answer {
    private Flavor flavor;
    private int value;

    public Answer() {
    }

    public Answer(Flavor flavor, int value) {
        this.flavor = flavor;
        this.value = value;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
