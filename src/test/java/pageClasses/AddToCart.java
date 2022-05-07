package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class AddToCart extends BasePage {
	
	public JavascriptExecutor js;

	public AddToCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@title='Women']")
	public WebElement mouse_women;

	@FindBy(xpath = "//a[@title='Tops']")
	public WebElement mouse_tops;

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	public WebElement mouse_tshirt;
	
	@FindBy(xpath = "//div[@class='product-container']")
	public WebElement item_selected;
	
	@FindBy(xpath = "(//div[@class='product-container'])")
	public WebElement secondItem_selected;

	// @FindBy(xpath="//div[@class='right-block'] //span[contains(text(),'Add to
	// cart')]")
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
	public WebElement click_addtocart;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")
	public WebElement btn_continue;


	// @FindBy(xpath=" //div[@class='clearfix'] //span[@class='cross']")
	// public WebElement alert_close;

	// @FindBy(xpath="//dt[@data-id='cart_block_product_1_1_677934']//a[@class='cart_block_product_name']")
	// public WebElement validate_item;

	// dt[@data-id='cart_block_product_1_1_677934']//a[@class='cart_block_product_name']

	public void mouseover() throws InterruptedException {
		
		
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(mouse_women));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(mouse_women).build().perform();
		Thread.sleep(3000);
		System.out.println("Women dresses Selected");

		action.moveToElement(mouse_tops).build().perform();
		 Thread.sleep(3000);
			System.out.println("Women dresses--tops was Selected");


		action.moveToElement(mouse_tshirt).click().build().perform();
		Thread.sleep(3000);
		System.out.println("T shirt was  Selected");

		js = (JavascriptExecutor) driver;
		//js.executeScript("window.location = 'https://demo.opencart.com/");
		js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(item_selected));
		System.out.println("Used Javascript executor and explicit wait");

		action.moveToElement(item_selected).moveToElement(click_addtocart).click().build().perform();
		btn_continue.click();
		System.out.println("Add to cart clicked and continue button was clicked from the alert window");

		}
		
	/*public void seconditem() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);

		action.moveToElement(secondItem_selected).moveToElement(click_addtocart).click().build().perform();
		

	}*/
	// div[@class='clearfix'] //span[@class='cross']
	/*
	 * public void checkCart() throws InterruptedException {
	 * 
	 * btn_click.click(); Thread.sleep(3000); validate_item.click();
	 * validate_item.isDisplayed(); System.out.println(validate_item.isDisplayed());
	 * }
	 */

}
