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

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/First Name'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/First Name'), 'Test1 ')

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLastName'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLastName'), 'Company')

WebUI.sendKeys(findTestObject('PageClient/PageAboutYou/txtBoxExtNumber'), 'India +91')

WebUI.sendKeys(findTestObject('PageClient/PageAboutYou/txtBoxExtNumber'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxPhoneNumber'), '123456789')

WebUI.sendKeys(findTestObject('PageTalent/PageExperience/txtboxEmployerRole'), 'Quality Analyst')

WebUI.sendKeys(findTestObject('PageClient/PageAboutYou/txtBoxJobrole'), 'Recruitment Manager')

WebUI.sendKeys(findTestObject('PageClient/PageAboutYou/txtBoxJobrole'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnContinue'), 2)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnContinue'))

WebUI.comment('Entered details in Client About You')

