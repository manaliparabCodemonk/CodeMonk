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

for (int i = 1; i < GlobalVariable.testData.length; i++) {
		
	String xlPageName = (GlobalVariable.testData[i])[2]
	
	String xlRecordNum = (GlobalVariable.testData[i])[6]
	
	if(xlPageName.equals("Edit timesheet") && xlRecordNum.equals(RecordNum)){
		   
		String xlWorkflow = (GlobalVariable.testData[i])[1]
	
		String xlFieldType = (GlobalVariable.testData[i])[3]
	
		String xlFieldLabel = (GlobalVariable.testData[i])[4]
	
		String xlFieldValue = (GlobalVariable.testData[i])[5]
		
		WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Enter Details'), [('xlWorkflow') : xlWorkflow, ('xlPageName') : xlPageName
			, ('xlFieldType') : xlFieldType, ('xlFieldLabel') : xlFieldLabel, ('xlFieldValue') : xlFieldValue], FailureHandling.STOP_ON_FAILURE)

		 }
}
WebUI.comment("Added Timesheet for Talent "+ GlobalVariable.EmailTalent)