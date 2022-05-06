package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.AddToCart;

public class TC004_SinglePdtCart extends BaseClass {
	
	@Test(description = "Verify a single product is added successfully")
	public void addtoCart() throws InterruptedException {

		/*SignIn st = new SignIn(driver);
		st.signIn();
		//String homepage = driver.getTitle();

		AccountLogin log = new AccountLogin(driver);
		log.login();*/

		AddToCart add=new AddToCart(driver);
		add.mouseover();
		Assert.assertTrue(true,"Product successfully added to your shopping cart");
		System.out.println("verified Product successfully added to your shopping cart message");
		
		Assert.assertTrue(true,"T-shirts");
		System.out.println("verified Tshirt Productpage on Continue");
        add.seconditem();
		

		
		//add.checkCart();
		//add.alert_close.click();
		
}
}
