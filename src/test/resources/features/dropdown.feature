Feature: User checks and verifies the dropdown page features

  @dropdown
  Scenario: User checks all the dropdown menus
    Given the user navigates "dropdown" page of the Vercel app
    Then user should be able to validate the page items
    And user checks simple dropdown menu and validates
    And user inputs the date of birth as "1989" "February" "18" and validates it is visible
    And user selects a "Georgia"
    And user selects "Python"
      | Java       |
      | JavaScript |
      | C#         |
      | Python     |
      | Ruby       |
      | C          |
    Then user selects a "Etsy" from dropdown link window
      | Google   |
      | Amazon   |
      | Yahoo    |
      | Facebook |
      | Etsy     |
