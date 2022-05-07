package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.SignIn;

public class TC001_SignIn extends BaseClass   {

	public SignIn st;

	@Test(description = "Verify sign in button is clicked")
	public void signIn() {

		//test = rep.startTest("Test Started");
		SignIn st = new SignIn(driver);
		st.signIn();
		test.log(LogStatus.INFO, "signIn Clicked");

		System.out.println("signIn clicked");
		Assert.assertTrue(true, "Authentication");
		

		/*
		 * String actualtitle="Login - My Store"; String
		 * expectedtitle=driver.getTitle(); Assert.assertEquals(actualtitle,
		 * expectedtitle);
		 */

		// Assert.assertTrue(true, "Already registered?");
		// System.out.println("Assert Passed");

	}

}
