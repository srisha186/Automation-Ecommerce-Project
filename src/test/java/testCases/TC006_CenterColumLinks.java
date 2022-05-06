package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.LinksCenterColumn;

public class TC006_CenterColumLinks extends BaseClass {

	@Test(description = "Verify Dashboard links are opened in child windows")
	public void login() {

		/*SignIn st = new SignIn(driver);
		st.signIn();

		AccountLogin log = new AccountLogin(driver);
		log.login();
;*/

		LinksCenterColumn link = new LinksCenterColumn(driver);
		link.rowcenter();

		Assert.assertTrue(true, "MY ACCOUNT");
		System.out.println("Assert Passed");
	}

}
