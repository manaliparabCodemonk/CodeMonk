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

WebUI.click(findTestObject('PageClient/PageLocations/btnLocations'))

WebUI.click(findTestObject('PageClient/PageLocations/btnAddLocation'))

WebUI.sendKeys(findTestObject('PageClient/PageLocations/txtBoxLocation'), 'Mumbai')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLine1'), 'Test 123')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLine2'), 'Test 123')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxCity'), 'Mumbai')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxState'), 'Maharashtra')

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxCountry'))

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/listCountry'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxPostcode'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxPostcode'), '400010')

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxTimeZone'))

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/listTimeZone'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('PageTalent/PagePreferences/btnContinue'), 2)

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/btnSave'))

WebUI.click(findTestObject('PageTalent/PagePreferences/btnContinue'))

WebUI.comment('Entered details in Locations of Client')

