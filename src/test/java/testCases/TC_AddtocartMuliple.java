package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.AddToCart3;
import pageClasses.Logo;
import pageClasses.SignIn;

public class TC_AddtocartMuliple extends BaseClass {
	AddToCart3 add;

	@Test(priority = 1, description = "verify AddToCart Functionality by adding multiple products")
	public void multipleAddCart() throws InterruptedException {

		
		/* SignIn st = new SignIn(driver); st.signIn(); //String homepage =
		  driver.getTitle();
		  
		 AccountLogin log = new AccountLogin(driver);
		log.login();*/

		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started for adding products");
		add = new AddToCart3(driver);
		add.firstItem();
		// Assert.assertTrue(true,"Product successfully added to your shopping cart");
		// System.out.println("verified Product successfully added to your shopping cart
		// message");

		// Assert.assertTrue(true,"T-shirts");
		// System.out.println("verified Tshirt Productpage on Continue");
		add.seconditem();
		add.shoppingCart();
		Assert.assertTrue(true, "SHOPPING-CART SUMMARY");
		softAssert.assertAll();
				System.out.println("softAssert Method Was Passed with condition");
	}

	@Test(priority = 2, description = "verify sumofproducts added and value is printed Dynamically according to products")
	public void sumofproducts() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert Method Was Started for sumof products");
		add.getsumOfProducts();
		System.out.println("Expected Value" +add.expected_total.getText());
		softAssert.assertTrue(true);

		softAssert.assertAll();
				System.out.println("softAssert Method Was Passed with adding the numbers dynamically");
		Logo lo=new Logo(driver);
		lo.logo();
		
		
		//Assert.assertEquals(sum, expected);

}
}
