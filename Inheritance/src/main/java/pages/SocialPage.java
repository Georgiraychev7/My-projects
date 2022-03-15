package pages;

public class SocialPage implements Page {

    @Override
    public void printPageTitle() {
        System.out.printf("Page title is: %n"+ this.getClass().getSimpleName());
    }
}
