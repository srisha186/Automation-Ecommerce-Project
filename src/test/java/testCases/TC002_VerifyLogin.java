package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.SignIn;

public class TC002_VerifyLogin extends BaseClass {

	@Test(description = "Verify Login Functionality and Forgot Password Link works as Expected")
	public void login() throws InterruptedException {

		/*SignIn st = new SignIn(driver);
		st.signIn();*/
		//SoftAssert softAssert = new SoftAssert();
		//System.out.println("softAssert Method Was Started");

		AccountLogin log = new AccountLogin(driver);
		log.forgotPassword();
		test.log(LogStatus.INFO, "forgotPassword Clicked");

		log.login();
		//test.log(LogStatus.INFO, "login Clicked");

		test.log(LogStatus.INFO," Account Logged in Successfully");
	//	softAssert.assertTrue(true);
	//	softAssert.assertAll();
		//System.out.println("softAssert Method Was Ended");


		//Thread.sleep(3000);
		//log.btn_signIn.click();
	}

}
