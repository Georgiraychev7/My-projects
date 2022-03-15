package Items;

import java.util.List;

public class TvMovie extends Product{

    //TODO: access modifier
    private double duration;
    private List<String> actors;

    public TvMovie(String title, Double rating, String genre, double duration, List<String> actors) {
        super(title, rating, genre);
        this.duration = duration;
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "TvMovie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", actors=" + actors +
                '}';
    }
}
