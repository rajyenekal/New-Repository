package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_NewEvent_Test extends Base_test_vtiger {
	@Test
	public void NewEvent() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(8,page.quick_dropdown);
		page.Subject_textfield("Fireflink");
		page.save_button();
}
}
