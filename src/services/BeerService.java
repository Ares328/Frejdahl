package services;

import domain.Beer;
import domain.Viking;

import java.util.ArrayList;
import java.util.List;

public class BeerService {
    private static List<Beer> allBeers = new ArrayList<>();

    public static List<Beer> getAllBeers(){

        // luksusøl
        //TODO: create Vikings based on the names
        allBeers.add(new Beer("JOTUN",5.8,0,50, new Viking()));
        allBeers.add(new Beer("SIGURD",6.3,0,90, new Viking()));
        allBeers.add(new Beer("FAFNER",7.9,0,100, new Viking()));
        allBeers.add(new Beer("GUDMUND",5.8,0,60, new Viking()));
        allBeers.add(new Beer("HERJA",8.0,0,110, new Viking()));
        allBeers.add(new Beer("ROULV",9.0,0,120, new Viking()));
        allBeers.add(new Beer("BRYNHILD",12.0,0,130, new Viking()));
        allBeers.add(new Beer("SKOLDER",6.0,0,70, new Viking()));
        allBeers.add(new Beer("THYRA",4.6,0,10, new Viking()));

        // OKOLOGISKE OL
        allBeers.add(new Beer("FULLA",5.7,0,40, new Viking()));
        allBeers.add(new Beer("GULDTOP",4.8,0,20, new Viking()));
        allBeers.add(new Beer("NIDHUG",5.2,0,30, new Viking()));
        allBeers.add(new Beer("VALRAVN",6.0,0,80, new Viking()));

        // MJOD
        allBeers.add(new Beer("GUDRUN",19.0,0,140, new Viking()));
        allBeers.add(new Beer("GUNLØD",19.0,0,150, new Viking()));

        return allBeers;
    }
}
