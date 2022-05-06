package testCases;


import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.Register;
import pageClasses.SignIn;
import utilities.Utilities;

public class DD_VerifyRegister extends BaseClass {

	/*@Test(priority=1,dataProvider ="dp",dataProviderClass = Utilities.class)
	public void login(String email_address, String password) throws InterruptedException {

		SignIn st = new SignIn(driver);
		st.signIn();

		AccountLogin log = new AccountLogin(driver);
		log.loginParametrized(email_address, password);
	}*/
	
	
	
	@Test(priority=2,dataProvider ="reg",dataProviderClass = Utilities.class)
	
	public void register(String txtfirstname,String txtlastname,String txtregisteremail,String txtpassword,
			String dropdowndays,String dropdownmonths,String dropdownyear,
			String addressfirstname,String addresslastName,String addresscompany,String txtFieldaddress,String txtFieldaddress2,
			String txtFieldcity,String txtFieldpostalcode,String txtFieldadditionalinfo,
			String txtFieldhomephone,String txtFieldmobilephone,String txtFieldreference) {
		SignIn st = new SignIn(driver);
		st.signIn();

		Register regi=new Register(driver);
		regi.txtField_email.sendKeys("dvgm@gmail.com");
		regi.btn_create_account.click();
		regi.paramRegister(txtfirstname, txtlastname, txtregisteremail, txtpassword,
				 dropdowndays, dropdownmonths, dropdownyear,
				 addressfirstname, addresslastName, addresscompany, txtFieldaddress, txtFieldaddress2,
				 txtFieldcity, txtFieldpostalcode, txtFieldadditionalinfo,
				 txtFieldhomephone, txtFieldmobilephone, txtFieldreference);
	}
	

	
	
}
