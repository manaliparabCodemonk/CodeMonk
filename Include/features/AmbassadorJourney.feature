@Ambassador
Feature: Ambassador Journeys - Create Ambassador, Login , Edit Profile Id and Password, Send Talent Invite

  Scenario: Create Ambassador
    
  	Given user launches "Codemonk" website for "Ambassador"
 	  When user creates email and password for "Ambassador"
    Then verify user is on "Talent-partner About You" page
    When user read the test data sheet "AmbassadorSignUp" from file "CodemonkTestdata.xls"
  	#  
    When user enter details on "About you" on "Client" page
    And clicks on "Continue" button and verify "About you" is completed
    
    Then verify user is on "Talent-partner Dashboard" page
  	And user logs out from application
  	And closes browser
    	
  Scenario: Login as Ambassador and Edit Profile
    
  	Given user launches "Codemonk" website
 	  When user enters username and password for "Ambassador"
    
    And user read the test data sheet "ChangeProfileDetails" from file "CodemonkTestdata.xls"
    Then verify user is on "Talent-partner About You" page
 		#    
    When user clicks on "Profile" icon
    And user selects "My profile"
    When user updates Profile Details
    
    And user clicks on "Profile" icon
    
    And user selects "My profile"
     Then verify Profile Details are updated for "Ambassador"
   	And user logs out from application 	
  	And closes browser
  
   	Scenario: Login as Ambassador and Send an invite Client
    
  	Given user launches "Codemonk" website
 	  When user enters username and password for "Ambassador"
 	  When user read the test data sheet "Ambassador" from file "CodemonkTestdata.xls"
    Then verify user is on "Ambassador About You" page
 		##
 		When user selects "Clients" tab
   	When user selects "Invite by email"
  	And user verifies "Refer and earn cash per referral" table 
  	And user enter details on "Client" on "Ambassador" for "1" time
  	And user clicks on "Send" button
  	And user logs out from application 	
  	And user verifies email received or not
  	##
  	And "Client" launches new window for Sign Up
  	Then verifies if "Client Sign Up" page is launched
  	##
  	When user creates password for "Client" via Invite link
    Then verify user is on "Client About You" page
    When user read the test data sheet "ClientSignUpInvite" from file "CodemonkTestdata.xls"
    And user selects "Continue with free plan"
  	##  
    When user enter details on "About you" on "Client" page
    And clicks on "Continue" button and verify "About you" is completed
    # 
    And user enter details on "Company" on "Client" page
    And clicks on "Continue" button and verify "Company" is completed
 		##  
    And user enter details on "Locations" on "Client" page
    And clicks on "Continue" button
  	##   
    Then verify user is on "Client Dashboard" page
    And user logs out from application 	
    #
    When user enters username and password for "Client"
    Then verify user is on "Client Dashboard" page
    And user logs out from application 	
   	And closes browser
   	###
   	
   	Scenario: Login as Ambassador and Send an invite Talent
    ##
  	Given user launches "Codemonk" website
 	  When user enters username and password for "Ambassador"
 	  When user read the test data sheet "Ambassador" from file "CodemonkTestdata.xls"
    Then verify user is on "Ambassador Dashboard" page
 		##
 		When user selects "Talents" tab
 		When user selects "Invite by email"
  	And user verifies "Refer and earn cash per referral" table 
  	And user enter details on "Talent" on "Ambassador" for "2" time
  	And user clicks on "Send" button
  	And user logs out from application 	
  	And user verifies email received or not
  	##
  	And "Talent" launches new window for Sign Up
  	Then verifies if "Talent Sign Up" page is launched
  	##
  	When user creates password for "Talent" via Invite link
    Then verify user is on "Talent About You" page
    When user read the test data sheet "TalentSignUpInvite" from file "CodemonkTestdata.xls"
  	##  
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
  	##
  	 When user enters username and password for "Talent"
    Then verify user is on "Talent Dashboard" page
    And user logs out from application 	
   	And closes browser
  	 	
  	Scenario: Login as Ambassador and Reset Password
    
  	Given user launches "Codemonk" website
 	  When user Reset password for "Ambassador"
    Then verify user is on "Talent-partner About You" page
 		#   
   	And user logs out from application 	
  	And closes browser
  	