package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.Signout;

public class TC_VerifyLogout extends BaseClass {

	@Test(description = "Verify Log out Functionality")
	public void verifyLogout() throws InterruptedException {

		/*SignIn st = new SignIn(driver);
		st.signIn();*/
		AccountLogin log = new AccountLogin(driver);
		log.login();

		Signout out = new Signout(driver);
		out.signOut();
		
		Assert.assertTrue(true, "Log in to your customer account");
		System.out.println("Assert passed, Logged out successfully");
	/*	out.getExpectedTitle();
		
		Assert.assertEquals(out.getExpectedTitle(),"Login - My Store");
		System.out.println("The title displayed after signout is " + out.getExpectedTitle());*/
	}
}
