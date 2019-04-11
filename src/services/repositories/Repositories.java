package services;

public class Repositories {
    private static Repositories ourInstance = new Repositories();

    public static Repositories getInstance() {
        return ourInstance;
    }

    private Repositories() {
    }
}
