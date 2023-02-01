package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_New_organization_dropdown_Test extends Base_test_vtiger {
	@Test
	public void new_organization() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(1,page.quick_dropdown);
		page.organization_name_textfield("testyantra");
		page.phone_textfield("973174988");
		page.save_button();
		driver.close();
	}
}
