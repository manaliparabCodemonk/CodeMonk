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
//
//for (int i = 1; i < GlobalVariable.testData.length; i++) {
//    String xlWorkflow = (GlobalVariable.testData[i])[1]
//
//    String xlPageName = (GlobalVariable.testData[i])[2]
//
//    String xlFieldType = (GlobalVariable.testData[i])[3]
//
//    String xlFieldLabel = (GlobalVariable.testData[i])[4]
//
//    String xlFieldValue = (GlobalVariable.testData[i])[5]
//
//    if (xlFieldValue.contains('Password')) {
//        xlFieldValue = GlobalVariable.Password
//    } else if (xlFieldLabel.contains('Enter your new email address')) {
//        GlobalVariable.EmailTalent = xlFieldValue
//    } else if (xlFieldLabel.contains('New Password')) {
//        GlobalVariable.Password = xlFieldValue
//	} else if (xlFieldLabel.contains('Email')) {
//		xlFieldValue =GlobalVariable.EmailTalent 
//	}
//    
//    WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/enterDetails'), [('xlWorkflow') : xlWorkflow, ('xlPageName') : xlPageName
//            , ('xlFieldType') : xlFieldType, ('xlFieldLabel') : xlFieldLabel, ('xlFieldValue') : xlFieldValue], FailureHandling.STOP_ON_FAILURE)
//}

WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/enterDetailsCommon'), FailureHandling.STOP_ON_FAILURE)
	
//Click on Send Code
//WebUI.click(findTestObject('Profile/Account settings/Send Code'))
//Retrieve Code
code = WebUI.callTestCase(findTestCase('CommonTestCases/getEmailChangeVerificationCode'), [('email') : GlobalVariable.EmailTalent], 
    FailureHandling.STOP_ON_FAILURE)

System.out.println(code)

//Verify code
WebUI.sendKeys(findTestObject('SignUp/txtboxVerificationCode'), code)

WebUI.click(findTestObject('Profile/Account settings/Verify'))

//Verify text email is changed successfully
WebUI.verifyElementText(findTestObject('Profile/Account settings/VerifyEmailChangeMessage'), 'Your email address has been changed successfully')

WebUI.delay(3)

//Change password
WebUI.click(findTestObject('Profile/Account settings/Change password'))

//Verify text password is changed succesfully 
WebUI.verifyElementText(findTestObject('Profile/Account settings/VerifyPasswordChangeMessage'), 'Your password has been changed successfully.')
