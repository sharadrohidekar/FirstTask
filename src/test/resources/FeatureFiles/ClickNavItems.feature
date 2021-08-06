Feature: Click on nav items

	@ClickNavItems @One
  Scenario: Verify whether the user is clicking on each nav item
    Given I launch the application
    And I click on Home
    And I click on Services
    And I click on Products
    And I click on AboutUs
    And I click on CaseStudio
    And I click on Blogs
    And I click on Careers
    And I click on ContactUs  