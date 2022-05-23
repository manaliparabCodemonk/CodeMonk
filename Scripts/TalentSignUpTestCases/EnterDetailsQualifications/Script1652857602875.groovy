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

String userDir = System.getProperty('user.dir')

String filePath = userDir + '\\Data Files'

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/btnQualifications'))

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/btnAddAccreditation'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentQualifications/txtBoxCollege'), 'Mumbai University')

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/div_Mumbai University'))

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/labelAddEducation'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentQualifications/txtboxStartyear'), '2012')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentQualifications/txtboxEndyear'), '2014')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentQualifications/txtboxDegreeTitle'), 'BE IT')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentQualifications/txtboxDegreeLevel'), 'Bachelor’s')

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/div_Bachelors'))

WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentQualifications/btnSave'), 5)

WebUI.click(findTestObject('PageTalent/PageTalentQualifications/btnSave'))

WebUI.click(findTestObject('PageTalent/PageProjects/btnContinue'))

