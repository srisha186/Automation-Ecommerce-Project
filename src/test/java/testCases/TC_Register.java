package testCases;

import org.testng.annotations.Test;


import base.BaseClass;
import pageClasses.Register;
import pageClasses.SignIn;

public class TC_Register extends BaseClass {
	
	public SignIn st;

	@Test(description = "Verify Register Functionality ")
	public void register() throws InterruptedException {
	/*	SignIn st = new SignIn(driver);
		st.signIn();
		AccountLogin log = new AccountLogin(driver);
		log.login();*/

		

	Register reg = new Register(driver);
	reg.register();
	reg.personalInfo();
	reg.date();
	reg.checkbox();
	reg.address();
	
	/*String actualtitle="Login - My Store";
	String expectedtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);*/
	
	
	
	}
	
}
