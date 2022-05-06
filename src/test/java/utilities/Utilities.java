package utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;



public class Utilities extends BaseClass {

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));

	}

	@DataProvider(name="dp")
	public Object[][] getData(Method m) throws IOException {

		File src=new File("C:\\Users\\karth\\eclipse-workspace\\Automated Ecommerce Project\\src\\test\\resources\\excel\\testdata.xlsx");
		//load the excel file
		FileInputStream fis=new FileInputStream(src);
		//load the workbook from the above excel file 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load the sheet from above excel workbook
		XSSFSheet sheet=wb.getSheetAt(0);
		
		
		// how many total rows in my excel sheet
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		
		int rows = rowCount + 1;
		System.out.println(rows);
	
		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);

		String data[][] = new String [rowCount][cellCount];

		for(int i=1; i<rowCount+1; i++) {
			Row r=sheet.getRow(i);

			for(int j=0; j<cellCount; j++) {
				
				System.out.println(data[i-1][j]=r.getCell(j).getStringCellValue());
			}
		}
			return data;
		
		}
	
	
	/*@DataProvider(name="reg")
	public Object[][] getRegisterData(Method m) throws IOException {

		File src=new File("C:\\Users\\karth\\eclipse-workspace\\Automation_Fashion_shopping_cart_website\\src\\test\\resources\\excel\\testdata.xlsx");
		//load the excel file
		FileInputStream fis=new FileInputStream(src);
		//load the workbook from the above excel file 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load the sheet from above excel workbook
		XSSFSheet sheet=wb.getSheetAt(1);
		
		
		// how many total rows in my excel sheet
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		
		int rows = rowCount + 1;
		System.out.println(rows);
	
		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);

		String data[][] = new String [rowCount][cellCount];

		for(int i=1; i<rowCount+1; i++) {
			Row r=sheet.getRow(i);

			for(int j=0; j<cellCount; j++) {
				 data[i-1][j]=r.getCell(j).toString();
				//int integer=Integer.parseInt(r.getCell(j).toString());
				
				if( data[i-1][j].contentEquals(r.getCell(j).toString())) {
				System.out.println(r.getCell(j).toString());
				}
				else {
					System.out.println("The values are: "+r.getCell(j).getNumericCellValue());

				}
					
				//int data[i-1][j]=.parseInt(r.getCell(j).toString());
			}
		}
			return data;
		
		}*/
	
	@DataProvider(name="reg2")
	public Object[][] getRegisterData2(Method m) throws IOException {

		File src=new File("C:\\Users\\karth\\eclipse-workspace\\Automated Ecommerce Project\\src\\test\\resources\\excel\\testdata.xlsx");
		//load the excel file
		FileInputStream fis=new FileInputStream(src);
		//load the workbook from the above excel file 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load the sheet from above excel workbook
		XSSFSheet sheet=wb.getSheetAt(2);
		
		
		// how many total rows in my excel sheet
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		
		int rows = rowCount + 1;
		System.out.println(rows);
	
		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);

		String data[][] = new String [rowCount][cellCount];

		for(int i=1; i<rowCount+1; i++) {
			Row r=sheet.getRow(i);

			for(int j=0; j<cellCount; j++) {
				
				System.out.println(data[i-1][j]=r.getCell(j).toString());
				//test.log(LogStatus.INFO, data[i-1][j]=r.getCell(j).toString());
			}
		}
			return data;
		
		}
	
	/*@DataProvider(name="reg2")
	public Object[][] getRegisterData2(Method m) throws IOException {

		File src=new File("C:\\Users\\karth\\eclipse-workspace\\Automation_Fashion_shopping_cart_website\\src\\test\\resources\\excel\\testdata.xlsx");
		//load the excel file
		FileInputStream fis=new FileInputStream(src);
		//load the workbook from the above excel file 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load the sheet from above excel workbook
		XSSFSheet sheet=wb.getSheetAt(2);
		
		
		// how many total rows in my excel sheet
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		
		int rows = rowCount + 1;
		System.out.println(rows);
	
		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);

		String data[][] = new String [rowCount][cellCount];

		for(int i=1; i<rowCount+1; i++) {
			Row r=sheet.getRow(i);

			for(int j=0; j<cellCount; j++) {
				 data[i-1][j]=r.getCell(j).toString();
				//int integer=Integer.parseInt(r.getCell(j).toString());
				 
				if( data[i-1][j].contentEquals(r.getCell(j).toString())) 
				 {
				System.out.println(r.getCell(j).getStringCellValue());
				}
				else {
					System.out.println("The values are: "+r.getCell(j).getNumericCellValue());

				}
					
				//int data[i-1][j]=.parseInt(r.getCell(j).toString());
			}
		}
			return data;
		
		}
	*/


/*@DataProvider(name="dp")
public Object[][] getReg2(Method m) throws IOException {

	File src=new File("C:\\Users\\karth\\eclipse-workspace\\Automation_Fashion_shopping_cart_website\\src\\test\\resources\\excel\\testdata.xlsx");
	//load the excel file
	FileInputStream fis=new FileInputStream(src);
	//load the workbook from the above excel file 
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	//load the sheet from above excel workbook
	XSSFSheet sheet=wb.getSheetAt(0);
	
	
	// how many total rows in my excel sheet
	int rowCount=sheet.getLastRowNum();
	System.out.println(rowCount);
	
	int rows = rowCount + 1;
	System.out.println(rows);

	int cellCount=sheet.getRow(0).getLastCellNum();
	System.out.println(cellCount);

	String data[][] = new String [rowCount][cellCount];

	for(int i=1; i<rowCount+1; i++) {
		Row r=sheet.getRow(i);

		for(int j=0; j<cellCount; j++) {
			org.apache.poi.ss.usermodel.Cell cell=r.getCell(j);
			switch(cell.getCellType()) {
			
			case cellCount:System.out.println(data[i-1][j]=r.getCell(j).getStringCellValue());
			case cellCount:System.out.println(data[i-1][j]=r.getCell(j).getNumericCellValue()));
			}
			
			
			System.out.println(data[i-1][j]=r.getCell(j).getStringCellValue());
		}
	}
		return data;
	
	}
*/
		
	}
	
	
	
	

