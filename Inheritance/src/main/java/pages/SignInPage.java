package pages;

import Utils.User;
import headers.HeaderModule;
import headers.HeaderModuleForLoggedUser;
import headers.HeaderModuleForUnLoggedUser;

public class SignInPage implements Page {

    private boolean isLoggedIn;

    @Override
    public void printPageTitle() {
        System.out.printf("Page title is: %n" + this.getClass().getSimpleName());
    }


    public HeaderModule logIn(User user) {
        user.setLoggedIn(true);
        if(!user.isLoggedIn()){
            return new HeaderModuleForUnLoggedUser();
        } else {
            return new HeaderModuleForLoggedUser();
        }
    }
}
