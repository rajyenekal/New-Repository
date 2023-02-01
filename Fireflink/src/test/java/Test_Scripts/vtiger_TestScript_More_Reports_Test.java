package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_More_Reports_Test extends Base_test_vtiger {
	@Test
	public void More_Reports() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Email_tab();
		page.Email_Textfield("chethankumarhmm@gmail.com");
		page.Find_button();
		driver.close();
	}


}
