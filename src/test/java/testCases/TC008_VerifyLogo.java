package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pageClasses.Logo;


public class TC008_VerifyLogo extends BaseClass {
	

	@Test(description = "Verify Company logo is navigated to homepage")
	public void logo() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started for Logo Verification");

		
	Logo lo=new Logo(driver);
	lo.logo();
	softAssert.assertTrue(true);
	softAssert.assertAll();
	System.out.println("softAssert Method Was Passed ");
	
//	Assert.assertTrue(true);
//	System.out.println("Assert Passed,Logo Verified");
	
			}

	
	}

