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

class Timesheet {
	String xpath
	
	@When("user adds Timesheet for {string} time")
	public void user_adds_Timesheet_for_time(String RecordNum) {
		WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Add Timesheet'),['testData' : GlobalVariable.testData,'RecordNum':RecordNum], FailureHandling.STOP_ON_FAILURE)
	}
	
	
	@When("user refresh browser")
	public void user_refresh_browser() {
		WebUI.refresh()
		WebUI.delay(2)
	}
	
	@Then("verify Timesheet status as {string}")
	public void verify_Timesheet_status_as(String ExpectedStatus) {
		WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Verify Timesheet Status'),['testData' : GlobalVariable.testData,'ExpectedStatus':ExpectedStatus], FailureHandling.STOP_ON_FAILURE)
	}

//	@Then("verify Time Logged and Earnings")
//	public void verify_Time_Logged_and_Earnings() {
//		WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Verify Timesheet'),['testData' : GlobalVariable.testData], FailureHandling.STOP_ON_FAILURE)
//		
//	}
//	
	@When("{string} edits Timesheet for {string} time")
	public void edits_Timesheet_for_time(String WorkFlow, String RecordNum) {
		WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Add Timesheet'),['testData' : GlobalVariable.testData,'RecordNum':RecordNum], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("verify Time Logged and Earnings for {string} time")
	public void verify_Time_Logged_and_Earnings_for_time(String recordNum) {
			WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Verify Timesheet'),['testData' : GlobalVariable.testData,'recordNum':recordNum], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Admin verifies Timsheet for {string} time")
	public void admin_verifies_Timsheet_for_time(String recordNum) {
		WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Verify Timesheet By Admin'),['testData' : GlobalVariable.testData,'recordNum':recordNum], FailureHandling.STOP_ON_FAILURE)	
	}
	
	@When("Admin edits Timesheet status from {string} to {string}")
	public void admin_edits_Timesheet_status_from_to(String fromStatus, String toStatus) {
		WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Admin Edit Timesheet'),['testData' : GlobalVariable.testData,'fromStatus':fromStatus,'toStatus':toStatus], FailureHandling.STOP_ON_FAILURE)	
	}

	
	@Then("{string} verifies Bill is generated and download it")
	public void verifies_Bill_is_generated_and_download_it(String workFlow) {
			WebUI.callTestCase(findTestCase('Test Cases/Timesheet/Verify Bill'),['workFlow':workFlow], FailureHandling.STOP_ON_FAILURE)
	
	}
}