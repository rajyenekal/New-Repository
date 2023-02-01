package Test_Scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_More_tab_Test extends Base_test_vtiger{
	@Test
	public void Calculator() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		Actions action=new Actions(driver);
		action.moveToElement(page.More_Tab()).build().perform();
		action.moveToElement(page.Reports_option()).click().perform();
		driver.close();
}

}
