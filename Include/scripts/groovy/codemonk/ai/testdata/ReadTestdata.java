package codemonk.ai.testdata;
import internal.GlobalVariable;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
class ReadTestdata {
	public static String[][] testData = null;
	String TESTDATA_FOLDER = System.getProperty("user.dir") + "\\Data Files\\";
	
	public void readExcel(String sheetName, String fileName) throws IOException {
			//To read values from Excel File Name and Sheet Name and stores in testData variable		
			// Create an object of File class to open xlsx file
			File file = new File(TESTDATA_FOLDER + fileName+".xls");
			// Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = new HSSFWorkbook(inputStream);
		
			// Read sheet inside the workbook by its name
			Sheet sheet = wb.getSheet(sheetName);
		
			// To get the last row of the sheet
			int firstRow = sheet.getFirstRowNum();
			int lstRow = sheet.getLastRowNum();
			DataFormatter formatter = new DataFormatter();
			int num = 0;
			for (num = 0; num <= lstRow; num++) {
				String val = formatter.formatCellValue(sheet.getRow(num).getCell(0));
				if (val.trim().length() == 0)
					break;
			}
			lstRow = num;
		
			// Find number of rows in excel file and setting up the array size
			int rowCount = lstRow - firstRow;
			testData = new String[lstRow][sheet.getRow(sheet.getFirstRowNum()).getLastCellNum()];
		
			// Create a loop over all the rows of excel file to read it
			for (int i = 0; i < rowCount; i++) {
				Row row = sheet.getRow(i);
				// Create a loop to print cell values in a row
				for (int j = 0; j < row.getLastCellNum(); j++) {
					// Store data in array
					if (formatter.formatCellValue(row.getCell(j)).length() != 0)
						testData[i][j] = formatter.formatCellValue(row.getCell(j)).trim();
				}
			}
	}
}