Feature: Automating filling of profile


  @Profile
  Scenario: Automate filling of profile
    Given user launches the application
    When user enter username "sssinsandur@gmail.com"
    Then user enters password "Rohi@635"
    And user clicks on login button.
    Then user is in home page
    When user clicks on profile
    Then user clicks on view profile
    And user clicks on skill 
    Then user click on edit skill button
    And user enters skill "Selenium" "Java" "Cucumber Framework"
    Then user clicks on enter 
    And user clicks on Save button