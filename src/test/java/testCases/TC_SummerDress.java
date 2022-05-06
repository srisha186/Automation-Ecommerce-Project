package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.SummerDress;


public class TC_SummerDress extends BaseClass {
	

	@Test
	public void checkout() throws InterruptedException {
		
		/*SignIn st = new SignIn(driver);
		st.signIn();
		
		AccountLogin log = new AccountLogin(driver);
		log.login();*/

		SummerDress dress=new SummerDress(driver);
		dress.itemcenter();
			}

	
	}

