import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import junit.framework.TestSuite as TestSuite
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

String code
String Email
String Password

Email = CustomKeywords.'com.CommonFunctions.Helper.generateRandomEmail'(workFlow)

WebUI.sendKeys(findTestObject('SignUp/Email'),Email)

System.out.println(Email)

Password ='AutoTest@123'

WebUI.sendKeys(findTestObject('SignUp/txtboxPassword'), Password)

WebUI.click(findTestObject('SignUp/checkboxIAgree'))

if(workFlow.equals('Recruiter') || workFlow.equals('Ambassador'))
{	
	WebUI.click(findTestObject('SignUp/Create my free account'))
}
else {
	WebUI.click(findTestObject('SignUp/btn_Signup'))
}
WebUI.waitForElementPresent(findTestObject('SignUp/txtboxVerificationCode'), 10)

code = WebUI.callTestCase(findTestCase('CommonTestCases/Get Verification Code'), [('Email') : Email], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('SignUp/txtboxVerificationCode'), code)


if(workFlow.equals('Client'))
{
	GlobalVariable.EmailClient=Email
	GlobalVariable.PasswordClient=Password
	
	WebUI.click(findTestObject('SignUp/btnContinueWithFreePlan'))
	
	WebUI.comment("New Sign Up for Client "+GlobalVariable.EmailClient)
	
}else if(workFlow.equals('Talent'))
{
	GlobalVariable.EmailTalent=Email
	GlobalVariable.PasswordTalent=Password	
	
	WebUI.click(findTestObject('SignUp/Skip now'))
	
	WebUI.comment("New Sign Up for Talent "+GlobalVariable.EmailTalent)
	
}
else if(workFlow.equals('Recruiter'))
	{
		GlobalVariable.EmailRecruiter=Email
		GlobalVariable.PasswordRecruiter=Password
		
		WebUI.comment("New Sign Up for Recruiter "+GlobalVariable.EmailRecruiter)
		
	}
else if(workFlow.equals('Ambassador'))
	{
		GlobalVariable.EmailAmbassador=Email
		GlobalVariable.PasswordAmbassador=Password		
		WebUI.comment("New Sign Up for Ambassador "+GlobalVariable.EmailAmbassador)
			
	}

