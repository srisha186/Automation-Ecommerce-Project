package testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.SignIn;

public class TC002_VerifyLogin extends BaseClass {

	@Test(description = "Verify Login Functionality and Forgot Password Link works as Expected")
	public void login() throws InterruptedException {

		SignIn st = new SignIn(driver);
		st.signIn();

		AccountLogin log = new AccountLogin(driver);
		log.forgotPassword();
		log.login();
		//test.log(LogStatus.INFO," Account Logged in Successfully");


		Thread.sleep(3000);
		//log.btn_signIn.click();
	}

}
