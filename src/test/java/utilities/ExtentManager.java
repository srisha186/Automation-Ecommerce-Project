package utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;





public class ExtentManager extends BaseClass {
	
	public static ExtentReports extent;
	
	ExtentTest Test;
	public static ExtentReports getInstance(){
		
		
		if(extent==null){
			
			extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extentconfig\\ReportsConfig.xml"));
			extent
            .addSystemInfo("Host Name", "Automated Ecommerce Project")
            .addSystemInfo("Environment", "Selenium Automation Testing")
            .addSystemInfo("User Name", "Srimathi");
		}	
		return extent;
		
	}

}
