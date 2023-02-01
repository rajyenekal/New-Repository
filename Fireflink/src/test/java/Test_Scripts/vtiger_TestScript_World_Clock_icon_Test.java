package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_World_Clock_icon_Test extends Base_test_vtiger {
	@Test
	public void World_Clock() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.World_clock_icon();
		page.cancel_World_clock_icon();
		driver.close();
	}

}
