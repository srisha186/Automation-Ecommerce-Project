package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import base.BasePage;

public class SignIn extends BasePage {
	
	
	
	public SignIn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@title='Log in to your customer account']")
	public WebElement btn_click;
	
	
	public void signIn() {
		btn_click.click();

		
		
	}
	
	
	
	
	

}
