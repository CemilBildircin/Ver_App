Feature: User checking the drag and drop feature of the web application

  @smoke @dragAndDrop @ui
  Scenario: user checking the drag and drop function of the application
    Given the user navigates to the drag and drop page
    Then the user drags element A to the top of element B and verifies that location of the elements have changed
    And the user drags element B to the top of element A and verifies that location of the elements have changed
