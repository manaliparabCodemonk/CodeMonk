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

String ActualText

WebUI.sendKeys(findTestObject('Timesheet/Admin/Talent'),GlobalVariable.TalentFirstName+" "+GlobalVariable.TalentLastName + " ")
WebUI.delay(2)
WebUI.sendKeys(findTestObject('Timesheet/Admin/Talent'),Keys.chord(Keys.ENTER))

for (int i = 1; i < GlobalVariable.testData.length; i++) {
	String xlRecordNum = (GlobalVariable.testData[i])[6]
		
	String xlPageName = (GlobalVariable.testData[i])[2]

		if(xlRecordNum.equals(recordNum) && xlPageName.equals("Verify status")){
		   
		String xlWorkflow = (GlobalVariable.testData[i])[1]
	
		String xlFieldType = (GlobalVariable.testData[i])[3]
	
		String xlFieldLabel = (GlobalVariable.testData[i])[4]
	
		String xlFieldValue = (GlobalVariable.testData[i])[5]
		
		String[] label=xlFieldLabel.split(",")
		xpath="//div[text()='"+GlobalVariable.TalentFirstName+" "+GlobalVariable.TalentLastName+"']/ancestor::div//div[text()='"+label[0]+"']/ancestor::div//div[text()='"+label[1]+"']/ancestor::div//div[text()='"+xlFieldValue+"']"
		GlobalVariable.UniquePath="//div[text()='"+GlobalVariable.TalentFirstName+" "+GlobalVariable.TalentLastName+"']/ancestor::div//div[text()='"+label[0]+"']/ancestor::div//div[text()='"+label[1]+"']/ancestor::div"
		
		System.out.println()
		System.out.println("GlobalVariable.UniquePath = "+GlobalVariable.UniquePath)
		System.out.println()
		ActualText= WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/Verify Text On Dynamic Object'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)
					
		if(ActualText.equals(xlFieldValue))
		{
			System.out.println("Admin Logged In - Verified Timesheet value for Week and Project " +  xlFieldLabel +" with Status "+ ActualText)
			WebUI.comment("Admin Logged In - Verified Timesheet value for Week and Project " +  xlFieldLabel +" with Status "+ ActualText)
		}
		else
		{	System.out.println("Admin Logged In - Unable to verify Timesheet value for Week and Project " +  xlFieldLabel +" with Status "+ ActualText)
			WebUI.comment("Admin Logged In - Unable to verify Timesheet value for Week and Project " +  xlFieldLabel +" with Status "+ ActualText)
		}
		}
}


//Admin Clicks on Edit 
WebUI.click(findTestObject('Timesheet/Admin/Edit'))


for (int i = 1; i < GlobalVariable.testData.length; i++) {
	String xlRecordNum = (GlobalVariable.testData[i])[6]
		
	String xlPageName = (GlobalVariable.testData[i])[2]

		if(xlRecordNum.equals(recordNum) && xlPageName.equals("Admin")){
		   
		String xlWorkflow = (GlobalVariable.testData[i])[1]
	
		String xlFieldType = (GlobalVariable.testData[i])[3]
	
		String xlFieldLabel = (GlobalVariable.testData[i])[4]
	
		String xlFieldValue = (GlobalVariable.testData[i])[5]
		if(xlFieldLabel.equals('Week starting'))
			{
				ActualText=WebUI.getAttribute(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel),"value")
			}
			else {
				ActualText=WebUI.getText(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel))
			
			}
		if(ActualText.equals(xlFieldValue))
		{
			System.out.println("Admin view - Verified Timesheet value for " +  xlFieldLabel +" as "+ ActualText)
			WebUI.comment("Admin view - Verified Timesheet value for " +  xlFieldLabel +" as "+ ActualText)
		}
		else
		{	System.out.println("Admin view - Unable to verify Timesheet value as "+ xlFieldValue)
			WebUI.comment("Admin view - Unable to verify Timesheet value as "+ xlFieldValue)
		}
		}
}

WebUI.click(findTestObject('Timesheet/Admin/Close'))

WebUI.clearText(findTestObject('Timesheet/Admin/Talent'))