@Talent
Feature: Create Talent

  Scenario: Create Talent
    #
  	Given user launches "Codemonk" website
 	  When user creates email and password
    Then verify user is on "Talent About You" page
    #   
    When user read the test data sheet "TalentSignUp" from file "CodemonkTestdata.xls"
  	#  
    When user enter details on "About you" on "Talent" page
    And clicks on "Continue" button and verify "About you" is completed
    #  
    And user enter details on "Qualifications" on "Talent" page
    And clicks on "Continue" button and verify "Qualifications" is completed
    #    
    And user enter details on "Experience" on "Talent" page
    And clicks on "Continue" button and verify "Experience" is completed
    #  
    And user enter details on "Projects" on "Talent" page
    And clicks on "Continue" button and verify "Projects" is completed
    #
    And user enter details on "Preferences" on "Talent" page
    And clicks on "Continue" button and verify "Preferences" is completed
    #
    And user enter details on "Salary and Billing" on "Talent" page
    And clicks on "Continue" button and verify "Salary & Billing" is completed
    #
    And user enter details on "Document upload" on "Talent" page
    And clicks on "Continue" button
    #
    Then verify user is on "Talent Dashboard" page
  	And user logs out from application
  	
  	
  
