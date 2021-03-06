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


class CreateProjectBrief {
	String xpath

	@When("user enter details on {string} on {string} for {string} time")
	public void user_enter_details_on_on_for_time(String pageName, String workFlow, String recordNum) {
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Enter Details Record Number'),['testData' : GlobalVariable.testData,'pageName' : pageName,'workFlow' : workFlow,'recordNum':recordNum], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user clicks on Create brief")
	public void user_clicks_on_Create_brief() {
		WebUI.click(findTestObject('Project/Create brief/Create Brief'))
	}

	@Then("verify project is added for {string} time")
	public void verify_project_is_added_for_time(String recordNum) {
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/VerifyProjectAdded'),['recordNum':recordNum], FailureHandling.STOP_ON_FAILURE)
		
	}

	@Then("verify brief is added for {string} time")
	public void verify_brief_is_added_for_time(String recordNum) {
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/VerifyBriefAdded'),['recordNum':recordNum], FailureHandling.STOP_ON_FAILURE)
	}
}