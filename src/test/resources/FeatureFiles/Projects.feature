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
    And user clicks on projects
    Then user add on to the project
    And user enters project name "e2eHiring"
    Then user enters role "Automation Tester"
    And user enters client name "e2eHiring"
    Then user selects 1 year duration 
    And user selects 0 months 
    Then user enters technology name "Cucumber Framework"
    And user enters project description "Web Testing done automatically"
    Then user clicks on project save