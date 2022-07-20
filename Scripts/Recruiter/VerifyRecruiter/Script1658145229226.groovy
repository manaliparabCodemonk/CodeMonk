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
	String xlWorkflow = (GlobalVariable.testData[i])[1]
	

		if(xlWorkflow.equals(workFlow)){
		   
		String xlPageName = (GlobalVariable.testData[i])[2]
		
		String xlFieldType = (GlobalVariable.testData[i])[3]
	
		String xlFieldLabel = (GlobalVariable.testData[i])[4]
	
		String xlFieldValue = (GlobalVariable.testData[i])[5]
		
		String ActualText= WebUI.findTestObject('Talent/' + xlPageName + '/' + xlFieldLabel).getText()
		
		if(ActualText.equals(xlFieldValue))
		{
			System.out.println("Verified Recruiter value for " +  xlFieldLabel +" as "+ ActualText)
			WebUI.comment("Verified Recruiter value for " +  xlFieldLabel +" as "+ ActualText)
		}
		else
		{	System.out.println("Unable to verify Recruiter status as "+ xlFieldValue)
			WebUI.comment("Unable to verify Recruiter status as "+ xlFieldValue)
		}
		}
}