Feature: Validate Login and mentorship form functionality
		
		@Login
	  Scenario: Validate Login and mentorship Functionality
    Given user launches the application
    When user enter username "sssinsandur@gmail.com"
    Then user enters password "Rohi@635"
    And user clicks on login button.
    Then click on mentorship button.
    And click on overview button
    Then scroll down to Registration for Orientation
    And click on Registration for Orientation
    
    
    