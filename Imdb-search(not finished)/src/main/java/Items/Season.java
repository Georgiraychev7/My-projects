package Items;

public class Season {

    private String title;
    private int numberOfEpisodes;
    private Double rating;

    public String getTitle() {
        return title;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public Double getRating() {
        return rating;
    }

    public Season(String title, int numberOfEpisodes, Double rating) {
        this.title = title;
        this.numberOfEpisodes = numberOfEpisodes;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                ", numberOfEpisodes=" + numberOfEpisodes +
                ", rating=" + rating +
                '}';
    }
}
