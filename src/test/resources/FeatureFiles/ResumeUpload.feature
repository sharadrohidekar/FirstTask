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
    And user clicks on resume upload
    Then user clicks on update resume
    And user clicks on Drop your resume here or Browse "C:\\Users\\Win10\\Desktop\\QA-Sharad (1).pdf"
    Then user clicks on submit button