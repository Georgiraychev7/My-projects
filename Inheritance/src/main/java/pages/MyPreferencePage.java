package pages;

public class MyPreferencePage implements Page {

    @Override
    public void printPageTitle() {
        System.out.printf("Page title is: %n" + this.getClass().getSimpleName());

    }
}
