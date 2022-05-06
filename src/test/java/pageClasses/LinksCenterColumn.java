package pageClasses;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LinksCenterColumn extends BasePage {
	public LinksCenterColumn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@class='row addresses-lists']")
	public WebElement dashboard_centerspace;

	@FindBy(xpath = "//div[@class='row addresses-lists']//a")
	public List<WebElement> total_linksCenter;

	public void rowcenter() throws InterruptedException {
		//dashboard_centerspace.click();
		System.out.println(total_linksCenter.size());
		for(int i=0;i<total_linksCenter.size();i++)
		{
			String value=total_linksCenter.get(i).getText();
			String pressKeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
			total_linksCenter.get(i).sendKeys(pressKeys);
			System.out.println("Total No of Links: "+value);
		}
		
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) 
        {
        	driver.switchTo().window(iterator.next());
			System.out.println("The title of center column of Links are: " + driver.getTitle());
        }
        driver.switchTo().window(mainWindowHandle);
        
       Thread.sleep(3000);
		/*
		Set<String> links = driver.getWindowHandles();
		Iterator<String> itr = links.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println("The title of center column of Links are: " + driver.getTitle());} */

		

		
	}
}