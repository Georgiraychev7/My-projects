package normalUser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Browser;
import utils.CommonVerifcations;

public class SortByDropDownMenuTestPhonesAndPdas {


    @BeforeMethod
    public void setUp() {
        Browser.open("chrome");
    }

    @Test
    public void currencyTypesTest() {


        PhoneAndPdasPage.goTo();
        CommonVerifcations.verifyTitle("Phones & PDAs","errorMessegeTitelIsNotEqual");

        PhoneAndPdasPage.selectOptionFromSortByDropDownMenu("Rating (Highest)");


    }


    @BeforeMethod
    public void setDown(){
        Browser.quit();
    }
    
}