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

String code = ''
String Email 
String ResetPassword ="AutoTest@111"
String currentPage = WebUI.getUrl()

//Click on Forgot Password?
WebUI.click(findTestObject('SignUp/Forgot Password'))

Email= WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Send Username'), [('workFlow') : workFlow,('ResetPassword'):ResetPassword], FailureHandling.STOP_ON_FAILURE)

//Click on Send me a link
WebUI.click(findTestObject('SignUp/Send me a link'))

WebUI.delay(4)

int currentTab = WebUI.getWindowIndex()

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl('https://www.mailinator.com/v4/public/inboxes.jsp')

WebUI.sendKeys(findTestObject('Mailinator/txtboxPublicMessages'), Email)

WebUI.delay(2)

WebUI.click(findTestObject('Mailinator/btnGO'))

WebUI.click(findTestObject('Mailinator/labelFutureofworkcodemonk'))

WebUI.switchToFrame(findTestObject('Mailinator/frameEmailBody'), 5)

int currentTab2 = WebUI.getWindowIndex()

WebUI.delay(2)

WebUI.click(findTestObject('Mailinator/labelCode'))

WebUI.switchToWindowIndex(currentTab2 + 1)

//Enter new Password
WebUI.sendKeys(findTestObject('SignUp/txtboxPassword'), ResetPassword)

WebUI.sendKeys(findTestObject('Profile/Account settings/Confirm Password'), ResetPassword)

//Click on Set up new password
WebUI.click(findTestObject('SignUp/Set up this password'))

//Click on Login
WebUI.click(findTestObject('SignUp/Login'))

System.out.println(workFlow)

WebUI.callTestCase(findTestCase('Test Cases/TalentTestCases/Login'), [('workFlow') : workFlow], FailureHandling.STOP_ON_FAILURE)
