package services;

import domain.Beer;

import java.util.ArrayList;
import java.util.List;

public class BeerService {
    private static List<Beer> allBeers = new ArrayList<>();

    public static List<Beer> getAllBeers(){
        allBeers.add(new Beer());
        return allBeers;
    }
}
