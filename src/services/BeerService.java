package services;

import domain.Beer;
import domain.Origin;
import domain.Viking;
import org.omg.CORBA.ORB;

import java.util.ArrayList;
import java.util.List;

public class BeerService {
    private static List<Beer> allBeers = new ArrayList<>();

    public static List<Beer> getAllBeers(){

        // luksusøl
        //TODO: create Vikings based on the names
        allBeers.add(new Beer("JOTUN",5.8,0,50,
                new Viking("Jotun means giant. It's a big dangerous troll that robs mothers and teases gods",
                        Origin.NORSE)));
        allBeers.add(new Beer("SIGURD",6.3,0,90,
                new Viking("Sigurd defeated Fafner with his horse Grane and his sword named Gram.",
                        Origin.NORDIC)));
        allBeers.add(new Beer("FAFNER",7.9,0,100,
                new Viking("Greek mighty dragon who guarded his treasure until the day he was killed",
                        Origin.GREEK)));
        allBeers.add(new Beer("GUDMUND",5.8,0,60,
                new Viking("Gudmund was a semi-legendary Norse king in Jotunheim, ruling over a land called Glæsisvellir, which was known as the warrior's paradise",
                        Origin.NORSE)));
        allBeers.add(new Beer("HERJA",8.0,0,110,
                new Viking("Herja is a valkyrie attested in the longer of the two Nafnaþulur lists found in the Prose Edda",
                        Origin.NORSE)));
        allBeers.add(new Beer("ROULV",9.0,0,120,
                new Viking("",
                        Origin.UNKNOWN)));
        allBeers.add(new Beer("BRYNHILD",12.0,0,130,
                new Viking("Her name was Brynhild Budlasdatter. She was Valkyrie in Norway and mother of Queen Aslaug of Denmark, married to Ragnar Lodbrog.",
                        Origin.NORSE)));
        allBeers.add(new Beer("SKOLDER",6.0,0,70,
                new Viking("",
                        Origin.UNKNOWN)));
        allBeers.add(new Beer("THYRA",4.6,0,10,
                new Viking("She was called Thyra Danebod. Denmark's adornment and the woman who was married to Gorm Den Gamle. ",
                        Origin.UNKNOWN)));

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
