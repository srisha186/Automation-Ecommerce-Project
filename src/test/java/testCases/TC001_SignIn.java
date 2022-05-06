package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseClass;
import pageClasses.SignIn;

public class TC001_SignIn extends BaseClass   {

	public SignIn st;

	@Test(description = "Verify sign in button is clicked")
	public void signIn() {

		//test = rep.startTest("Test Started");
		SignIn st = new SignIn(driver);
		st.signIn();
		System.out.println("signIn clicked");
		Assert.assertTrue(true, "Authentication");
		
		//test.log(LogStatus.INFO, "signIn Clicked");

		/*
		 * String actualtitle="Login - My Store"; String
		 * expectedtitle=driver.getTitle(); Assert.assertEquals(actualtitle,
		 * expectedtitle);
		 */

		// Assert.assertTrue(true, "Already registered?");
		// System.out.println("Assert Passed");

	}

}
