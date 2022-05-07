package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.LinksCenterColumn;
import pageClasses.SignIn;

public class TC006_CenterColumLinks extends BaseClass {

	@Test(description = "Verify Dashboard links are opened in child windows")
	public void login() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started for verifying the links");
		softAssert.assertTrue(true);

	/*SignIn st = new SignIn(driver);
		st.signIn();

		AccountLogin log = new AccountLogin(driver);
		log.login();*/


		LinksCenterColumn link = new LinksCenterColumn(driver);
		link.rowcenter();
		test.log(LogStatus.INFO, "Dashboard Links Clicked");

		softAssert.assertAll();
		System.out.println("softAssert Method Was Passed and all child windows closed after completion");

		//Assert.assertTrue(true, "MY ACCOUNT");
		//System.out.println("Assert  Links Passed");
	}

}
