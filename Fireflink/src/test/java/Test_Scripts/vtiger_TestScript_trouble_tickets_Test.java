package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_trouble_tickets_Test extends Base_test_vtiger {
	@Test
	public void Trouble_Tickets() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Trouble_tickets_tab();
		page.Find_Duplicates();
		page.cancel_button();
		page.Home_button();
		driver.close();
	}

}
