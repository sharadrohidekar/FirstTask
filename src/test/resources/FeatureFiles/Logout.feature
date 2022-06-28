Feature: Logout from the portal
		
		@Logout
	  Scenario: Verify whether the User Logout is sucessful
    Given I launch the application
    And I click on My Account 
    And I click on Login 
    And I enter the Email Address "preeti.sajjan@diatoz.com"
    And I enter the Password "sajjan"
    And I click on Login button
    Then I click on My Account 
    And I click on Logout