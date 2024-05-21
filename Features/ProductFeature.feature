#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Product Feature
  
Background: all the common steps
	  Given User Launch Chrome browser 
	  When User opens URL 
	  And User enters Email and Password
	  And Click on Login 
    #And User click on customers menu
    #And Click on showed customers menu item 
@product    
  Scenario: Add new product
    And User click on Product menu
    And User click on product menu item 
    And User click on product menu item
    And User click on add new product
    Then Page with Add user form appear 
    When User enter Product information
    And click on save button
    
  Scenario: Search Product by name
    And User click on product menu item
    And User enter product name
    And User click on search
    Then product informations will appear 
@categorie        
  Scenario: Add new gategories
    And User click on Product menu
    And User click on categorie menu item 
    And User click on gategories menu item
    And User click on add new gategorie
    Then Page with Add gategorie form appear 
    When User enter gategorie information
    And click on save gategorie button
@manufacture
   Scenario: Add new Manufactures
    And User click on Product menu   
    And User click on Manufactures menu item
    And User click on add new Manufacture
    Then Page with Add Manufactures form appear 
    When User enter Manufacture information
    And click on add button
    #Then sucess message will appear    

   Scenario: Search Manufactures by name
    And User click on Product menu   
    And User click on Manufactures menu item
    And User enter Manufacture name
    And User click on search
    Then Manufacture informations will appear 
    
    
