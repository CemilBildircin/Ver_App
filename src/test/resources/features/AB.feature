Feature: Checking the AB button functionality

  @ABButton @smoke
  Scenario: User navigates to the AB testing page from the landing page of the Vercel App
    Given the user is on the landing page of the Vercel app
    And user should be able to see menu items and validate them
    When the user clicks on the AB Testing button
    Then the user should be directed to the AB testing page