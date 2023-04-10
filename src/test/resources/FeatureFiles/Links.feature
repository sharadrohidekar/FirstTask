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
    And user clicks on links
    Then user enters github link "https://github.com/sharadrohidekar"
    And user enters linkedin link "https://www.linkedin.com/in/sharad-rohidekar-3036b7154/"
    Then user clicks on savebutton
    