package pages;

public class MyRidesPage implements Page {

    @Override
    public void printPageTitle() {
        System.out.printf("Page title is: %n" + this.getClass().getSimpleName());

    }
}
