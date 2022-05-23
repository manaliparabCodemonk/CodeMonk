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

WebUI.click(findTestObject('PageTalent/PagePreferences/btnPreferences'))

WebUI.setText(findTestObject('PageTalent/PagePreferences/txtboxIndustryType'), 'Information Technology and Services')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxIndustryType'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxCompanyCultures'), 'Teamwork ')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxCompanyCultures'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtBoxCompanySize'), 'Start-up (1 - 20 FTE) ')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtBoxCompanySize'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxProjectDuration'), 'Mid-term (6 -12 months) ')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxProjectDuration'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxTeamSize'), 'Small team (<6 members) ')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxTeamSize'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/textBoxAssignment'), 'Remote ')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/textBoxAssignment'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxWorkPreference'), 'Full time - Weekdays ')

WebUI.sendKeys(findTestObject('PageTalent/PagePreferences/txtboxWorkPreference'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('PageTalent/PagePreferences/btnContinue'), 2)

WebUI.click(findTestObject('PageTalent/PageExperience/btnContinue'))

