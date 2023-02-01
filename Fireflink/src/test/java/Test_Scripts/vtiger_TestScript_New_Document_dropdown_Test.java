package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_New_Document_dropdown_Test extends Base_test_vtiger {
	@Test
	public void New_Document() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(7, page.quick_dropdown);
		page.Title_textfield("fireflink");
		page.save_button();
	}
}
