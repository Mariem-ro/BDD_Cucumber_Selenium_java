


Feature: Customer
Background: all the common steps
	  Given User Launch Chrome browser 
	  When User opens URL 
	  And User enters Email and Password
	  And Click on Login 
    #Then Page Title should be "Dashboard / nopCommerce administration" 
    #When User click on customers menu
    #And Click on showed customers menu item   
  
  @regression
  Scenario: Add new customer
    When User click on customers menu
    And Click on showed customers menu item  
    And Click on add new customer link
    Then User view customer Add new costumer page
    When User Enter form fields
    And  User click on save
    Then User can view success message
    And logout
    And Close Browser
    
  @regression  
  Scenario: Search customer
    When User click on customers menu
    And Click on showed customers menu item  
    When User Email
    And  User click on search button
    Then User info will appear
    And logout
    And Close Browser
