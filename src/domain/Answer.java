package domain;

public class Answer {
    private Flavor flavor;
    private String text;
    private int value;

    public Answer() {
    }

    public Answer(String text, int value) {
        setValue(value);
        setText(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
