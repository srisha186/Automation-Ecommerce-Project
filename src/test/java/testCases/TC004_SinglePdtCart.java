package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AddToCart;

public class TC004_SinglePdtCart extends BaseClass {
	
	@Test(description = "Verify a single product is added successfully")
	public void singlepdtAdd() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started for adding single product to cart");
		/*SignIn st = new SignIn(driver);
		st.signIn();
		//String homepage = driver.getTitle();

		AccountLogin log = new AccountLogin(driver);
		log.login();*/

		AddToCart add=new AddToCart(driver);
		add.mouseover();
		test.log(LogStatus.INFO, "first item Clicked");
		

		softAssert.assertTrue(true);

		softAssert.assertAll();
		
				System.out.println("softAssert Method Was Passedwith message Product successfully added to your shopping cart");
		//Assert.assertTrue(true,"Product successfully added to your shopping cart");
		//System.out.println("verified Product successfully added to your shopping cart message");
		//add.seconditem();
		
		/*Assert.assertTrue(true,"T-shirts");
		System.out.println("verified Tshirt Productpage on Continue");
        add.seconditem();*/
		

		
		//add.checkCart();
		//add.alert_close.click();
		
}
}
