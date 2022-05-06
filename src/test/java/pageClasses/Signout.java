package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Signout extends BasePage {
	
	
	
	public Signout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@title='Log me out']")
	public WebElement btn_click;
	
	
	public void signOut() {
		btn_click.click();
		
	}
	
	
	
	
	
	

}
