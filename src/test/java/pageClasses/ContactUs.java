package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import base.BasePage;

public class ContactUs extends BasePage {
	
	
	
	public ContactUs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@title='Contact Us']")
	public WebElement btn_click;
	
	@FindBy(xpath="//h1[contains(text(),' Customer service - Contact us')]")
	public WebElement txt_display;
	
	
	public void contactUs() {
		btn_click.click();
		//String actualtitle="Login - My Store";
		//String expectedtitle=driver.getTitle();
		//Assert.assertEquals(actualtitle, expectedtitle);

		
	}
	
	
	
	
	

}
