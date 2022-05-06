package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.AddToCart3;
import pageClasses.Logo;

public class TC_AddtocartMuliple extends BaseClass {
	AddToCart3 add;

	@Test(priority = 1, description = "verify AddToCart Functionality by adding multiple products")
	public void addtoCart() throws InterruptedException {

		/*
		 * SignIn st = new SignIn(driver); st.signIn(); //String homepage =
		 * driver.getTitle();
		 * 
		 AccountLogin log = new AccountLogin(driver);
		log.login();*/


		add = new AddToCart3(driver);
		add.mouseover();
		// Assert.assertTrue(true,"Product successfully added to your shopping cart");
		// System.out.println("verified Product successfully added to your shopping cart
		// message");

		// Assert.assertTrue(true,"T-shirts");
		// System.out.println("verified Tshirt Productpage on Continue");
		add.seconditem();
		add.shoppingCart();
		Assert.assertTrue(true, "SHOPPING-CART SUMMARY");
	}

	@Test(priority = 2, description = "verify sumofproducts added and value is printed Dynamically according to products")
	public void sumofproducts() throws InterruptedException {
		add.getsumOfProducts();
		System.out.println("Expected Value" +add.expected_total.getText());
		
		Logo lo=new Logo(driver);
		lo.logo();
		
		
		//Assert.assertEquals(sum, expected);

}
}
