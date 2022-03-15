package Items;

public class VideoGame extends Product{

    private String supportedOS;
    private boolean isMultiPlayer = true;

    public VideoGame(String title, Double rating, String genre, String supportedOS, boolean isMultiPlayer) {
        super(title, rating, genre);
        this.supportedOS = supportedOS;
        this.isMultiPlayer = isMultiPlayer;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", supportedOS='" + supportedOS + '\'' +
                ", isMultiPlayer=" + isMultiPlayer +
                '}';
    }
}
