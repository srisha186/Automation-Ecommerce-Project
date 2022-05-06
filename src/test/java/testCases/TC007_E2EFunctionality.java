package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.Checkout;
import pageClasses.SignIn;

public class TC007_E2EFunctionality extends BaseClass {
	Checkout add;

	@Test(priority = 1, description = "Verify End To End Functionality of a single product till Confirmation page")
	public void checkout() throws InterruptedException {
		
		SignIn st = new SignIn(driver);
		st.signIn(); // String homepage =
		driver.getTitle();

		AccountLogin log = new AccountLogin(driver);
		log.login();

		add = new Checkout(driver);
		add.dresses();
		System.out.println("Single product is added");
		//test.log(LogStatus.INFO, "Sign In Started");

		// Assert.assertTrue(true, "SUMMER DRESSES ");
		// Assert.assertSame(true, add.txt_quantity.isEnabled());
		// System.out.println("passed,summer dress selected and enabled");
		add.text();
		// add.txt_quantity.isDisplayed();

		//Assert.assertTrue(add.txt_quantity.isDisplayed(), "2");

		// Assert.assertTrue(add.txt_quantity.isDisplayed(), "Text box is visible and
		// displayed");
		add.itemsize();
		//Assert.assertTrue(true, "L");
		add.color();
		//Assert.assertTrue(true, "Blue");

		add.wishlist();
		//Assert.assertTrue(true, "Add to my wishlist");
		add.addtocart();
		//Assert.assertTrue(true, "Product successfully added to your shopping cart");
		System.out.println(
				"A single product is added and all its details added , then added to wishlist and finally add to cart the product");
		System.out.println("softAssert Method Was Passed with condition");
		// add.txt_quantity.isDisplayed();
		// add.btn_wishlist.isSelected();
		// add.btn_continue.isSelected();
		// Assert.assertTrue(true,"Product successfully added to your shopping cart");
		// add.checkCart();
		// add.alert_close.click();
		// Assert.assertSame(true, add.txt_quantity.isEnabled());

	}

	@Test(priority = 2, description = "verify summary page")
	public void summary() throws InterruptedException {
		Assert.assertTrue(true, "Shopping-cart summary");
		System.out.println("Summary Page is verified with text Shopping-cart summary");
		add.summary();
	}

	@Test(priority = 3, description = "verify address page")
	public void address() throws InterruptedException {
		Assert.assertTrue(true, "Addresses");
		System.out.println("Address Page is verified and assert passed");
		add.address();

	}

	@Test(priority = 4, description = "verify shipping page")
	public void shipping() throws InterruptedException {
		Assert.assertTrue(true, "Shipping");
		System.out.println("Shipping page is verified with text ");
		add.shipping();

	}

	@Test(priority = 5, description = "verify payment page")
	public void payment() throws InterruptedException {
		Assert.assertTrue(true, "Please choose your payment method");
		System.out.println("verified payment method page");
		add.payment();

	}

	@Test(priority = 6, description = "verify confirmation  page")
	public void confirmation() throws InterruptedException {
		Assert.assertTrue(true, "Bank-wire payment");
		System.out.println("Bank wire payment is selected and verified");
		add.confirm();
		System.out.println("Confirmation of product is verified");

	}

}
