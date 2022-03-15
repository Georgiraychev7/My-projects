package ImdbSearch;

import Items.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AdvanceSearch extends Search {

    private static List<Product> products = new ArrayList<>();
    private static List<Season> seasons = new ArrayList<>();

    public AdvanceSearch(List<Product> products) {
        super(products);
    }

    public void printSeasonsTitlesWithRatingMoreThanSeven(List<Season>seasons) {
        for (Season season : seasons) {
            if (season != null && season.getRating() > 7) {
                System.out.println(season.getTitle());
            }
        }
    }

    public List<Product> createNewListWithVideoGames(List<Product> products) {
        List<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product instanceof VideoGame) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> createNewListWithTvMovies(List<Product> products) {
        List<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product instanceof TvMovie) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> createNewListWithTvSeries(List<Product> products) {
        List<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product instanceof TvSeries) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> createNewListWithTvSeriesWithRatingBetweenSixAndNine(List<Product> products) {
        List<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product instanceof TvSeries && product.rating >=6 && product.rating <= 9) {
                result.add(product);
            }
        }
        return result;
    }
}

