package domain;

import java.util.ArrayList;
import java.util.List;

public enum Flavor {

    BITTER(new ArrayList<>()),
    BOLD_HERBAL_CITRIC(new ArrayList<>()),
    BRIGHT(new ArrayList<>()),
    BRISK_HOPPINESS(new ArrayList<>()),
    DARK(new ArrayList<>()),
    DARK_AND_DRY(new ArrayList<>()),
    DELICATE(new ArrayList<>()),
    DELICATE_FRUIT(new ArrayList<>()),
    EARTHY(new ArrayList<>()),
    EARTH_AND_DRY(new ArrayList<>()),
    FRUITY_AND_VINEOUS(new ArrayList<>()),
    FRUIT_AND_TOFFEE(new ArrayList<>()),
    MALTY_BACKBONE(new ArrayList<>()),
    MALT_ACCENTED(new ArrayList<>()),
    SPICY_AND_MEATY(new ArrayList<>()),
    SUBDUED_SMOLDER(new ArrayList<>()),
    TOASTY_AND_NUTTY(new ArrayList<>());

    private List<String> keywords;

    Flavor(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public void addKeyword(String keyword){
        this.keywords.add(keyword);
    }

}
// https://www.splendidtable.org/story/the-7-flavor-categories-of-beer-what-they-are-how-to-pair-them
