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
    And user clicks on work experience
    Then user clicks on add work exp button
    And user enters company name "e2eHiring.com"
    Then user clicks on current company
    And user selects Animation
    Then user selects designation Csa
    And user clicks on work from 
    Then user clicks on a year "2023"
    And user clicks onto the month "1"
    Then user clicks on 13th
    Then user clicks onto the year "2023"
    And user clicks on a month "3"
    Then user clicks on the 7th
    And user clicks on saveExp
