Feature: Automating upload of resume


  @Profile
  Scenario: Automate reesume upload
    Given user launches the application
    When user enter username "sssinsandur@gmail.com"
    Then user enters password "Rohi@635"
    And user clicks on login button.
    Then user is in home page
    When user clicks on profile
    Then user clicks on view profile
    And user clicks on Cover story
    Then user clicks on Upload
    And user selects upload video
    Then user clicks on BrowseFiles
    And selects files and upload
    Then user clicks on subbmit button