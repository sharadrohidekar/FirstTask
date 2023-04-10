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
    And user clicks on About
    Then user enters details inside about section "Hi My name is Sharad and I am an Automation Tester"
    And user clicks on save about