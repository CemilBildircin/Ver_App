Feature: Checking the checkboxes and try multiple options

  @smoke @checkbox @ui
  Scenario: User test multiple different option on checkboxes
    Given the user is on the checkboxes page
    Then user verify the checkboxes are visible
    And user click on first checkbox and verifies it is selected
    And user click on second checkbox and verifies it is selected
    And user de-selected both checkboxes and verifies that no checkbox selected