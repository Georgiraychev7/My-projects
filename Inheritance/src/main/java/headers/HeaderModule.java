package headers;

import pages.*;

public class HeaderModule {

    public MyRidesPage clickOnCreateRideButton() {
        return new MyRidesPage();
    }

    public ExplorePage clickOnExploreButton(){
        return new ExplorePage();
    }

    public MessagesPage clickOnMessageButton() throws Exception {
        throw new Exception();
    }

    public RegisterPage clickOnRegisterButton() throws Exception{
        throw  new Exception();
    }

    public SignInPage clickOnSignInButton() throws Exception{
        throw  new Exception();
    }

    public ProfileDropDown clickOnProfileButton() throws Exception{
        throw new Exception();
    }
}
