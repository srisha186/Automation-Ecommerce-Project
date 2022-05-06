package pageClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class Checkout extends BasePage {
	public JavascriptExecutor js;

	public Checkout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	public WebElement mouse_Dresses;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	public WebElement mouse_summerdresses;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	public WebElement first_item;
	// @FindBy(xpath = "(//span[contains(text(),'Add to cart')])[1]")

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]/span[1]")
	public WebElement click_addtocart;

	@FindBy(xpath = "//input[@id='quantity_wanted']")
	public WebElement txt_quantity;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	public WebElement btn_quantityplus;

	@FindBy(id = "group_1")
	public WebElement drop_down_item;

	@FindBy(xpath = "//ul[@id='color_to_pick_list']//a[@id='color_14']")
	public WebElement sel_btn_color;

	@FindBys(@FindBy(xpath = "//ul[@id='color_to_pick_list']//a[@class='color_pick']"))
	public List<WebElement> btn_color_list;

	// ul[@id='color_to_pick_list']//a[@id='color_11']

	@FindBy(id = "wishlist_button")
	public WebElement btn_wishlist;

	@FindBy(xpath = "//a[@title='Close']")
	public WebElement btn_closealertwish;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	public WebElement btn_checkout;

	@FindBy(xpath = "//h1[@id='cart_title']")
	public String text_header;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
	public WebElement proceed_to_checkout;

	@FindBy(xpath = "//span[@class='checked']//input[@id='addressesAreEquals']")
	public WebElement address_checkbox;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	public WebElement address_checkout;
	
	@FindBy(xpath = "//div[@id='uniform-cgv']")
	public WebElement shipping_checkbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	public WebElement shipping_checkout;

	
	@FindBy(xpath = "//a[@class='bankwire']")
	public WebElement btn_payment;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	public WebElement btn_confirm;
	
	

	public void dresses() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(mouse_Dresses).build().perform();
		Thread.sleep(3000);

		action.moveToElement(mouse_summerdresses).click().build().perform();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900);");
		Thread.sleep(3000);

		action.moveToElement(first_item).click().build().perform();
		Thread.sleep(3000);

		// action.moveToElement(click_addtocart).click().build().perform();
		// Thread.sleep(3000);

		// action.moveToElement(btn_continue).click().build().perform();
		// Thread.sleep(3000);

		// action.moveToElement(click_addtocart).click().build().perform();
	}

	public void text() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(txt_quantity));

		txt_quantity.clear();
		txt_quantity.sendKeys("2");
		Thread.sleep(3000);

		// btn_quantityplus.click();
		// Thread.sleep(3000);
	}

	public void itemsize() throws InterruptedException {

		Select noofitems = new Select(drop_down_item);
		noofitems.selectByIndex(2);
		Thread.sleep(3000);
	}

	public void color() throws InterruptedException {

		sel_btn_color.click();
		/*
		 * for (int i = 0; i < btn_color_list.size(); i++) { String color =
		 * btn_color_list.get(i).getText(); if (color.equals("black")) {
		 * //sel_btn_color.click();
		 * 
		 * //btn_color_list.get(i).click(); System.out.println("color is" +
		 * btn_color_list.get(i)); break; } else { System.out.println("error");
		 * 
		 * } Thread.sleep(3000); }
		 */
	}

	public void wishlist() throws InterruptedException {
		btn_wishlist.click();
		btn_closealertwish.click();
		Thread.sleep(3000);
	}

	public void addtocart() throws InterruptedException {
		click_addtocart.click();
		Thread.sleep(3000);

		btn_checkout.click();

		Thread.sleep(3000);
	}

	public void summary() throws InterruptedException {
		proceed_to_checkout.click();
		Thread.sleep(3000);

	}

	public void address() throws InterruptedException {
		address_checkbox.click();
		address_checkout.click();
		Thread.sleep(3000);

	}

	public void shipping() throws InterruptedException {
		shipping_checkbox.click();
		shipping_checkout.click();
		Thread.sleep(3000);

	}

	public void payment() throws InterruptedException {
		btn_payment.click();
		Thread.sleep(3000);

	}
public void confirm() throws InterruptedException {
	btn_confirm.click();
	Thread.sleep(3000);

}
}
