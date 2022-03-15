package Items;

import java.util.List;

public class TvSeries extends Product {

    //TODO: access modifier
    private List<Season> seasons;
    //TODO: numberOfSeasons == seasons.size()
    private int numberOfSeasons;

    public TvSeries(String title, Double rating, String genre, List<Season> seasons, int numberOfSeasons) {
        super(title, rating, genre);
        this.seasons = seasons;
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", seasons=" + seasons +
                ", numberOfSeasons=" + numberOfSeasons +
                '}';
    }
}
