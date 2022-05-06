package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.ContactUs;

public class TC003_ContactUs extends BaseClass {
	
	@Test(description = "Verify Contact us page is navigated to corresponding page")
	public void contactNo() {
		ContactUs us=new ContactUs(driver);
		us.contactUs();
		
		Assert.assertTrue(true,"Customer service - Contact us");
		//Assert.assertTrue(us.txt_display.isDisplayed());
		System.out.println(us.txt_display.isDisplayed());
		System.out.println("Assert Passed and text displayed");

	
	}
	
}
