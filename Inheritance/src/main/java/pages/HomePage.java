package pages;

import Utils.User;
import headers.HeaderFactory;
import headers.HeaderModule;

public class HomePage  implements Page{

    public HeaderModule getHeader(User user){
        return HeaderFactory.headerFactory(user);
    }

    @Override
    public void printPageTitle() {
        System.out.printf("Page title is: %n" + this.getClass().getSimpleName());
    }
}
