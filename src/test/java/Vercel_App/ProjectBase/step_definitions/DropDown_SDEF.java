package Vercel_App.ProjectBase.step_definitions;

import Vercel_App.ProjectBase.pages.VercelBasePage;
import Vercel_App.ProjectBase.utilities.BrowserUtils;
import Vercel_App.ProjectBase.utilities.ConfigurationReader;
import Vercel_App.ProjectBase.utilities.Driver;
import Vercel_App.ProjectBase.utilities.VercellConstants;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDown_SDEF extends VercelBasePage {

    @Given("the user navigates {string} page of the Vercel app")
    public void the_user_navigates_page_of_the_vercel_app(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pageClicker("Dropdown");
    }

    @Then("user should be able to validate the page items")
    public void user_should_be_able_to_validate_the_page_items() {
        Assert.assertEquals(VercellConstants.ERROR_MESSAGE, VercellConstants.DROPDOWN, getDropdownPageValidation().getText());
    }

    @Then("user checks simple dropdown menu and validates")
    public void user_checks_simple_dropdown_menu_and_validates() {
        Assert.assertEquals(VercellConstants.ERROR_MESSAGE, VercellConstants.SIMPLE_DROPDOWN, getSimpleDropdownValidation().getText());

        Select select = new Select(getSelectDropdown());

        select.selectByValue("1");
        Assert.assertEquals(VercellConstants.DROPDOWN_OPTION_ONE, select.getFirstSelectedOption().getText());
        BrowserUtils.justWait(2000);
        select.selectByValue("2");
        Assert.assertEquals(VercellConstants.DROPDOWN_OPTION_TWO, select.getFirstSelectedOption().getText());
    }

    @Then("user inputs the date of birth as {string} {string} {string} and validates it is visible")
    public void user_Inputs_The_Date_Of_Birth_As_And_Validates_It_Is_Visible(String year, String month, String day) {

        Select selectYear = new Select(getSelectYearDropdown());
        List<WebElement> years = selectYear.getOptions();
        for (WebElement eachYear : years) {
            if (eachYear.getText().equals(year)) {
                eachYear.click();
                Assert.assertEquals(eachYear.getText(), year);
            }
        }

        Select selectMonth = new Select(getSelectMonthDropdown());
        List<WebElement> months = selectMonth.getOptions();
        for (WebElement eachMonth : months) {
            if (eachMonth.getText().equals(month)) {
                eachMonth.click();
                Assert.assertEquals(eachMonth.getText(), month);
            }
        }
        Select selectDay = new Select(getSelectDayDropdown());
        List<WebElement> days = selectDay.getOptions();
        for (WebElement eachDay : days) {
            if (eachDay.getText().equals(day)) {
                eachDay.click();
                Assert.assertEquals(eachDay.getText(), day);
            }
        }
    }

    @Then("user selects a {string}")
    public void user_selects_a(String state) {

        Assert.assertEquals(VercellConstants.ERROR_MESSAGE, VercellConstants.SELECT_STATE, getStateSelectionValidation().getText());
        Select selectState = new Select(getSelectState());
        List<WebElement> states = selectState.getOptions();
        for (WebElement eachState : states) {
            if (eachState.getText().equals(state)) {
                eachState.click();
                Assert.assertEquals(VercellConstants.ERROR_MESSAGE, eachState.getText(), state);
            }
        }
    }

    @Then("user selects {string}")
    public void user_selects(String progLang, List<String> languages) {
        Assert.assertEquals(VercellConstants.ERROR_MESSAGE, VercellConstants.SELECT_LANGUAGE, getLanguageSelectionValidation().getText());
        Select selectLang = new Select(getSelectLanguage());
        List<WebElement> langList = selectLang.getOptions();
        for (WebElement eachLang : langList) {
           // System.out.println(eachLang.getText());
            if (eachLang.getText().equals(progLang) && languages.contains(eachLang.getText())) {
                eachLang.click();
                Assert.assertEquals(VercellConstants.ERROR_MESSAGE, eachLang.getText(), progLang);
            }
        }
    }

    @Then("user selects a {string} from dropdown link window")
    public void user_selects_a_from_dropdown_link_window(String webpage, List<String> webPages) {
        Assert.assertEquals(VercellConstants.ERROR_MESSAGE, VercellConstants.SELECT_WEBPAGE, getSelectWebsiteValidation().getText());
        getSelectWebPage().click();

        List<WebElement> pageList = Driver.getDriver().findElements(By.xpath("//div[@class='dropdown-menu show']/a"));

        for ( WebElement each : pageList ) {
            System.out.println(each.getText());
            if( each.getText().contains(webpage) ){
                each.click();
            }
        }


//        for(WebElement eachWebpage : webpageList ){
//            System.out.println(eachWebpage.getText());
//            if ( eachWebpage.getText().equals(webpage) && webPages.contains(eachWebpage.getText()) ){
//                eachWebpage.click();
//                Assert.assertEquals(VercellConstants.ERROR_MESSAGE,eachWebpage.getText(),webpage);
//            }
//        }


    }


}
