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


class ChangeEmailPassword {
	String[][] testData;
	String xpath

	@When("user clicks on {string} icon")
	public void user_clicks_on_icon(String Profile) {
		WebUI.click(findTestObject('Profile/User Profile'))
	}

	@When("user selects {string}")
	public void user_selects(String option) {
		//Click on Dashbaord

		//Click on menu item
		xpath="//span[text()='"+option+"']"
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user updates {string} and {string}")
	public void user_updates_and(String email, String password) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/changeEmailPassword"),['testData' : GlobalVariable.testData,'email' : email,'password' : password],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user clicks on Profile Edit")
	public void user_clicks_on_Profile_Edit() {
		WebUI.click(findTestObject('Profile/Profile Edit'))
	}

	@When("user updates {string}")
	public void user_updates(String paymentDetails) {
		WebUI.callTestCase(findTestCase("Test Cases/CommonTestCases/changePaymentDetails"),['testData' : GlobalVariable.testData,'paymentDetails' : paymentDetails],FailureHandling.STOP_ON_FAILURE)
	}

	@When("user updates Profile Details")
	public void user_updates_Profile_Details() {
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Enter Details Common'),['testData' : GlobalVariable.testData], FailureHandling.STOP_ON_FAILURE)
		//Click on Skip to Dashboard
		WebUI.click(findTestObject('Talent/Skip to Dashboard'))

		//Verify text email is changed successfully
		WebUI.verifyElementText(findTestObject('Dashboard/VerifyDataSaveMessage'), 'The data is saved successfully. You can continue with onboarding later.')
	}

	@Then("verify Profile Details are updated")
	public void verify_Profile_Details_are_updated() {
		//Verify if data is changed successfully
		WebUI.verifyElementText(findTestObject('Profile/My Profile/Name'), 'Testfirstname T.')

	}

	@Then("closes browser")
	public void closes_browser() {
		//'Close browser'
		WebUI.closeBrowser()
	}
}