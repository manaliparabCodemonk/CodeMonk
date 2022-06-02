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

String index = '1'

//Entering details in Role
WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/btnCreateBrief'))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxJobTitle'), 'Test Project' + index)

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxExperienceLevel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/listExperiencelevel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxJobRole'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/listQA'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxJobDescription'), 'This is description added for Job')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxProjectName'), ('Test Project' + index) + ' ')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxProjectName'), Keys.chord(Keys.ENTER))


WebUI.click(findTestObject('PageTalent/PageExperience/btnContinue'))

//Entering details in Preferred Candidates
//Adding hard Skills
WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxTechnicalSkills'), 'Acceptance testing')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxTechnicalSkills'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxTechnicalSkills'), 'Test Automation')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxTechnicalSkills'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxTechnicalSkills'), 'QTP/UFT')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxTechnicalSkills'), Keys.chord(Keys.ENTER))

//Adding Soft Skills
WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxSoftSkills'), 'Concrete')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxSoftSkills'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxSoftSkills'), 'Confident')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxSoftSkills'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxSoftSkills'), 'Collaboration')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxSoftSkills'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxIndustryExperience'), 'Information Technology and Services')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxIndustryExperience'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('PageTalent/PageExperience/btnContinue'))

//Entering details in Engagment
WebUI.delay(2)

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxWorkPreference'), 'Full time - Weekdays')

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxWorkPreference'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxMinDuration'), '50')

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxAssignment'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/listAssignment'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/txtboxRatePerHour'), '50')

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/btnPostJobViewMatches'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard/PageJobBrief/CreateJobBrief/btnReviewTalents'))

WebUI.click(findTestObject('SignUp/btnContinueWithFreePlan'))

WebUI.click(findTestObject('Dashboard/LeftPanelMenu/btnJobBriefs'))

WebUI.verifyElementVisible(findTestObject('Dashboard/PageJobBrief/LiveOpportunities/btnProjectName'))

