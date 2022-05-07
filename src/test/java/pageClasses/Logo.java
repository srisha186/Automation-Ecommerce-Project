package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Logo extends BasePage {

	public Logo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	public WebElement click_logo;

	public void logo() throws InterruptedException {
		click_logo.click();
		Thread.sleep(3000);
	}

}
