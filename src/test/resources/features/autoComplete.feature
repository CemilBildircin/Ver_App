Feature: Checking the functionality of Autocomplete page

  @autoComplete
  Scenario: User tests the autocomplete function
    Given the user is on the landing page of the Vercel app
    When the user clicks on the "autocomplete" button
    And the user enters "GA" into the country selection window
    And the user should see options and select the first option and click the submit button
    Then the user should see the selected country name