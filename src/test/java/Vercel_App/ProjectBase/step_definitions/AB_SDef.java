package Vercel_App.ProjectBase.step_definitions;

import Vercel_App.ProjectBase.pages.VercelBasePage;
import Vercel_App.ProjectBase.utilities.ConfigurationReader;
import Vercel_App.ProjectBase.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AB_SDef {

    VercelBasePage basePage = new VercelBasePage();

    @Given("the user is on the landing page of the Vercel app")
    public void the_user_is_on_the_landing_page_of_the_vercel_app() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));

    }

    @Given("user should be able to see menu items and validate them")
    public void user_should_be_able_to_see_menu_items_and_validate_them() {
        List<WebElement> menuItems = Driver.getDriver().findElements(By.xpath("//li[@class='list-group-item']"));
       // List<String> actualMenuItems = menuItems.stream().map(WebElement::getText).toList();
        List<String> expectedMenuItems = Arrays.asList(
                "A/B Testing", "Add/Remove Elements", "Autocomplete", "Basic Auth (user and pass: admin)", "Broken Images",
                "Challenging DOM", "Checkboxes", "Context Menu", "Disappearing Elements", "Drag and Drop", "Drag and Drop Circles",
                "Dropdown", "Dynamic Content", "Dynamic Controls", "Dynamic Loading", "Entry Ad", "Exit Intent", "File Download",
                "File Upload", "Floating Menu", "Forgot Password", "Form Authentication", "Frames", "Geolocation",
                "Horizontal Slider", "Hovers", "Infinite Scroll", "Inputs", "JQuery UI Menus", "JavaScript Alerts",
                "JavaScript onload event error", "Key Presses", "Large & Deep DOM", "Multiple Buttons", "Multiple Windows",
                "Nested Frames", "New tab", "Notification Messages", "Radio Buttons", "Redirect Link", "Registration Form",
                "Secure File Download", "Shifting Content", "Sign Up For Mailing List", "Slow Resources", "Sortable Data Tables",
                "Status Codes", "Typos", "WYSIWYG Editor", "Web Tables"
        );
       // assertEquals("Test Failed....",expectedMenuItems,actualMenuItems);

    }

    @When("the user clicks on the AB Testing button")
    public void the_user_clicks_on_the_ab_testing_button() {
        basePage.getABButton().click();
    }


    @Then("the user should be directed to the AB testing page")
    public void the_user_should_be_directed_to_the_ab_testing_page() {
        assertEquals("Test Failed...", basePage.getNoABtext().getText(), "No A/B Test");
        Driver.getDriver().navigate().back();

    }


}
