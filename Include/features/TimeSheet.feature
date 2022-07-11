@Talent
Feature: Timesheet Creation, In Draft, Submitted , In Review , Rejected and Settled Status
## Dependent on Allocate Talent
  	Scenario: Create Timesheet with Status as Submitted
  	##
  	Given user launches "Codemonk Login" website
    When user enters username and password for "Talent"
    When user read the test data sheet "TimeSheet" from file "CodemonkTestdata.xls"
 	  And user clicks on "Timesheets" menu
 	  ##
 	  When user adds Timesheet for last week 
 	  And clicks on "Save to draft"
		Then verify Timesheet status as "Draft" 	
		And verify Time Logged and Earnings
		##
		When "Talent" edits Timesheet for last week 
		And clicks on "Submit"
		Then verify Timesheet status as "Submitted" 
  	And user logs out from application 	
  	##
  	Scenario: Verify Timesheet with Status as In Review
		##  
  	When user enters username and password for "Admin"
  	When user clicks on "Timesheets" menu
  	And "Admin" edits Timesheet for last week ##Submitted to In Review
	  And user logs out from application 	
	  ##
		When user enters username and password for "Talent"
	 	And user clicks on "Timesheets" menu
	  Then verify Timesheet status as "In review" 	
	 	And user logs out from application 	
	  ##
	  Scenario: Verify Timesheet with Status as Reject
	  ##
	  When user enters username and password for "Admin"
  	And user clicks on "Timesheets" menu
  	And "Admin" edits Timesheet for last week ##In Review to Reject
	  And user logs out from application 	  
	  ##
	  When user enters username and password for "Talent"
	  And user clicks on "Timesheets" menu
 	  When user adds Timesheet for last week 
 	  And "Talent" edits Timesheet for rejected week 
		Then verify Timesheet status as "Submitted" 	
		And verify Time Logged and Earnings
	  And user logs out from application 	 
		##
	  Scenario: Verify Timesheet with Status as Approved
	  ##
		When user enters username and password for "Admin"
  	When user clicks on "Timesheets" menu
  	And "Admin" edits Timesheet for last week ##Submitted to Approved
  	Then verify Timesheet status as "Approved" 	
  	And verify Bill is generated and download it
	  And user logs out from application 	   
		##
		When user enters username and password for "Talent"
	  And user clicks on "Timesheets" menu
 		Then verify Timesheet status as "Approved" 	
  	And verify Bill is generated and download it
  	##
    Scenario: Verify Timesheet with Status as Settled
    ##
  	When user enters username and password for "Admin"
  	When user clicks on "Timesheets" menu
  	And "Admin" edits Timesheet for last week ##Approved to Settled
  	Then verify Timesheet status as "Settled" 	
  	And verify Bill is generated and download it
	  And user logs out from application 	   
		##
		When user enters username and password for "Talent"
	  And user clicks on "Timesheets" menu
 		Then verify Timesheet status as "Settled" 	
  	And verify Bill is generated and download it
  	##
  	When user enters username and password for "Client"
	  And user clicks on "Timesheets" menu
 		Then verify Timesheet status as "Settled" 				
    