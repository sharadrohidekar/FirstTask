Feature: Products from the Store

			Scenario: Verify the products from the Your Store
			Given I launch the application
	    And I click on My Account 
	    And I click on Login 
	    And I enter the Email Address "preeti.sajjan@diatoz.com"
	    And I enter the Password "sajjan"
	    And I click on Login button
	    Then I navigate to Your Store
	    Then I view all the products from Desktop
	    Then I view all the products from Laptop and Notebooks
	    Then I view all the products from components
	    Then I view all the products from Tablates
	    Then I view all the products from Software
	    Then I view all the products from Phones and PDA's
	    Then I view all the products from Cameras
	    Then I view all the products from MP Players

