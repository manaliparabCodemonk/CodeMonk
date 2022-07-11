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
import org.openqa.selenium.Keys as Keys

String code = ''

String currentPage = WebUI.getUrl()

int currentTab = WebUI.getWindowIndex()

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl('https://www.mailinator.com/v4/public/inboxes.jsp')

WebUI.sendKeys(findTestObject('PageMailinator/txtboxPublicMessages'), Email)

WebUI.click(findTestObject('PageMailinator/btnGO'))

WebUI.click(findTestObject('PageMailinator/labelFutureofworkcodemonk'))

WebUI.switchToFrame(findTestObject('PageMailinator/frameEmailBody'), 5)

code = WebUI.getText(findTestObject('PageMailinator/labelCode'))

//if(code.contains("Your application for Quality Analyst at Test Company"))
//{
//	assert True;
//}
WebUI.closeWindowIndex(currentTab + 1)

WebUI.switchToWindowIndex(currentTab)

WebUI.comment("Verified Verification Code on Email - "+code)

if (code != null) {
    return code
	}
