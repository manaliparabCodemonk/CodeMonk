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

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnAboutyou'))

String userDir = System.getProperty('user.dir')

String filePath = userDir + '\\Data Files'

WebUI.uploadFileWithDragAndDrop(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnUploadResume'), filePath + '\\Resume.doc')

WebUI.uploadFileWithDragAndDrop(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnUploadProfile'), filePath + '\\ProfilePic.jpg')

WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnSave'), 2)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnSave'))

WebUI.doubleClick(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxFirstName'))

WebUI.clearText(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxFirstName'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxFirstName'), 'Testfirstname')

WebUI.doubleClick(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLastName'))

WebUI.clearText(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLastName'))

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxLastName'), 'Testlastname')

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxNumber'))

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/listNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxPhoneNumber'), '123456789')

WebUI.sendKeys(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxDOB'), '01/01/2001')

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxGender'))

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxFemale'))

WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxRole'), 2)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxRole'))

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/listQA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxSeniority'))

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/listSeniority'))

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

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnRatingBars'))

WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnContinue'), 2)

WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/btnContinue'))

WebUI.comment('Entered details in Talent About You')

