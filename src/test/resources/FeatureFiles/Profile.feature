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
    Then user enters first name "Sharad"
    And user enters last name "Rohidekar"
    Then user enters headline "Software Testing"
    And user clicks on Industry and selects Animation
    Then user clicks on Academic Completion Year
    Then user selects 2015
    And user clicks on Candidate Type as Fresher
    Then user enters current city "Bangalore"
    And user clicks on Notice Period
    And selects Joining Immediatley
    Then user scrolls down a little bit to see the screen properly
    And user clicks on Save button
