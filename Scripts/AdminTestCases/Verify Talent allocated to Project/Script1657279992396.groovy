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

String xpath

//Click on Project
xpath = (('//div[text()=\'' + ProjectName) + '\']')

WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Click Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

//Click on Talent tab
WebUI.click(findTestObject('Admin/Talent Tab'))

for (int i = 1; i < GlobalVariable.testData.length; i++) {
    String xlPageName = (GlobalVariable.testData[i])[2]

    if (xlPageName.contains('Verify Talent')) {
        String xlWorkflow = (GlobalVariable.testData[i])[1]

        String xlFieldType = (GlobalVariable.testData[i])[3]

        String xlFieldLabel = (GlobalVariable.testData[i])[4]

        String xlFieldValue = (GlobalVariable.testData[i])[5]

        if (xlFieldLabel.contains('Date') || xlFieldLabel.contains('Allocation')) {
            xpath = "//span[(.='" + GlobalVariable.TalentFirstName + " "+ GlobalVariable.TalentLastName +"')]/following::input[@value='" +  xlFieldValue+ "']"	
        } else {
            xpath = "//span[(text()='" + GlobalVariable.TalentFirstName+ " " + GlobalVariable.TalentLastName+ "')]/following::div[text()='" + xlFieldValue +"'])"
		}
        assert WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Verify Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
		System.out.println("Verified " + xlFieldLabel +" value is "+xlFieldValue)
        WebUI.comment("Verified " + xlFieldLabel +" value is "+xlFieldValue)
    }
}

