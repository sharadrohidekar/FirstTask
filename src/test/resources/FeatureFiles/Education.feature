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
    And user clicks on Education
    And user clicks on add button
    Then user enters schoolname "M S Ramaiah Institute of Technology"
    And user clicks on degree 
    Then user selects Post Graduate Diploma
    And user selects Mechanical Engineering
    Then user clicks on Passing year 
    Then user clicks CGPA score 
    And user enters score "8.5"
    Then user clicks medium English
    And user clicks Course Type Full Time
    Then user clicks on save education
