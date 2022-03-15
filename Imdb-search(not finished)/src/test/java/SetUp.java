import ImdbSearch.AdvanceSearch;
import ImdbSearch.Search;
import Items.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SetUp {

    public static LinkedList<Product> setUpDb(){

        List<Season> gameOfThronesSeasons = new ArrayList<Season>();
        List<Season> friendsSeasons = new LinkedList<Season>();
        List<Season> vikingsSeasons = new LinkedList<Season>();
        List<String> actors = new LinkedList<String>();

        TvMovie lordOfTheRings = new TvMovie("Lord Of The Rings",9.8,"Action",230,actors);
        TvMovie greenBook = new TvMovie("Green book",9.8,"Action",230,actors);
        TvSeries friends = new TvSeries("Friends",9.0,"Comedy", friendsSeasons,6);
        TvSeries gameOfThrones = new TvSeries("Game of Thrones",8.0,"fantastic", gameOfThronesSeasons,8);
        TvSeries vikings = new TvSeries("Vikings",5.5,"fantastic", vikingsSeasons,7);
        VideoGame callOfDuty = new VideoGame("Call of Duty",7.7,"Action","Windows 10,Linux",true);
        VideoGame medalOFHonor = new VideoGame("Medal OF Honor",8.8,"Action","Windows 10,Linux",true);
        VideoGame riseOfNations = new VideoGame("Rise of nations",5.1,"Action","Windows 10,Linux",true);

        LinkedList<Product> store = new LinkedList<>();

        store.add(lordOfTheRings);
        store.add(friends);
        store.add(callOfDuty);
        store.add(gameOfThrones);
        store.add(medalOFHonor);
        store.add(riseOfNations);
        store.add(greenBook);
        store.add(vikings);

        friendsSeasons.add(new Season("Season 1",20,7.7));
        friendsSeasons.add(new Season("Season 2",20,8.7));
        friendsSeasons.add(new Season("Season 3",20,8.8));
        friendsSeasons.add(new Season("Season 4",20,6.6));
        friendsSeasons.add(new Season("Season 5",20,5.5));
        friendsSeasons.add(new Season("Season 6",20,7.7));

        gameOfThronesSeasons.add(new Season("Season 1",10,8.0));
        gameOfThronesSeasons.add(new Season("Season 2",10,8.9));
        gameOfThronesSeasons.add(new Season("Season 3",10,8.3));
        gameOfThronesSeasons.add(new Season("Season 4",10,5.9));
        gameOfThronesSeasons.add(new Season("Season 5",10,4.5));
        gameOfThronesSeasons.add(new Season("Season 6",10,6.7));
        gameOfThronesSeasons.add(new Season("Season 7",10,6.0));
        gameOfThronesSeasons.add(new Season("Season 8",10,9.0));

        return store;
    }
}
