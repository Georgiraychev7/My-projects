package headers;

import pages.ExplorePage;
import pages.MyRidesPage;
import pages.RegisterPage;
import pages.SignInPage;

public class HeaderModuleForUnLoggedUser extends HeaderModule{

    @Override
    public MyRidesPage clickOnCreateRideButton() {
        return new MyRidesPage();
    }

    @Override
    public ExplorePage clickOnExploreButton() {
        return new ExplorePage();
    }

    //Same for those two methods. implemented in parent and throwing error in other child
    @Override
    public RegisterPage clickOnRegisterButton(){
        return new RegisterPage();
    }

    @Override
    public SignInPage clickOnSignInButton(){
        return new SignInPage();
    }
}
