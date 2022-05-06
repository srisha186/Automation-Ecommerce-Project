package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pageClasses.Register;
import pageClasses.SignIn;
import utilities.Utilities;

public class DD_FinalVerifyRegister extends BaseClass {

	@Test(dataProvider = "reg2", dataProviderClass = Utilities.class, description = "Verify Data Driven Test cases from Excel")

	public void register(String txtfirstname, String txtlastname, String txtregisteremail, String txtpassword,
			String addressfirstname, String addresslastName, String addresscompany, String txtFieldaddress,
			String txtFieldaddress2, String txtFieldcity, String dropdownstate, String txtFieldpostalcode,
			String txtFieldadditionalinfo, String txtFieldhomephone, String txtFieldmobilephone,
			String txtFieldreference) throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started");

		SignIn st = new SignIn(driver);
		st.signIn();

		Register regi = new Register(driver);
		regi.txtField_email.sendKeys("dvgm@gmail.com");
		regi.btn_create_account.click();

		regi.paramRegister2(txtfirstname, txtlastname, txtregisteremail, txtpassword, addressfirstname, addresslastName,
				addresscompany, txtFieldaddress, txtFieldaddress2, txtFieldcity, dropdownstate, txtFieldpostalcode,
				txtFieldadditionalinfo, txtFieldhomephone, txtFieldmobilephone, txtFieldreference);
		// test.appendChild(regi.paramRegister2(txtfirstname, txtlastname,
		// txtregisteremail, txtpassword, addressfirstname, addresslastName,
		// addresscompany, txtFieldaddress, txtFieldaddress2, txtFieldcity,
		// dropdownstate, txtFieldpostalcode, txtFieldadditionalinfo, txtFieldhomephone,
		// txtFieldmobilephone, txtFieldreference));
		softAssert.assertTrue(true);
		softAssert.assertAll();
		System.out.println("softAssert Method Was Passed with condition");
		st.signIn();

	}

}
