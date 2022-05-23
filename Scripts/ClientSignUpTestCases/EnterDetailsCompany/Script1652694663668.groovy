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

WebUI.click(findTestObject('PageClient/PageCompany/btnCompany'))

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxCompanyName'), 'Test Company 123')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxBrandName'), 'Test brand 123')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxCompanyRegNumber'), '123456789')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxVAT'), '1234343')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxIndustryType'), 'Information Technology and Services ')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxIndustryType'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxCompanySize'), 'Scale-up (21 - 150 FTE)')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxCompanySize'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxCompanyCulture'), 'Teamwork')

WebUI.sendKeys(findTestObject('PageClient/PageCompany/txtboxCompanyCulture'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnContinue'), 2)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnContinue'))