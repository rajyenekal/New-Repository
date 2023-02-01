package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_New_Service_Test extends Base_test_vtiger {
	@Test
	public void New_Service() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(18,page.quick_dropdown);
		page.Service_name_textfield("Firef;ink");
		page.Active_checkbox_new_service();
		page.Price_Textbox("10000");
		page.save_button();
}

}
