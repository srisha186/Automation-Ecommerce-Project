package pageClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import base.BasePage;

public class Register extends BasePage {
	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="email_create")
	public WebElement txtField_email;
	
	@FindBy(name="SubmitCreate")
	public WebElement btn_create_account;
	
	@FindBy(xpath="//h3[contains(text(),'Your personal information')]")
	public WebElement Heading_personalinfo ;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	public WebElement radio_Mrs ;
	
	@FindBy(id="customer_firstname")
	public WebElement txtField_firstname;
	
	@FindBy(id="customer_lastname")
	public WebElement txtField_lastname;
	
	@FindBy(id="email")
	public WebElement txtField_registeremail;
	
	@FindBy(id="passwd")
	public WebElement txtField_password;
	
	@FindBy(id="days")
	public WebElement dropdown_dob_days ;
	
	@FindBy(id="months")
	public WebElement dropdown_dob_months ;
	
	@FindBy(id="years")
	public WebElement dropdown_dob_year ;
	
	
	@FindBy(id="newsletter")
	public WebElement checkbox_newsletter ;
	
	@FindBy(id="uniform-optin")
	public WebElement checkbox_offer ;
	
	@FindBy(xpath="//h3[contains(text(),'Your address')]")
	public WebElement sub_heading;
	
	@FindBy(id="firstname")
	public WebElement address_firstname;
	
	@FindBy(id="lastname")
	public WebElement address_lastName;
	
	@FindBy(id="company")
	public WebElement address_company;
	
	@FindBy(id="address1")
	public WebElement txtField_address;
	
	@FindBy(id="address2")
	public WebElement txtField_address2;
	
	@FindBy(id="city")
	public WebElement txtField_city;
	
	@FindBy(id="id_state")
	public WebElement dropdown_state;
	
	@FindBy(id="postcode")
	public WebElement txtField_postalcode;
	
	@FindBy(id="id_country")
	public WebElement dropdown_country;
	
	@FindBy(id="other")
	public WebElement txtField_additionalinfo ;
	
	@FindBy(id="phone")
	public WebElement txtField_homephone ;
	
	@FindBy(id="phone_mobile")
	public WebElement txtField_mobilephone ;
	
	@FindBy(id="alias")
	public WebElement txtField_reference ;
	
	@FindBy(id="submitAccount")
	public WebElement btn_register ;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//parent::ol")
	public WebElement error_message ;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	public WebElement signInbtn_click;
	
	
	
	
	@FindBy(xpath="//a[@title='Log me out']")
	public WebElement signout;
	
	public void register() {
		
		txtField_email.sendKeys("aavgfhyjytrere@gmail.com");
		btn_create_account.click();
	}
		
	public void personalInfo() {
		radio_Mrs.click();
		if(radio_Mrs.isSelected()) {
			System.out.println("Title Mrs is Selected: "+radio_Mrs.isSelected());
		}
		else {
			System.out.println("Title Mrs is not Selected: ");

		}
		
		txtField_firstname.sendKeys("automation");
		txtField_lastname.sendKeys("demo");
		txtField_registeremail.clear();
		txtField_registeremail.sendKeys("demo@gmail.com");
		txtField_password.sendKeys("abcdefg");
	}
	public void date() throws InterruptedException {
		
		Thread.sleep(3000);
		Select days=new Select(dropdown_dob_days);
		days.selectByValue("18");
		
		Select months=new Select(dropdown_dob_months);
		months.selectByIndex(5);
		
		Select year=new Select(dropdown_dob_year);
		year.selectByValue("2015");

	}
	
	public void checkbox() {
		checkbox_newsletter.click();
		if(checkbox_newsletter.isSelected()) {
			System.out.println("Checkbox is Selected: "+checkbox_newsletter.isSelected());
		}
		else {
			System.out.println(" Checkbox is not Selected: ");

		}
		checkbox_offer.click();
		
	}
	public void address() throws InterruptedException {
		
		
		address_firstname.sendKeys("sri");
		address_lastName.sendKeys("mathi");
		address_company.sendKeys("busyQA");
		txtField_address.sendKeys("Matheson Blvd");
		txtField_address2.sendKeys("South Millway");
		txtField_city.sendKeys("Mississauga");
		
		Thread.sleep(3000);
		Select state=new Select(dropdown_state);
		state.selectByIndex(3);
		System.out.println("the selected state is: "+state.getOptions().get(3).getText());
				
		txtField_postalcode.sendKeys("12345");
		
		Select country=new Select(dropdown_country);
		country.getFirstSelectedOption();
		System.out.println("The selected country is: "+country.getFirstSelectedOption().getText());

		
		txtField_additionalinfo.sendKeys("Hello");
		txtField_homephone.sendKeys("1245678");
		txtField_mobilephone.sendKeys("9876554");
		txtField_reference.clear();
		txtField_reference.sendKeys("John");
		btn_register.click();
		Thread.sleep(3000);
		System.out.println("The error message displayed for already registered user : "+error_message.getText());
		Thread.sleep(3000);
		signInbtn_click.click();
		//signout.click();
		/*Alert alert=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("The alert message displayed are" +alertmsg);
		alert.dismiss();*/
	
	}
	
	public void paramRegister2(String txtfirstname,String txtlastname,String txtregisteremail,String txtpassword,
			String addressfirstname,String addresslastName,String addresscompany,String txtFieldaddress,String txtFieldaddress2,
			String txtFieldcity,String dropdownstate,String txtFieldpostalcode,String txtFieldadditionalinfo,
			String txtFieldhomephone,String txtFieldmobilephone,String txtFieldreference) throws InterruptedException {
		
		txtField_firstname.sendKeys(txtfirstname);
		txtField_lastname.sendKeys(txtlastname);
		txtField_registeremail.clear();
		txtField_registeremail.sendKeys(txtregisteremail);
		txtField_password.sendKeys(txtpassword);	
		
		/*WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeSelected(dropdown_dob_days));
		
		Select days=new Select(dropdown_dob_days);
		days.selectByValue("4");
		
		Select months=new Select(dropdown_dob_months);
		months.selectByValue("4");
		
		Select year=new Select(dropdown_dob_year);
		year.selectByValue("2020");*/
		address_firstname.clear();
		address_lastName.clear();
		address_firstname.sendKeys(addressfirstname);
		address_lastName.sendKeys(addresslastName);
		address_company.sendKeys(addresscompany);
		txtField_address.sendKeys(txtFieldaddress);
		txtField_address2.sendKeys(txtFieldaddress2);
		txtField_city.sendKeys(txtFieldcity);
		
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeSelected(dropdown_state));
	
		Thread.sleep(3000);
		Select state=new Select(dropdown_state);
		state.getOptions().iterator();
		System.out.println("the selected state is: "+state.toString());
				
		
		txtField_postalcode.sendKeys(txtFieldpostalcode);
		
		Select country=new Select(dropdown_country);
		country.getFirstSelectedOption();
		System.out.println("the selected country is: "+country.getFirstSelectedOption().getText());
		
		txtField_additionalinfo.sendKeys(txtFieldadditionalinfo);
		txtField_homephone.sendKeys(txtFieldhomephone);
		txtField_mobilephone.sendKeys(txtFieldmobilephone);
		txtField_reference.clear();
		txtField_reference.sendKeys(txtFieldreference);
		btn_register.click();
		System.out.println("The error meassage Displayed after registration is:" +error_message.getText());
	}	
	
	/*
	public void paramRegister(String txtfirstname,String txtlastname,String txtregisteremail,String txtpassword,
			String dropdowndays,String dropdownmonths,String dropdownyear,
			String addressfirstname,String addresslastName,String addresscompany,String txtFieldaddress,String txtFieldaddress2,
			String txtFieldcity,String txtFieldpostalcode,String txtFieldadditionalinfo,
			String txtFieldhomephone,String txtFieldmobilephone,String txtFieldreference) {
		
		txtField_firstname.sendKeys(txtfirstname);
		txtField_lastname.sendKeys(txtlastname);
		txtField_registeremail.sendKeys(txtregisteremail);
		txtField_password.sendKeys(txtpassword);	
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeSelected(dropdown_dob_days));
		
		Select days=new Select(dropdown_dob_days);
		days.selectByValue("4");
		
		Select months=new Select(dropdown_dob_months);
		months.selectByValue("4");
		
		Select year=new Select(dropdown_dob_year);
		year.selectByValue("2020");
		
		address_firstname.sendKeys(addressfirstname);
		address_lastName.sendKeys(addresslastName);
		address_company.sendKeys(addresscompany);
		txtField_address.sendKeys(txtFieldaddress);
		txtField_address2.sendKeys(txtFieldaddress2);
		txtField_city.sendKeys(txtFieldcity);
		
		txtField_postalcode.sendKeys(txtFieldpostalcode);
		txtField_additionalinfo.sendKeys(txtFieldadditionalinfo);
		txtField_homephone.sendKeys(txtFieldhomephone);
		txtField_mobilephone.sendKeys(txtFieldmobilephone);
		txtField_reference.sendKeys(txtFieldreference);
	}*/
	
}
	
		