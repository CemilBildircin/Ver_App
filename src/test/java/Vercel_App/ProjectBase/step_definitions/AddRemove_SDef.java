package Vercel_App.ProjectBase.step_definitions;

import Vercel_App.ProjectBase.pages.VercelBasePage;
import Vercel_App.ProjectBase.utilities.ConfigurationReader;
import Vercel_App.ProjectBase.utilities.Driver;
import io.cucumber.java.en.*;

public class AddRemove_SDef extends VercelBasePage {

    @When("the user navigates to the Add-Remove page")
    public void the_user_navigates_to_the_add_remove_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pageClicker("Add/Remove Elements");

    }

    @Then("the user adds {int} elements")
    public void the_user_adds_elements(Integer addNum) {

        for (int i = 0; i < addNum; i++) {
            getAddElementButton().click();
        }
    }

    @Then("the user removes {int} elements")
    public void the_user_removes_elements(Integer int1) {

        for (int i = 0; i < int1; i++) {
            getRemoveElementButton().click();
        }

    }

    @Then("the user navigates back to the landing page")
    public void the_user_navigates_back_to_the_landing_page() {
        Driver.getDriver().navigate().back();
    }

}
