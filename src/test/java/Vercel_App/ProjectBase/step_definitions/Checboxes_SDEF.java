package Vercel_App.ProjectBase.step_definitions;

import Vercel_App.ProjectBase.pages.VercelBasePage;
import Vercel_App.ProjectBase.utilities.BrowserUtils;
import Vercel_App.ProjectBase.utilities.ConfigurationReader;
import Vercel_App.ProjectBase.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Checboxes_SDEF extends VercelBasePage {

    @Given("the user is on the checkboxes page")
    public void the_user_is_on_the_checkboxes_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pageClicker("Checkboxes");
    }

    @Then("user verify the checkboxes are visible")
    public void user_verify_the_checkboxes_are_visible() {
        Assert.assertTrue(getCheckboxOne().isDisplayed());
        Assert.assertTrue(getCheckboxTwo().isDisplayed());
        getCheckboxTwo().click();
    }

    @Then("user click on first checkbox and verifies it is selected")
    public void user_click_on_first_checkbox_and_verifies_it_is_selected() {
        getCheckboxOne().click();
        Assert.assertTrue(getCheckboxOne().isSelected());
        getCheckboxOne().click();
    }

    @Then("user click on second checkbox and verifies it is selected")
    public void user_click_on_second_checkbox_and_verifies_it_is_selected() {
        getCheckboxTwo().click();
        Assert.assertTrue(getCheckboxTwo().isSelected());
        getCheckboxTwo().click();
    }

    @Then("user de-selected both checkboxes and verifies that no checkbox selected")
    public void user_de_selected_both_checkboxes_and_verifies_that_no_checkbox_selected() {
        Assert.assertFalse(getCheckboxOne().isSelected());
        Assert.assertFalse(getCheckboxTwo().isSelected());
    }

}
