package testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.SummerDress;


public class TC_DynamicDressSelect extends BaseClass {
	

	@Test
	public void checkout() throws InterruptedException {

		/*SignIn st = new SignIn(driver);
		st.signIn();
		
		AccountLogin log = new AccountLogin(driver);
		log.login();*/

		SummerDress dress=new SummerDress(driver);
		dress.itemcenter();
		test.log(LogStatus.INFO, "Dashboard Links Clicked");

			}

	
	}

