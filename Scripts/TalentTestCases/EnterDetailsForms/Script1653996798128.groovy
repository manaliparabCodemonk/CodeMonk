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
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
//String[][] testData;

String xpath
if(pageName.equals("Salary and Billing")){
	xpath = "//span[text()='Salary & Billing']"
}else {
	xpath = "//span[text()='" + pageName+"']" 
}


WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

String filePath = System.getProperty('user.dir') + '\\Data Files\\'


for (int i = 1; i < testData.length; i++) {
    String xlWorkflow = (testData[i])[1]

    String xlPageName = (testData[i])[2]

    String xlFieldType = (testData[i])[3]

    String xlFieldLabel = (testData[i])[4]

    String xlFieldValue = (testData[i])[5]

    if (xlPageName.equalsIgnoreCase(pageName) && xlWorkflow.equalsIgnoreCase(workFlow)) {
		
		  switch (xlFieldType) {
			case 'Upload':
			WebUI.uploadFile(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel),filePath + xlFieldValue)

			break
            case 'Upload with Drag and Drop':
                WebUI.uploadFileWithDragAndDrop(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel),filePath + xlFieldValue)

                break
            case 'Upload with Save':
                WebUI.uploadFileWithDragAndDrop(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel), 
                    filePath + xlFieldValue)

                xpath = '//span[text()=\'Save\']'

                WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

                break
            case 'Textbox':
                WebUI.sendKeys(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel), xlFieldValue)

                break
			
				//Field Value is selected and enter key is pressed		
            case 'Textbox with Enter':
                WebUI.sendKeys(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel), xlFieldValue)

                WebUI.delay(2)
				
				WebUI.sendKeys(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldValue), Keys.chord(Keys.ENTER))
							
                break
				
				//Field Label is selected and enter key is pressed
			case 'Textbox with Label Enter':
				WebUI.sendKeys(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel), xlFieldValue)
				
				WebUI.delay(2)
				//xlFieldLabel is selected and enter key is pressed
								
				WebUI.sendKeys(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel), Keys.chord(Keys.ENTER))
        		
				break
				
            case 'TextEditArea':
                WebUI.switchToFrame(findTestObject(xlWorkflow + '/' + xlPageName + '/Iframe'), 60)

                WebUI.delay(1)

                WebUI.sendKeys(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel), xlFieldValue)

                WebUI.delay(2)

                WebUI.switchToDefaultContent()

                break
            case 'Button':
                WebUI.click(findTestObject(xlWorkflow + '/' + xlPageName + '/' + xlFieldLabel))

                break
            case 'Click Object':
                xpath = (('//div[text()=\'' + xlFieldLabel) + '\']')

                WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

                break
            case 'Button with Enter':
                WebUI.click(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel))

                WebUI.sendKeys(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel), Keys.chord(Keys.ENTER))

                break
            case 'Delay':
                WebUI.delay(xlFieldValue.toInteger())

                break
            case 'Checkbox':
                if (xlFieldValue) {
                    xpath = "//label[text()='" + xlFieldLabel + "']"

                    WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], 
                        FailureHandling.STOP_ON_FAILURE)
                }
                
                break
            case 'Dropdown':
                WebUI.click(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel))

                xpath = (('//div[(text() =\'' + xlFieldValue) + '\')]')

                WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

                break
            case 'ListDropdown':
                WebUI.waitForElementClickable(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel), 
                    2)

                WebUI.click(findTestObject((((xlWorkflow + '/') + xlPageName) + '/') + xlFieldLabel))

                xpath = (('//div[(text() =\'' + xlFieldValue) + '\')]')

                WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

                break
            case 'SelectElementFromList':
                xpath = (('//div[text()=\'' + xlFieldLabel) + '\']')

                WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

                break
            case 'RatingBars':
                WebUI.delay(2)

                xpath = (((('//span[text()=\'' + xlFieldLabel) + '\']/parent::div//span[') + xlFieldValue.toInteger()) + 
                ']')

                WebUI.callTestCase(findTestCase('Test Cases/CommonTestCases/clickDynamicObject'), [('xpath') : xpath], FailureHandling.STOP_ON_FAILURE)

                break
        }
    }
}

