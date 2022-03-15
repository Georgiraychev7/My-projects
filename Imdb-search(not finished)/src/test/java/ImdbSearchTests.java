import ImdbSearch.AdvanceSearch;
import ImdbSearch.Search;
import Items.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class ImdbSearchTests {

    private Search search;
    private AdvanceSearch advanceSearch;

    @BeforeTest
    public void setUpDb(){
       LinkedList<Product> store = SetUp.setUpDb();
       search = new Search(store);
       advanceSearch = new AdvanceSearch(store);
    }

    @Test
    public void findTvSeriesByTitleAndPrintRatingForSeason8(){
        Product gameOfThrones = search.searchProductByTitle(store,"Game of thrones");
        Season seasonEightGameOfThrones = search.searchSeasonByTitle(gameOfThronesSeasons, "Season 8");
        System.out.println(seasonEightGameOfThrones.getRating());
    }

    @Test
    public void findAllActionProductsWithRatingMoreThan5AndPrintTitlesOfVideoGames(){
        List<Product> newListWithVideoGames = search.createNewListWithActionProductWithRatingMoreThanFive(store);
        search.returnTitlesOfActionVideoGame(newListWithVideoGames);
    }

    @Test
    public void findListOfTvSeriesWithRatingBetweenSixAndNineAndPrintSeasonsTitlesWithRatingMoreThanEight(){
        List<Product> newListWithTvSeriesWithRatingBetweenSixAndNine = advanceSearch.createNewListWithTvSeriesWithRatingBetweenSixAndNine(store);
        advanceSearch.printSeasonsTitlesWithRatingMoreThanSeven(gameOfThronesSeasons);
        System.out.println("==================");
        advanceSearch.printSeasonsTitlesWithRatingMoreThanSeven(friendsSeasons);
    }
}
