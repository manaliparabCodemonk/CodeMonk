

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
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
class ReferandEarn {
	String xpath
	String currentPage2,currentPage
	int currentTab, currentTab2
	String[] jobDetails_Expected, jobDetails_Actual
	@When("user clicks on {string} menu")
	public void user_clicks_on_menu(String menuItem) {
		xpath="//a[contains(@title,'"+menuItem+"')]";
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user verifies Invite link copied and stores the list of Recommended jobs")
	public void user_verifies_Invite_link_copied_and_stores_the_list_of_Recommended_jobs() {

		String url  = WebUI.getAttribute(findTestObject('Dashboard/Refer and Earn/Invite link'), 'value')
		String currentPage = WebUI.getUrl()
		int currentTab = WebUI.getWindowIndex()
		WebUI.executeJavaScript('window.open();', [])
		WebUI.switchToWindowIndex(currentTab + 1)
		WebUI.navigateToUrl(url)
		WebUI.waitForPageLoad(5)

		xpath="//div[contains(@class,'flex-column')]//p";
		jobDetails_Expected =WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/readReferAndEarnTable'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

		WebUI.closeWindowIndex(currentTab + 1)
		WebUI.switchToWindowIndex(currentTab)
	}

	@When("user verifies {string} table")
	public void user_verifies_table(String tableName) {

		WebUI.verifyElementVisible(findTestObject('Dashboard/Refer and Earn/'+tableName), FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("user selects {string} tab")
	public void user_selects_tab(String TabName) {
		xpath="//a[contains(@class,'CustomTab')]//span[text()='"+TabName+"']"
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String buttonName) {
		xpath="//span[text()='"+buttonName+"']"
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

		//Verify text Invite link sent successfully.
		WebUI.verifyElementText(findTestObject('Dashboard/Refer and Earn/VerifyInviteLinkSentMessage'), 'Invite link sent successfully')
	}


	@When("user enter details on {string} page for {string}")
	public void user_enter_details_on_page_for(String pageName, String WorkFlow) {

		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Enter Details Common'),['testData' : GlobalVariable.testData,'pageName' : pageName,'WorkFlow' : WorkFlow], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user verifies email received or not")
	public void user_verifies_email_received_or_not() {

		String currentPage = WebUI.getUrl()

		int currentTab = WebUI.getWindowIndex()

		WebUI.executeJavaScript('window.open();', [])

		WebUI.switchToWindowIndex(currentTab + 1)

		WebUI.navigateToUrl('https://www.mailinator.com/v4/public/inboxes.jsp')

		WebUI.sendKeys(findTestObject('Mailinator/txtboxPublicMessages'), GlobalVariable.EmailTalent)

		WebUI.click(findTestObject('Mailinator/btnGO'))

		WebUI.delay(2)
		
		WebUI.click(findTestObject('Mailinator/labelFutureofworkcodemonk'))

		WebUI.switchToFrame(findTestObject('Mailinator/frameEmailBody'), 5)
	}
	
	@When("{string} launches new window for Sign Up")
	public void launches_new_window_for_Sign_Up(String WorkFlow) {
		//WebUI.closeWindowIndex(currentTab)
		
		String currentPage2 = WebUI.getUrl()
		
		int currentTab2 = WebUI.getWindowIndex()
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Mailinator/OK,Sign Me Up'))
		
		WebUI.switchToWindowIndex(currentTab2 + 1)
	}
	
	
	@When("{string} launches new window for Complete Profile")
	public void launches_new_window_for_Complete_Profile(String WorkFlow) {
		String currentPage2 = WebUI.getUrl()
		
		int currentTab2 = WebUI.getWindowIndex()
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Mailinator/Complete My Profile'))
		
		WebUI.switchToWindowIndex(currentTab2 + 1);
	}
	
	@Then("verifies if {string} page is launched")
	public void verifies_if_page_is_launched(String link) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/Verify Link"),['link' : link],FailureHandling.STOP_ON_FAILURE)
	}

	
	@When("user launches new tab for Recommended jobs")
	public void user_launches_new_tab_for_Recommended_jobs() {
		String currentPage2 = WebUI.getUrl()

		int currentTab2 = WebUI.getWindowIndex()

		WebUI.click(findTestObject('Mailinator/OK,Sign Me Up'))

		WebUI.switchToWindowIndex(currentTab2 + 1)

		xpath="//div[contains(@class,'flex-column')]//p";
		jobDetails_Actual =WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/readReferAndEarnTable'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verifies list of Recommended jobs")
	public void verifies_list_of_Recommended_jobs() {
		boolean flag=false;

		if(jobDetails_Expected.length==jobDetails_Actual.length && jobDetails_Expected.toString().contentEquals(jobDetails_Actual.toString())){
			flag=true;
		}

		WebUI.closeWindowIndex(currentTab2 + 1)

		WebUI.switchToWindowIndex(currentTab2)

		WebUI.closeWindowIndex(currentTab2)

		WebUI.switchToWindowIndex(currentTab)
	}
}