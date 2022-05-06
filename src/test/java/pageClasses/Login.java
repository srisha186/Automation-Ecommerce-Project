package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Login extends BasePage {
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="email")
	public WebElement txtField_email;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement txtField_password;
	
	@FindBy(id="SubmitLogin")
	public WebElement btn_signIn;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//parent::ol")
	public WebElement error_message ;
	
	//@FindBy(xpath="//h1[contains(text(),'My account')]")
	//public String txt_msg;
	
	
	public void login(String email_address, String password) {
		txtField_email.sendKeys(email_address);
		txtField_password.sendKeys(password);
		btn_signIn.click();
		
	}
		
}
