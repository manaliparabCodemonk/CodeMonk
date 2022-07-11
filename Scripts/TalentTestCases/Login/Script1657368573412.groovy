import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
String workFlow
//try {
//    WebUI.click(findTestObject('SignUp/btnLoginHere'))
//}
//catch (Exception e) {
//} 
if(WorkFlow.contains('Talent')) {
 
	  WebUI.sendKeys(findTestObject('SignUp/txtboxEmail'), GlobalVariable.EmailTalent)
      WebUI.sendKeys(findTestObject('SignUp/txtboxPassword'), GlobalVariable.PasswordTalent)
	  
	  WebUI.comment( GlobalVariable.EmailTalent +" is Logged In")
  }
  else if(WorkFlow.contains('Client')) {
	  WebUI.sendKeys(findTestObject('SignUp/txtboxEmail'), GlobalVariable.EmailClient)
	  WebUI.sendKeys(findTestObject('SignUp/txtboxPassword'), GlobalVariable.PasswordClient)
	  
	  WebUI.comment( GlobalVariable.EmailClient +" is Logged In")
  } 
  else if(WorkFlow.contains('Admin')) {
	  WebUI.sendKeys(findTestObject('SignUp/txtboxEmail'), GlobalVariable.EmailAdmin)
	  WebUI.sendKeys(findTestObject('SignUp/txtboxPassword'), GlobalVariable.PasswordAdmin)
	  
	  WebUI.comment( "Admin is Logged In")
  }
WebUI.click(findTestObject('SignUp/btnLogin'))

try {
    assert WebUI.verifyElementPresent(findTestObject('Profile/User Profile'), 1)
	System.out.println("Unbale to login " +GlobalVariable.EmailTalent)
}
catch (Exception e) {
    assert WebUI.verifyTextPresent('SignUp/VerifyTextLoginUnSuccessful', 'The email/password is incorrect. Please enter the correct details to continue.')
//assert false
	} 


