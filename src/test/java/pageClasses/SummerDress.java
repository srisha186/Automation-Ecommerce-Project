package pageClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SummerDress extends BasePage {
	
	public JavascriptExecutor js;

	public SummerDress(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	public WebElement mouseover_dresses;
	
	@FindBy(xpath="//ul[@class='product_list grid row']//div[@class='product-container']")
	public List<WebElement> total_dressesList;
	
	@FindBy(xpath="//ul[@class='product_list grid row']//div[@class='product-container']")
	public List<WebElement> listofdresses;
	

	@FindBy(xpath="//div[@class='product-container']//span[contains(text(),'Add to cart')]")
	public WebElement itembtn_addToCart;

	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	public List<WebElement> allbtn_addToCart;

	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[5]")
	public String printedsummerdress;

	@FindBy(xpath="(//div[@class='right-block'] //span[contains(text(),'Add to cart')])[3]")
	public WebElement printedsummerdress_addtocart;

	
	
	public void itemcenter() throws InterruptedException {
		//dashboard_centerspace.click();
		Actions act=new Actions(driver);
		act.moveToElement(mouseover_dresses).click().build().perform();
		js = (JavascriptExecutor) driver;
		//js.executeScript("window.location ='http://automationpractice.com/index.php?id_category=8&controller=category");
		js.executeScript("window.scrollBy(0, 1000);");
		System.out.println(total_dressesList.size());
		
		
		for(int i=1;i<total_dressesList.size();i++)
		{
			String place=total_dressesList.get(i).getText();
			Thread.sleep(3000);

			if(place.equalsIgnoreCase(printedsummerdress)){
				//printedsummerdress_addtocart.click();
			act.moveToElement(printedsummerdress_addtocart).click().build().perform();
			System.out.println("Successfully added");
			break;
			}
			else
			{
				System.out.println("erro");
			}
			//String value=total_dressesList.get(i).getText();
			//String pressKeys = Keys.chord(Keys.ENTER);
			//total_dressesList.get(i).sendKeys(pressKeys);
		}
		
		/*Set<String> links = driver.getWindowHandles();
		Iterator<String> itr = links.iterator();
		while (itr.hasNext()) {
			//driver.switchTo().window(itr.next());
			//System.out.println("The title of center column of Links are: " + driver.getTitle());
			
			/*if(links.equals(total_dressesList)) {
				itembtn_addToCart.click();
				break;
			}
			else {
				System.out.println("output error");
			}*/
		
		
	
}
}
