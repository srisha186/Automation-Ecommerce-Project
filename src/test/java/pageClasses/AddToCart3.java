package pageClasses;

import java.text.DecimalFormat;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;

public class AddToCart3 extends BasePage {
	
	public JavascriptExecutor js;

	public AddToCart3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	public WebElement mouse_Dresses;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	public WebElement mouse_summerdresses;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	public WebElement first_item;
	
	
	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[3]")
	public WebElement secondItem_selected;

	// @FindBy(xpath="//div[@class='right-block'] //span[contains(text(),'Add to
	// cart')]")
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
	public WebElement click_addtocart;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")
	public WebElement click_addtocart2;
	
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")
	public WebElement btn_continue;

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	public WebElement shopping_cart;
	
	@FindBy(xpath = "//div[@class='cart_block_list']//a[@id='button_order_cart']")
	public WebElement checkout_items;
	
	@FindBy(css = " #order-detail-content td:nth-child(6)")
	public List<WebElement> table_totalElements;
	
	@FindBy(xpath = "//td[@id='total_product']")
	public WebElement expected_total;
	
	public void firstItem() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(mouse_Dresses).build().perform();
		Thread.sleep(3000);
		System.out.println("Dresses was clicked using mouse action");

		action.moveToElement(mouse_summerdresses).click().build().perform();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900);");
		Thread.sleep(3000);
		System.out.println("SummerDresses was clicked using mouse action");


		action.moveToElement(first_item).moveToElement(click_addtocart).click().build().perform();
		btn_continue.click();
		System.out.println("First Item was clicked and press continue for getting second product");

		Thread.sleep(3000);
		
		
	}
	public void seconditem() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);

		action.moveToElement(secondItem_selected).moveToElement(click_addtocart2).click().build().perform();
		System.out.println("Second Item was clicked by mouse action and press proceed To Checkout and navigate to checkout page");


	}
	public void shoppingCart() throws InterruptedException {
		Thread.sleep(3000);
		//js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-900);");
		Actions action = new Actions(driver);
		action.moveToElement(shopping_cart).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Shopping cart button was clicked and dropdown opened");
		action.moveToElement(checkout_items).click().build().perform();
		System.out.println("Checkout button was clicked in the dropdownp popup");

		Thread.sleep(3000);

	}
	
	public double getsumOfProducts() throws InterruptedException {
		js.executeScript("window.scrollBy(0,500);");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(table_totalElements));
		System.out.println("Used WebDriver wait until the elements are visible");

		double sum = 0.00;
		try {
			for (int i = 0; i < table_totalElements.size(); i++) {
				System.out.println("The total number of elements price to be added in cart: "+table_totalElements.size());

				// String[] tablevalues=add.table_totalElements.get(i)
				double price = Double.parseDouble(table_totalElements.get(i).getText().split("\\$")[1]);
				System.out.println("Get the prices to be added spit the $ symbol from currency, Parse using Double for converting string into double variable: "+price);

				DecimalFormat df = new DecimalFormat("#.##");  
				System.out.println("Control the precission of values using Decimal Format class to get two numbers after decimal to avoid assertion error ");

				sum = Double.valueOf(df.format(sum + price));

			}
			System.out.println("The sum of prices are: "+sum);
		} catch (NumberFormatException e) {

			System.out.println("not a numb");
		}

		String[] value = expected_total.getText().split("\\$");
		String formattedval = value[1];
		// int expectedRes=Integer.parseInt(expected_total).
		double expected = Double.parseDouble(formattedval);
		Assert.assertEquals(sum, expected);
		System.out.println("The Final Sum of products as expected value in assertion:" + expected);
		return expected;

	}

}

