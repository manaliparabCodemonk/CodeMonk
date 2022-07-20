@Talent
Feature: Create Talent, Client and Client Posting 3 Job Briefs and 3 Projects, Talent applies to Job Application and gets Hired

  Scenario: Create Talent
    
  	Given user launches "Codemonk" website for "Talent"
 	 
 	 When user creates email and password for "Talent"
   Then verify user is on "Talent About You" page
       
    When user read the test data sheet "TalentSignUp" from file "CodemonkTestdata.xls"
  	  
    When user enter details on "About you" on "Talent" page
    And clicks on "Continue" button and verify "About you" is completed
      
    And user enter details on "Qualifications" on "Talent" page
    And clicks on "Continue" button and verify "Qualifications" is completed 
        
    And user enter details on "Experience" on "Talent" page
    And clicks on "Continue" button and verify "Experience" is completed
      
    And user enter details on "Projects" on "Talent" page
    And clicks on "Continue" button and verify "Projects" is completed
    
    And user enter details on "Preferences" on "Talent" page
    And clicks on "Continue" button and verify "Preferences" is completed
    
    And user enter details on "Salary and Billing" on "Talent" page
    And clicks on "Continue" button and verify "Salary & Billing" is completed
    
    And user enter details on "Document upload" on "Talent" page
    And clicks on "Continue" button
    
    Then verify user is on "Talent Dashboard" page  	
    And user logs out from application 	
    
   Scenario: Create Client
    
  	Given user launches "Codemonk" website for "Client"
 	  When user creates email and password for "Client"
    Then verify user is on "Client About You" page
    When user read the test data sheet "ClientSignUp" from file "CodemonkTestdata.xls"
    And user selects "Continue with free plan"
  	#  
    When user enter details on "About you" on "Client" page
    And clicks on "Continue" button and verify "About you" is completed
    And user selects "Continue with free plan"
      
    And user enter details on "Company" on "Client" page
    And clicks on "Continue" button and verify "Company" is completed
    And user selects "Continue with free plan"   
    
    And user enter details on "Locations" on "Client" page
    And clicks on "Continue" button
     
    Then verify user is on "Client Dashboard" page
    
    ####################################Client creates Job Briefs and Projects #########################################################
    When user read the test data sheet "UpgradePlan" from file "CodemonkTestdata.xls"
	  ##
	  And user Upgrades Plan
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
 			And user logs out from application 	
 		
 		########################################################################################################
  Scenario: Talent logins and applies for Job Applications
 		
 		Given user launches "Codemonk" website for "Talent"
    When user enters username and password for "Talent"
    When user read the test data sheet "JobApplications" from file "CodemonkTestdata.xls"
 	  And user clicks on "Jobs" menu
   	And searches for "Automation Test Analyst" 
  	And user selects first result
  	And user selects "Apply"
   And enters other details in Your application
  	Then verifies Job Application email is received to "Talent"
  	And verify Job Application status as "Applied"
		And user logs out from application 	
  	
 	########################################################################################################
  	Scenario: Client views Job Application and takes action as Interview and Hires Talent
  	
  	Given user launches "Codemonk" website for "Client"
  	When user enters username and password for "Client"
  	When user read the test data sheet "UpgradePlan" from file "CodemonkTestdata.xls"
  	#And user Upgrades Plan
  	And user clicks on "Job Briefs" menu
  	And searches for "Automation Test Analyst" 
  	##
  	And views "Applications" 
  	And user clicks on "Action" moves to "Interview"
  	And user selects Interview slot
  	Then verify Application is moved to "Interviewed"
  	##
  	And verifies Job Application email is received to "Client" on Yopmail
  	When user clicks on "Action" moves to "Shortlist"
  	Then verify Application is moved to "Shortlisted"
  	##
  	When user clicks on "Action" moves to "Hire"
  	Then verify Application is moved to "Hired" 
   	And user logs out from application 	
  #	########################################################################################################
  	Scenario: Login as Admin and allocate a Talent
  		
  	Given user launches "Codemonk" website for "Admin"
  	When user enters username and password for "Admin"
  	And user read the test data sheet "AdminAllocateTalent" from file "CodemonkTestdata.xls"
  	##
  	When user clicks on "Projects" menu
  	And admin allocates Talent to "Inform Comms" project
  	And user logs out from application 	
  	##
		When user enters username and password for "Client"
		And user clicks on "Projects" menu
		And user verifies if Talent is added to "Inform Comms"
		And user logs out from application 	
  	And closes browser
  
  	
  	
  	
  	