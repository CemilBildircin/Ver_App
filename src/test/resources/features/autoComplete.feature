Feature: Checking the functionality of Autocomplete page

  @autocomplete
  Scenario: User tests the autocomplete function
    Given the user is on the landing page of the Vercel app
    When the user clicks on the "autocomplete" button
    And the user enters "G" and "e" into the country selection window
    Then the user should see options
    And the user should select the first option and click the submit button
    Then the user should see the selected country name