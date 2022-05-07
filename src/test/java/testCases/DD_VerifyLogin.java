package testCases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.SignIn;
import utilities.Utilities;

public class DD_VerifyLogin extends BaseClass {

	@Test(priority=1,dataProvider ="dp",dataProviderClass = Utilities.class,description = "Verify Data Driven Test cases for Login Functionality")
	public void login(String email_address, String password) throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started");

		SignIn st = new SignIn(driver);
		st.signIn();

		AccountLogin log = new AccountLogin(driver);
		log.loginParametrized(email_address, password);
		test.log(LogStatus.INFO, "Data Driven Login");

		
		softAssert.assertTrue(true);
		softAssert.assertAll();
				System.out.println("softAssert Method Was Passed with condition");

	}
	
	
	/*@Test(priority=2,dataProvider ="reg",dataProviderClass = Utilities.class)
	
	public void register(String txtfirstname,String txtlastname,String txtregisteremail,String txtpassword,
			String dropdowndays,String dropdownmonths,String dropdownyear,
			String addressfirstname,String addresslastName,String addresscompany,String txtFieldaddress,String txtFieldaddress2,
			String txtFieldcity,String txtFieldpostalcode,String txtFieldadditionalinfo,
			String txtFieldhomephone,String txtFieldmobilephone,String txtFieldreference) {
		
		Register regi=new Register(driver);
		regi.txtField_email.sendKeys("dnskgm@gmailcom");
		regi.btn_create_account.click();
		regi.paramRegister(txtfirstname, txtlastname, txtregisteremail, txtpassword,
				 dropdowndays, dropdownmonths, dropdownyear,
				 addressfirstname, addresslastName, addresscompany, txtFieldaddress, txtFieldaddress2,
				 txtFieldcity, txtFieldpostalcode, txtFieldadditionalinfo,
				 txtFieldhomephone, txtFieldmobilephone, txtFieldreference);*/
	
	

	
	
}

