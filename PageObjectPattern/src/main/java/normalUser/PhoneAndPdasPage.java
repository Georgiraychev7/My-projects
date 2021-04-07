package normalUser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class PhoneAndPdasPage {

    private static final String PHONEANDPDASPAGE = "http://shop.pragmatic.bg/index.php?route=product/category&path=24";
    private static final By SORTBYDROPDOWN = By.id("input-sort");

    /**
     * This method go to Phone and PDAS page.
     */
    public static void goTo() {

        Browser.driver.get(PHONEANDPDASPAGE);
    }

    /**
     * This method clicks on Sort By dropdown menu and make check that all current options are true
     * @param option
     */
    public static void selectOptionFromSortByDropDownMenu(String option) {

        WebElement sortByDropDown = Browser.driver.findElement(SORTBYDROPDOWN);
        Select make = new Select(sortByDropDown);
        assertFalse(make.isMultiple());
        assertEquals(make.getOptions().size(),9);

        List <String> expOpt = Arrays.asList("Default","Name (A - Z)","Name (Z - A)","Price (Low > High)","Price (High > Low)",
                "Rating (Highest)","Rating (Lowest)","Model (A - Z)","Model (Z - A)");
        List <String> actOpt = new ArrayList<>();
        List<WebElement>allOpt = make.getOptions();

        for(WebElement opt : allOpt){
            actOpt.add(opt.getText());
        }

        assertEquals(actOpt.toArray(),expOpt.toArray());

        make.selectByIndex(0);





    }


}
