package codemonk.ai.Talent

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import static org.junit.Assert.assertTrue

import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import codemonk.ai.testdata.ReadTestdata

class CreateTalent {
	String[][] testData;
	@Given("user launches {string} website")
	public void user_launches_website(String environment) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Launch Login URL"),['environment':environment],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user creates email and password for {string}")
	public void user_creates_email_and_password_for(String workFlow) {
		WebUI.callTestCase(findTestCase("Test Cases/TalentTestCases/Sign Up"),['workFlow':workFlow],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user enters username and password for {string}")
	public void user_enters_username_and_password_for(String workFlow) {
		WebUI.callTestCase(findTestCase("Test Cases/TalentTestCases/Login"),['workFlow': workFlow],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user creates password for {string} via Invite link")
	public void user_creates_password_for_via_Invite_link(String workFlow) {
		WebUI.callTestCase(findTestCase("Test Cases/TalentTestCases/Sign Up Via Invite Link"),['workFlow':workFlow],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user Reset password for {string}")
	public void user_Reset_password_for(String workFlow) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Reset Password"),['workFlow': workFlow],FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("user read the test data sheet {string} from file {string}")
	public void user_read_the_test_data_sheet_from_file(String sheetName, String fileName) {
		GlobalVariable.testData = WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Read Test Data"),['sheetName':sheetName,'fileName':fileName],FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify user is on {string} page")
	public void verify_user_is_on_page(String link) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Verify Link"),['link' : link],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user enter details on {string} on {string} page")
	public void user_enter_details_on_on_Talent_page(String pageName,String workFlow) {
		WebUI.callTestCase(findTestCase("Test Cases/TalentTestCases/Enter Details Forms"),['testData' : GlobalVariable.testData,'pageName' : pageName,'workFlow' : workFlow],FailureHandling.STOP_ON_FAILURE)
	}

	@When("clicks on {string} button and verify {string} is completed")
	public void clicks_on_button_and_verify_is_completed(String buttonName,String pageName) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Verify Green Tick Mark And Progress"),['buttonName' : buttonName ,'pageName' :pageName],FailureHandling.STOP_ON_FAILURE)
	}

	@When("clicks on {string} button")
	public void clicks_on_button(String btnName) {
		WebUI.verifyElementClickable(findTestObject(btnName))
		WebUI.click(findTestObject(btnName))
	}

	@Then("user logs out from application")
	public void user_logs_out_from_application() {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Logout Profile"),[:],FailureHandling.STOP_ON_FAILURE)
	}
}