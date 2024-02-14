package Vercel_App.ProjectBase.step_definitions;

import Vercel_App.ProjectBase.pages.VercelBasePage;
import Vercel_App.ProjectBase.utilities.ConfigurationReader;
import Vercel_App.ProjectBase.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop_SDEF extends VercelBasePage {

    @Given("the user navigates to the drag and drop page")
    public void the_user_navigates_to_the_drag_and_drop_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pageClicker("Drag and Drop");
    }

    @Then("the user drags element A to the top of element B and verifies that location of the elements have changed")
    public void the_user_drags_element_a_to_the_top_of_element_b_and_verifies_that_location_of_the_elements_have_changed() {

        String actual = getDragAndDropVerification().getText();
        String expected = "A";
        Assert.assertEquals("Expected and Actual results are not matching...", expected, actual);
        Actions myAction = new Actions(Driver.getDriver());
        myAction.clickAndHold(getDragAndDropElementOne()).moveToElement(getDragAndDropElementTwo()).release().perform();
        String actualTwo = getDragAndDropVerification().getText();
        Assert.assertNotEquals(expected, actualTwo);

    }

    @Then("the user drags element B to the top of element A and verifies that location of the elements have changed")
    public void the_user_drags_element_b_to_the_top_of_element_a_and_verifies_that_location_of_the_elements_have_changed() {
        Actions myAction = new Actions(Driver.getDriver());
        myAction.clickAndHold(getDragAndDropElementTwo()).moveToElement(getDragAndDropElementOne()).release().perform();
        String actualThree = getDragAndDropVerification().getText();
        String expected = "A";
        Assert.assertEquals("Expected and Actual results are not matching...", expected, actualThree);
    }

}
