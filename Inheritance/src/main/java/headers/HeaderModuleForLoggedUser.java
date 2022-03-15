package headers;

import pages.ExplorePage;
import pages.MessagesPage;
import pages.MyRidesPage;
import pages.ProfileDropDown;

public class HeaderModuleForLoggedUser extends HeaderModule {

    @Override
    public MyRidesPage clickOnCreateRideButton() {
        return new MyRidesPage();
    }

    @Override
    public ExplorePage clickOnExploreButton() {
        return new ExplorePage();
    }

    //Those two implementations are good but since you are returning parent. You could implement them in parent class with error in unlogged user header
    @Override
    public MessagesPage clickOnMessageButton(){
        return new MessagesPage();
    }

    @Override
    public ProfileDropDown clickOnProfileButton(){
        return new ProfileDropDown();
    }

}
