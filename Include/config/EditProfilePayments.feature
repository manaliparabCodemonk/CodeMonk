
Feature: Login as Talent and change Email/Password and Payment details
  #Change Profile name and verify 
  Scenario: Login as Talent and change payment details
    Given user launches "Codemonk" website
   	When user enters username and password
    And user read the test data sheet "ChangeProfileDetails" from file "CodemonkTestdata.xls"
    Then verify user is on "Talent About You" page
    
    When user clicks on "Profile" icon
    And user selects "My profile"
    And user clicks on Profile Edit
    When user updates Profile Details
    And user clicks on "Profile" icon
    And user selects "My profile"
    Then verify Profile Details are updated
  	And user logs out from application 	
  	And closes browser
  	
 ##Change Payment Details via Bank Account  
  Scenario: Login as Talent and change payment details
    Given user launches "Codemonk" website
   	When user enters username and password
    And user read the test data sheet "ChangePaymentDetails" from file "CodemonkTestdata.xls"
    Then verify user is on "Talent About You" page
    
    When user clicks on "Profile" icon
    And user selects "Account settings"
    And user selects "Payment"
    When user updates "Payment Details"
  	And user logs out from application 	
  	And closes browser
  	
  ##Change Payment Details via Paypal ID
  Scenario: Login as Talent and change payment details
    Given user launches "Codemonk" website
   	When user enters username and password
    And user read the test data sheet "ChangePaymentDetails2" from file "CodemonkTestdata.xls"
    Then verify user is on "Talent About You" page
    
    When user clicks on "Profile" icon
    And user selects "Account settings"
    And user selects "Payment"
    When user updates "Payment Details"
  	And user logs out from application 	
  	And closes browser
 