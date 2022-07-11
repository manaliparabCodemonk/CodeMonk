@Client
Feature: Client Journeys - Create Talent, Edit Profile, Edit Email Id and Password, Edit Payment Details and verify Refer and Earn

  Scenario: Create Client
    
  	Given user launches "Codemonk" website for "Client"
 	  When user creates email and password for "Client"
    Then verify user is on "Client About You" page
    When user read the test data sheet "ClientSignUp" from file "CodemonkTestdata.xls"
    And user selects "Continue with free plan"
  	#  
    When user enter details on "About you" on "Talent" page
    And clicks on "Continue" button and verify "About you" is completed
    And user selects "Continue with free plan"
      
    And user enter details on "Company" on "Talent" page
    And clicks on "Continue" button and verify "Company" is completed
    And user selects "Continue with free plan"   
    
    And user enter details on "Locations" on "Talent" page
    And clicks on "Continue" button
     
    Then verify user is on "Client Dashboard" page
  	And user logs out from application
  	And closes browser
   	
  	 
 Scenario: Create Three Projects and Create Three Job Brief
 
    Given user launches "Codemonk" website
   	When user enters username and password for "Client"
    When user read the test data sheet "Projects Briefs" from file "CodemonkTestdata.xls"
	  ##
	  When user selects "New project"
 	  And user enter details on "Add Project" on "Project" for "1" time
 		Then verify project is added for "1" time
 		##
 		When user clicks on Create brief
 		 And user enter details on "Create brief" on "Project" for "1" time
 		Then verify brief is added for "1" time
 		##
 		 When user selects "New project"
 	  And user enter details on "Add Project" on "Project" for "2" time
 		Then verify project is added for "2" time
 		##
 		When user clicks on Create brief
 		 And user enter details on "Create brief" on "Project" for "2" time
 		Then verify brief is added for "2" time
 		##
 		 When user selects "New project"
 	  And user enter details on "Add Project" on "Project" for "3" time
 		Then verify project is added for "3" time
 		##
 		When user clicks on Create brief
 		 And user enter details on "Create brief" on "Project" for "3" time
 		Then verify brief is added for "3" time
 		##
 		
  
  	 