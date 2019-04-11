package services;

import domain.Beer;
import domain.Origin;
import domain.Viking;
import org.omg.CORBA.ORB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BeerService {
    private static List<Beer> allBeers = new ArrayList<>();

    public static List<Beer> getAllBeers(){

        // luksusøl
        //TODO: create Vikings based on the names
        allBeers.add(new Beer("JOTUN",5.8,0,50,
                new Viking("JOTUN","Jotun means giant. It's a big dangerous troll that robs mothers and teases gods",
                        Origin.NORSE)));
        allBeers.add(new Beer("SIGURD",6.3,0,90,
                new Viking("SIGURD", "Sigurd defeated Fafner with his horse Grane and his sword named Gram.",
                        Origin.NORDIC)));
        allBeers.add(new Beer("FAFNER",7.9,0,100,
                new Viking("FAFNER","Greek mighty dragon who guarded his treasure until the day he was killed",
                        Origin.GREEK)));
        allBeers.add(new Beer("GUDMUND",5.8,0,60,
                new Viking("GUDMUND","Gudmund was a semi-legendary Norse king in Jotunheim, ruling over a land called Glæsisvellir, which was known as the warrior's paradise",
                        Origin.NORSE)));
        allBeers.add(new Beer("HERJA",8.0,0,110,
                new Viking("HERJA", "Herja is a valkyrie attested in the longer of the two Nafnaþulur lists found in the Prose Edda",
                        Origin.NORSE)));
        allBeers.add(new Beer("ROULV",9.0,0,120,
                new Viking("ROULV","",
                        Origin.UNKNOWN)));
        allBeers.add(new Beer("BRYNHILD",12.0,0,130,
                new Viking("BRYNHILD", "Her name was Brynhild Budlasdatter. She was Valkyrie in Norway and mother of Queen Aslaug of Denmark, married to Ragnar Lodbrog.",
                        Origin.NORSE)));
        allBeers.add(new Beer("SKOLDER",6.0,0,70,
                new Viking("SKOLDER", "",
                        Origin.UNKNOWN)));
        allBeers.add(new Beer("THYRA",4.6,0,10,
                new Viking("THYRA", "She was called Thyra Danebod. Denmark's adornment and the woman who was married to Gorm Den Gamle. ",
                        Origin.UNKNOWN)));

        // OKOLOGISKE OL
        allBeers.add(new Beer("FULLA",5.7,0,40,
                new Viking("FULLA", "Fulla is described as wearing a golden band and as tending to the ashen box and the footwear owned by the goddess Frigg, and, in addition, Frigg confides in Fulla her secrets",
                        Origin.NORSE)));
        allBeers.add(new Beer("GULDTOP",4.8,0,20,
                new Viking("GULDTOP", "In Norse mythology, Gulltoppr (Old Norse \"golden mane\") is one of the horses of the gods. Gulltoppr is mentioned in ",
                        Origin.NORSE)));
        allBeers.add(new Beer("NIDHUG",5.2,0,30,
                new Viking("NIDHUG", "Níðhöggr (Malice Striker, traditionally also spelled Níðhǫggr, often anglicized Nidhogg) is a dragon/serpent who gnaws at a root of the world tree, Yggdrasil.",
                        Origin.NORSE)));
        allBeers.add(new Beer("VALRAVN",6.0,0,80,
                new Viking("VALRAVN", "",
                        Origin.UNKNOWN)));

        // MJOD
        allBeers.add(new Beer("GUDRUN",19.0,0,140,
                new Viking("GUDRUN", "Gudrun, which, according to Nordic literature, means \"the secret tradition of the gods\"",
                        Origin.NORSE)));
        allBeers.add(new Beer("GUNLØD",19.0,0,150,
                new Viking("GUNLØD","Gunlød was the beautiful mother who guarded Suttung's Mountain and was seduced by Odin when he stole the \"Shield of the Shield\"",
                        Origin.UNKNOWN)));

        return allBeers;
    }

    public static Viking getVikingByScore(int score){
        List<Beer>sortedByValueBeerList = getAllBeers().stream().sorted(new Comparator<Beer>() {
            @Override
            public int compare(Beer o1, Beer o2) {
                return o1.getValue() - o2.getValue();
            }
        }).collect(Collectors.toList());

        /*
        int closestValue=1000;
        Viking matchingViking = null;
        Beer matchingBeer = null;

        for (Beer beer : sortedByValueBeerList) {
            System.out.println(beer);
            int result = score % beer.getValue();

            if (result < closestValue) {
                closestValue = result;
                matchingBeer = beer;
                matchingViking = matchingBeer.getViking();
            }

        }

        return matchingViking;
        */
        return sortedByValueBeerList.get(new Random().nextInt(sortedByValueBeerList.size()-1)).getViking();
    }
}
