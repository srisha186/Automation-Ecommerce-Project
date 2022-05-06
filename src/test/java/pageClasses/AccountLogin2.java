package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class AccountLogin2 extends BasePage {
	public JavascriptExecutor js;

	public AccountLogin2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@title='Log in to your customer account']")
	public WebElement btn_signIn;
	
	@FindBy(id="email")
	public WebElement txtField_email;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement txtField_password;
	
	@FindBy(xpath="//a[@title='Recover your forgotten password']")
	public WebElement btn_forgotPassword;
	
	@FindBy(id="email")
	public WebElement forgot_email;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
	public WebElement forgot_Emailsubmit;
	
	@FindBy(xpath="//a[@title='Back to Login']")
	public WebElement back_toLogin;
	
	
	@FindBy(id="SubmitLogin")
	public WebElement btn_login;
	
	@FindBy(xpath="//h1[contains(text(),'My account')]")
	public String txt_msg;

	
	public void signIn() {
		btn_signIn.click();
		
	}
	public void enterEmailAddress() {
		txtField_email.sendKeys("automationdemo18@gmail.com");
	}

	public void enterPassword() {
		txtField_password.sendKeys("@autodemo18");
	}

	public void forgotPassword() throws InterruptedException {
		Thread.sleep(3000);
		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500);");
		btn_signIn.click();
	//	txtField_email.sendKeys("automationdemo18@gmail.com");
	//	txtField_password.sendKeys("@autodemo18");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(btn_forgotPassword));

		btn_forgotPassword.click();
		forgot_email.sendKeys("automationdemo18@gmail.com");
		forgot_Emailsubmit.click();
		back_toLogin.click();
		
	}
	public void login() {
		btn_login.click();
	}

	public void loginParametrized(String email_address, String password) {
		txtField_email.sendKeys(email_address);
		txtField_password.sendKeys(password);
		btn_login.click();
	}

		
		//String err="CREATE AN ACCOUNT";
		//String expectedtitle="automation demo";
		//Assert.assertEquals(actualtitle, expectedtitle);
		
		/*if(actualhead.equalsIgnoreCase("My account")) {
			Assert.assertTrue(true, actualhead);
		System.out.println("Landig page name is:"+actualhead);
		}
		else if(actualhead.equalsIgnoreCase("Authentication")) {
			Assert.assertTrue(false);
			System.out.println("Not logged on"+actualhead);
		}
		else {
			System.out.println("nil");
		}*/
	}
	
	//a[@title='View my customer account']
	//li[normalize-space()='Invalid email address.']

