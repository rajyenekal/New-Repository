package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_Service_contract_Test extends Base_test_vtiger {
	@Test
	public void Service_contract() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(17,page.quick_dropdown);
		page.subject_textfield("Fireflink");
		page.total_units_textfield("15");
		page.Used_units_textfield("10");
		page.save_button();
}

}
