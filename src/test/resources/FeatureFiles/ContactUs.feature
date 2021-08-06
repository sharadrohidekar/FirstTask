Feature: Enter all the fields in Contact Us

	@ContactUs @One
  Scenario: Verify whether the user is able to enter all fields
    Given I launch the application
    And I click on Contact Us
		And I enter the Name field "wxyx"
		And I enter the Phone field "0987654321"
		And I enter the Email field "abc@gmail.com"
		And I enter the Description field "Hello All!!!" 
   