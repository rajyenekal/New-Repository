package Test_Scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_Test_Scripts_Administrator_Test extends Base_test_vtiger{
	@Test
	public void Administrator() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		Actions action=new Actions(driver);
		action.moveToElement(page.Administrator_icon()).build().perform();
		action.moveToElement(page.signout()).click().perform();
		driver.close();
	}

}
