package pages;

import headers.HeaderModuleForUnLoggedUser;

public class ProfileDropDown implements Page {

    @Override
    public void printPageTitle() {

    }

    public MyProfilePage clickOnMyProfilePageButton(){
        return new MyProfilePage();
    }

    public void clickOnMyPreferencePageButton(){
        System.out.println("My Preference Page");;
    }
    public MyStatisticsPage clickOnMyStatisticsPageButton(){
        return new MyStatisticsPage();
    }
    public MyRidesPage clickOnMyRidesPageButton(){
        return new MyRidesPage();
    }
    public SocialPage clickOnSocialPageButton(){
        return new SocialPage();
    }
    public HeaderModuleForUnLoggedUser logOutButton(){
        return new HeaderModuleForUnLoggedUser();
    }

}
