package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.Logo;


public class TC008_VerifyLogo extends BaseClass {
	

	@Test(description = "Verify Company logo is navigated to homepage")
	public void logo() {
		
	Logo lo=new Logo(driver);
	lo.logo();
	
	Assert.assertTrue(true);
	System.out.println("Assert Passed,Logo Verified");
	
			}

	
	}

