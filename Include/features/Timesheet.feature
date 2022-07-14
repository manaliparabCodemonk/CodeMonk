@Talent
Feature: Timesheet Creation, In Draft, Submitted , In Review , Rejected and Settled Status

  # Dependent on Allocate Talent
  Scenario: Create Timesheet with Status as Submitted
    
  	Given user launches "Codemonk Login" website
    When user enters username and password for "Talent"
    When user read the test data sheet "Timesheet" from file "CodemonkTestdata.xls"
    And user clicks on "Timesheets" menu
    
    When user adds Timesheet for "1" time
    Then verify Timesheet status as "Draft"
    And verify Time Logged and Earnings for "1" time
    
    When "Talent" edits Timesheet for "2" time
    When user refresh browser
    Then verify Timesheet status as "Submitted"
    And verify Time Logged and Earnings for "2" time
    And user logs out from application

  
  Scenario: Verify Timesheet with Status as In Review
    
    When user enters username and password for "Admin"
    And user clicks on "Timesheets" menu
    And Admin verifies Timsheet for "1" time
    And Admin edits Timesheet status from "Submitted" to "In review"
    And user logs out from application
    
    When user enters username and password for "Talent"
    And user clicks on "Timesheets" menu
    Then verify Timesheet status as "In review"
    And user logs out from application
    
    Scenario: Verify Timesheet with Status as Rejected
    
    When user enters username and password for "Admin"
    And user clicks on "Timesheets" menu
    And Admin edits Timesheet status from "In review" to "Reject"
    And user logs out from application
    
    When user enters username and password for "Talent"
    And user clicks on "Timesheets" menu
    Then verify Timesheet status as "Rejected"
    When "Talent" edits Timesheet for "3" time
    Then verify Timesheet status as "Submitted"
    And user logs out from application

  
  Scenario: Verify Timesheet with Status as Approved
    
    When user enters username and password for "Admin"
    When user clicks on "Timesheets" menu
		And Admin edits Timesheet status from "Submitted" to "Approved"
		When user refresh browser
    Then verify Timesheet status as "Approved"
    And "Admin" verifies Bill is generated and download it
    And user logs out from application
    And closes browser
    
    Given user launches "Codemonk Login" website
    When user enters username and password for "Talent"
    And user clicks on "Timesheets" menu
    Then verify Timesheet status as "Approved"
    And "Talent" verifies Bill is generated and download it
    And user logs out from application
    And closes browser
  
  Scenario: Verify Timesheet with Status as Settled
    
    Given user launches "Codemonk Login" website
    When user enters username and password for "Admin"
    When user clicks on "Timesheets" menu
    And Admin edits Timesheet status from "Approved" to "Settled"
    Then verify Timesheet status as "Settled"
    And "Admin" verifies Bill is generated and download it
    And user logs out from application
    And closes browser
    
    Given user launches "Codemonk Login" website
    When user enters username and password for "Talent"
    And user clicks on "Timesheets" menu
    Then verify Timesheet status as "Settled"
    And "Talent" verifies Bill is generated and download it
    And user logs out from application
    And closes browser
    
    Given user launches "Codemonk Login" website
    When user enters username and password for "Client"
    And user clicks on "Timesheets" menu
    Then verify Timesheet status as "Settled"
    And closes browser
   
   ####Not to execute since defects gets fixed 
## #Scenario: Verify Talent is restricted to submit timesheet for 3 weeks ago
##   #	Given user launches "Codemonk Login" website
##   #	When user enters username and password for "Talent"
##   #	And user clicks on "Timesheets" menu
##   #	And user adds Timesheet for "4" time
##   #  Then verify Timesheet is not added 
##   #  And verify validation message
##   #  And user logs out from application
##   #  And closes browser