package Test_Scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_settings_Test extends Base_test_vtiger {
	@Test
	public void settings() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		Actions action=new Actions(driver);
		action.moveToElement(page.settings()).build().perform();
		Thread.sleep(2000);
		action.moveToElement(page.CRM_setting()).click().perform();
		page.Home_button();
		driver.close();
	}

}
