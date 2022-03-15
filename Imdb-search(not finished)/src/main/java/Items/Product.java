package Items;

public class Product {

    public String title;
    public double rating;
    public String genre;

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Product(String title, Double rating, String genre) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Items.Product{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
}
