package normalUser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Browser;
import utils.CommonVerifcations;

public class SearchBarTest {


    @BeforeMethod
    public void setUp(){
        Browser.open("chrome");

    }

    @Test
    public void searchBarTest(){

        NormalUserMainPage.goTo();
        NormalUserMainPage.cliclAndFillInSearchBarField("iPhone");

        CommonVerifcations.verifyTitle("Search - iPhone","errorInCaseThePageTitleIsDiffrent");




    }


    @AfterMethod
    public void  tearDown(){

        Browser.quit();

    }
}


