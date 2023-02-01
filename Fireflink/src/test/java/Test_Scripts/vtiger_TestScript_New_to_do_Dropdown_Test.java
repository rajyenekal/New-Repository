package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_New_to_do_Dropdown_Test extends Base_test_vtiger{
	@Test
	public void New_to_do_Dropdown() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(3,page.quick_dropdown);
		page.subject_textfield("manual");
		page.Quick_dropdown(2,page.status_dropdown());
		page.save_button();
}

}
