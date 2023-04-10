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
  	And user clicks on Training Institution
  	Then user clicks on add TI
  	And  user enters to "Automation Testing" 
  	Then user enters "KRN Informatix"
  	Then user clicks on No to current institute
  	And user clicks on start date
  	Then user selects year "2022"
  	And user selects month "5"
  	Then user clicks on date 6th
  	And user clicks on 	End date 
  	Then user selects the year "2022"
  	And user selects the month "8"
  	Then user clicks on date 30th
  	And user enters description as "Training has been completed successfully"
  	Then user clicks on save TI