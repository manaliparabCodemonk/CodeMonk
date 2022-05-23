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

//span[.='Skills & Tools used']/ancestor::div[contains(@class,'position-relative')]//input[contains(@id,'react-select-')]
WebUI.click(findTestObject('PageTalent/PageProjects/btnProjects'))

for (def index : (1..3)) {
    WebUI.click(findTestObject('PageTalent/PageProjects/btnAddProject'))

    WebUI.sendKeys(findTestObject('PageTalent/PageProjects/txtboxProjectName'), 'ABCD -Test Project ' + index)

    WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/txtBoxRole'))

    WebUI.click(findTestObject('PageTalent/PageTalentAboutYouCodeMonk/listQA'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PageTalent/PageExperience/txtBoxEmploymentType'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PageTalent/PageExperience/listFullTime'))

    WebUI.sendKeys(findTestObject('PageTalent/PageExperience/txtBoxEmployerName'), 'ABCD')

    WebUI.click(findTestObject('PageTalent/PageExperience/listEmployerName'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PageTalent/PageExperience/txtBoxIndustryType'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PageTalent/PageProjects/listITIndustry'))

    WebUI.sendKeys(findTestObject('PageTalent/PageExperience/txtboxDescription'), 'Adding Description Text here Adding Description Text here Adding Description Text here Adding Description Text here Adding Description Text here Adding Description Text here Adding Description Text here ')

    WebUI.sendKeys(findTestObject('PageTalent/PageProjects/textBoxSkillsToolsUsed'), 'Acceptance Testing ')

    WebUI.click(findTestObject('PageTalent/PageProjects/listAcceptancetesting'))

    WebUI.click(findTestObject('PageTalent/PageProjects/btnRatingBarsAcceptanceTesting'))

    WebUI.sendKeys(findTestObject('PageTalent/PageProjects/textBoxSoftSkills'), 'Collaboration ')

    WebUI.click(findTestObject('PageTalent/PageProjects/listCollaboration'))

    WebUI.click(findTestObject('PageTalent/PageProjects/btnRatingBarsCollaboration'))

    WebUI.waitForElementClickable(findTestObject('PageTalent/PageTalentQualifications/btnSave'), 5)

    WebUI.click(findTestObject('PageTalent/PageTalentQualifications/btnSave'))
}

WebUI.click(findTestObject('PageTalent/PageExperience/btnContinue'))

