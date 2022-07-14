@Talent
Feature: Talent Journeys - Create Talent, Edit Profile, Edit Email Id and Password, Edit Payment Details and verify Refer and Earn

  #Scenario: Create Talent
  #	Given user launches "Codemonk" website for "Talent"
 #	  When user creates email and password for "Talent"
    #Then verify user is on "Talent About You" page
       #
    #When user read the test data sheet "TalentSignUp" from file "CodemonkTestdata.xls" 
    #When user enter details on "About you" on "Talent" page
    #And clicks on "Continue" button and verify "About you" is completed
      #
    #And user enter details on "Qualifications" on "Talent" page
    #And clicks on "Continue" button and verify "Qualifications" is completed
        #
    #And user enter details on "Experience" on "Talent" page
    #And clicks on "Continue" button and verify "Experience" is completed
      #
    #And user enter details on "Projects" on "Talent" page
    #And clicks on "Continue" button and verify "Projects" is completed
    #
    #And user enter details on "Preferences" on "Talent" page
    #And clicks on "Continue" button and verify "Preferences" is completed
    #
    #And user enter details on "Salary and Billing" on "Talent" page
    #And clicks on "Continue" button and verify "Salary & Billing" is completed
    #
    #And user enter details on "Document upload" on "Talent" page
    #And clicks on "Continue" button
    #
    #Then verify user is on "Talent Dashboard" page  	
  #	And user logs out from application
  #	And closes browser
  #	 #	
  #	 
 ##Change Profile name and verify 
  #Scenario: Login as Talent and change profile details
    #Given user launches "Codemonk" website
   #	When user enters username and password for "Talent"
    #And user read the test data sheet "ChangeProfileDetails" from file "CodemonkTestdata.xls"
    #Then verify user is on "Talent About You" page
    #
    #When user clicks on "Profile" icon
    #And user selects "My profile"
    #And user clicks on Profile Edit
    #When user updates Profile Details
    #And user clicks on "Profile" icon
    #And user selects "My profile"
    #Then verify Profile Details are updated
  #	And user logs out from application 	
  #	And closes browser
  #	
  #Change Payment Details via Bank Account  
  #Scenario: Login as Talent and change payment details via Bank Account  
    #Given user launches "Codemonk" website
   #	When user enters username and password for "Talent"
    #And user read the test data sheet "ChangePaymentDetails" from file "CodemonkTestdata.xls"
    #Then verify user is on "Talent About You" page
    #
    #When user clicks on "Profile" icon
    #And user selects "Account settings"
    #And user selects "Payment"
    #When user updates "Payment Details"
  #	And user logs out from application 	
  #	And closes browser
  #	
 # Change Payment Details via Paypal ID
  #Scenario: Login as Talent and change payment details via Paypal ID
    #Given user launches "Codemonk" website
   #	When user enters username and password for "Talent"
    #And user read the test data sheet "ChangePaymentDetails2" from file "CodemonkTestdata.xls"
    #Then verify user is on "Talent About You" page
    #
    #When user clicks on "Profile" icon
    #And user selects "Account settings"
    #And user selects "Payment"
    #When user updates "Payment Details"
  #	And user logs out from application 	
  #	And closes browser
 #
  #	
  #Verify if Refer and Earn is working
  #Scenario: Verify if Refer and Earn is working and verifying Recommended Jobs list 
    #Given user launches "Codemonk" website
   #	When user enters username and password for "Talent"
    #And user read the test data sheet "ReferEarnDetails" from file "CodemonkTestdata.xls"
    #Then verify user is on "Talent About You" page
    #
    #When user clicks on "Refer and Earn" menu
    #And user selects "Copy link"
    #And user verifies Invite link copied and stores the list of Recommended jobs
    #
    #When user selects "Invite by email"
  #	And user verifies "Refer and earn exciting rewards" table 
  #	 When user enter details on "Refer and Earn" page for "Talent"
  #	And user clicks on "Send" button
  #	And user verifies email received or not
  #	And user launches new tab for Recommended jobs
  #	Then verifies list of Recommended jobs
  #	And user logs out from application 	
  #	And closes browser
  	 
  	 
	##Change Email and Password 
  Scenario: Login as Talent and change email and password
    Given user launches "Codemonk" website
   	 When user enters username and password for "Talent"
    And user read the test data sheet "ChangeEmailPassword" from file "CodemonkTestdata.xls"
    Then verify user is on "Talent About You" page
    
    When user clicks on "Profile" icon
    And user selects "Account settings"
    And user selects "Security"
    When user updates "New Email" and "Password"
  	And user logs out from application 	
    
     When user enters username and password for "Talent"
    Then verify user is on "Talent Dashboard" page
		And user logs out from application 	
   	And closes browser
