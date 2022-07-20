
Feature: Login as Talent and verify if Refer and Earn is working
  
  ##Verify if Refer and Earn is working
  Scenario: Verify if Refer and Earn is working
    Given user launches "Codemonk" website
   	When user enters username and password
    And user read the test data sheet "ReferEarnDetails" from file "CodemonkTestdata.xls"
    Then verify user is on "Talent About You" page
    
    When user clicks on "Refer and Earn" menu
    And user selects "Copy link"
    And user verifies Invite link copied and stores the list of Recommended jobs
    
    When user selects "Invite by email"
  	And user verifies "Refer and earn exciting rewards" table 
  	 When user enter details on "Refer and Earn" page for "Talent"
  	And user clicks on "Send" button
  	And user verifies email received or not
  	And user launches new tab for Recommended jobs
  	Then verifies list of Recommended jobs
  	And user logs out from application 	
  	And closes browser
  