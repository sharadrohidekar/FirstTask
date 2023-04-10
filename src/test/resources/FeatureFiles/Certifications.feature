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
    And user clicks on certifications
    Then user clicks on edit certification
    And user enters certification Name "Automation Tester"
    Then user enters certifiedby "KRN Informatix"
    And user enters Link optional "https://www.linkedin.com/in/sharad-rohidekar-3036b7154/"
    Then user clicks on issued on
    And user clicks on year "2022"
    Then user clicks on month "10"
    Then user clicks on 30th
    And user clicks on valid till
    Then user clicks on the year "2023"
    And user clicks on the month "11"
    And user clicks on date 31st
    Then user enters grade "A"
    And user clicks on checkbox Lifetime Validity
    Then user clicks on Save button on certification
