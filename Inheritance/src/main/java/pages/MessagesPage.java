package pages;

public class MessagesPage implements Page{

    @Override
    public void printPageTitle() {
        System.out.printf("Page title is: %n" + this.getClass().getSimpleName());
    }
}
