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



class JobApplication {
	String xpath
	
	@When("user clicks on Open Live Jobs")
	public void user_clicks_on_Open_Live_Jobs() {
		WebUI.delay(2)
		
		//Clicks on Open Live Jobs
		WebUI.click(findTestObject("Job Application/Job Application/Open Live Jobs"))
		
	
	}
	@When("searches for {string}")
	public void searches_for(String searchCriteria) {
		//Click on Job Search
		WebUI.click(findTestObject('Job Application/Job Search'))

		WebUI.sendKeys(findTestObject('Job Application/Job Search'), searchCriteria)

		WebUI.delay(3)

		WebUI.comment("Talent searches for "+ searchCriteria)

	}

	@When("user selects first result")
	public void user_selects_first_result() {
		xpath="//div[contains(@class,'JobCardBlock')][1]"
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(2)

		WebUI.comment("Talent selects first result")
	}

	@When("enters other details in Your application")
	public void enters_other_details_in_Your_application() {

		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Enter Details Common'),['testData' : GlobalVariable.testData], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verifies Job Application email is received to {string}")
	public void verifies_Job_Application_email_is_received_to(String WorkFlow) {
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Verify Email Received Applied Jobs'),['WorkFlow' : WorkFlow], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("verify Job Application status as {string}")
	public void verify_Job_Application_status_as(String ApplicationStatus) {
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Verify Job Application Status'),['ApplicationStatus' : ApplicationStatus], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("user Upgrades Plan")
	public void user_Upgrades_Plan() {
		WebUI.callTestCase(findTestCase('Test Cases/ClientHiresTalent/Client Upgrade Plan'),['testData' : GlobalVariable.testData], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("also verify Talent profile in email")
	public void also_verify_Talent_profile_in_email() {
	}

	@When("views {string}")
	public void views(String string) {
		xpath="//p[text()='"+string+"']"
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user clicks on {string} moves to {string}")
	public void user_clicks_on_moves_to(String Action, String ToAction) {
		WebUI.callTestCase(findTestCase("Test Cases/ClientHiresTalent/Job Application Moves To"),['ToAction' : ToAction],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user selects Interview slot")
	public void user_selects_Interview_slot() {
		//Click on Interviewed tab
		//WebUI.click(findTestObject('Job Application/Job Application/Interviewed Tab'))

		WebUI.sendKeys(findTestObject('Job Application/Job Application/Interview Slot'), '2008')

		//Click on Send request
		WebUI.click(findTestObject('Job Application/Job Application/Send request'))
	}

	@Then("verify Application is moved to {string}")
	public void verify_Application_is_moved_to(String ToAction) {
		WebUI.callTestCase(findTestCase("Test Cases/ClientHiresTalent/Verify Job Application Moved To"),['ToAction' : ToAction],FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verifies Job Application email is received to {string} on Yopmail")
	public void verifies_Job_Application_email_is_received_to_on_Yopmail(String WorkFlow) {
	}
}