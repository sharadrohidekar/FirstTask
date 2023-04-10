Feature: Automating filling of profile

  Scenario: Automate filling of profile
    Given user launches the application
    When user enter username "sssinsandur@gmail.com"
    Then user enters password "Rohi@635"
    And user clicks on login button.
    Then user is in home page
    When user clicks on profile
    Then user clicks on view profile
    Then user clicks on JobPreference
    And user clicks on editjob
    Then user clicks on fulltime
    And user clicks on work from office
    Then user clicks on enter the location "Bangalore"
    And user clicks on current salary
    Then user clicks on expected salary
    And user saves it.