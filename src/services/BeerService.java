package services;

import domain.Beer;

import java.util.ArrayList;
import java.util.List;

public class BeerService {
    private static List<Beer> allBeers = new ArrayList<>();

    public static List<Beer> getAllBeers(){

        // luksusøl
        allBeers.add(new Beer("JOTUN",5.8,0));
        allBeers.add(new Beer("SIGURD",6.3,0));
        allBeers.add(new Beer("FAFNER",7.9,0));
        allBeers.add(new Beer("GUDMUND",5.8,0));
        allBeers.add(new Beer("HERJA",8.0,0));
        allBeers.add(new Beer("ROULV",9.0,0));
        allBeers.add(new Beer("BRYNHILD",12.0,0));
        allBeers.add(new Beer("SKOLDER [Limited Edition]",6.0,0));
        allBeers.add(new Beer("THYRA",4.6,0));

        // økologiske øl
        allBeers.add(new Beer("FULLA",5.7,0));
        allBeers.add(new Beer("GULDTOP",4.8,0));
        allBeers.add(new Beer("NIDHUG",5.2,0));
        allBeers.add(new Beer("VALRAVN",6.0,0));

        // mjød
        allBeers.add(new Beer("GUDRUN",19.0,0));
        allBeers.add(new Beer("GUNLØD",19.0,0));

        return allBeers;
    }
}
