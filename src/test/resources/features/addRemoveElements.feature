Feature: Checking the functionality of Add/Remove buttons

  @AddRemove @smoke
  Scenario: User tests the Add/Remove functionality from the landing page
    Given the user is on the landing page of the Vercel app
    When the user navigates to the Add-Remove page
    Then the user adds 5 elements
    And the user removes 5 elements
    And the user navigates back to the landing page