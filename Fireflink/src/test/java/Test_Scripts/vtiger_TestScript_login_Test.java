package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_login_Test extends Base_test_vtiger{
	@Test
	public void logins() {
		
		vtiger_page page=new vtiger_page(driver);
		page.login();
		driver.close();
	}

	   

}
