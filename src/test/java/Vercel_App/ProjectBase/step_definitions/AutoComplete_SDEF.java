package Vercel_App.ProjectBase.step_definitions;

import Vercel_App.ProjectBase.pages.VercelBasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoComplete_SDEF extends VercelBasePage {
    private String selectedCountry;

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String autoComplete) {
        pageClicker("Autocomplete");

    }

    @When("the user enters {string} into the country selection window")
    public void the_user_enters_into_the_country_selection_window(String country) {
        selectedCountry = country;
        autoComplete(country);
    }


    @Then("the user should see options and select the first option and click the submit button")
    public void the_user_should_select_the_first_option_and_click_the_submit_button() {
        autoCompleteCountryList("GA");

    }

    @Then("the user should see the selected country name")
    public void the_user_should_see_the_selected_country_name() {
        selectedCountryValidation("Gambia");

    }


}
