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
    And user clicks on Personal Information
    Then user clicks on add personal
    And user clicks on male
    Then user enters language "Kannada"
    Then user enters pincode "583119"
    Then user clicks on save PI
