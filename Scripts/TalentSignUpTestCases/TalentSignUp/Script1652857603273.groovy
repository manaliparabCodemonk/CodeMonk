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

String email

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

email = CustomKeywords.'com.CommonFunctions.Helper.generateRandomEmail'()

WebUI.sendKeys(findTestObject('PageSignUpCodeMonk/txtboxEmail'), email)

WebUI.sendKeys(findTestObject('PageSignUpCodeMonk/txtboxPassword'), 'AutoTest@123')

WebUI.click(findTestObject('PageSignUpCodeMonk/checkboxIAgree'))

WebUI.click(findTestObject('PageSignUpCodeMonk/btn_Signup'))

WebUI.waitForElementPresent(findTestObject('PageSignUpCodeMonk/txtboxVerificationCode'), 10)

code = WebUI.callTestCase(findTestCase('CommonTestCases/getVerificationCode'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('PageSignUpCodeMonk/txtboxVerificationCode'), code)

WebUI.waitForElementPresent(findTestObject('PageDashboardCodeMonk/labelDashboard'), 2)

