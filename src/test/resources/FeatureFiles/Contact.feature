Feature: Validate contact details

  Scenario: Validate contact Functionality
    Given user launches the application
    When user enter username "sssinsandur@gmail.com"
    Then user enters password "Rohi@635"
    And user clicks on login button.
    Then user is in home page
    When user clicks on profile
    Then user clicks on view profile
    Then user clicks on phone number
    And user clicks on edit button
    Then user enters phone number "8892112660"
    And user clicks on send OTP
    And user clicks on cancel button
