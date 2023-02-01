package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_NewProject_dropdown_Test extends Base_test_vtiger {
	@Test
	public void NewProject() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(14,page.quick_dropdown);
		page.Project_name("Demo_Web_shop");
		page.calender_icon();
		page.date_of_calender_31();
		page.save_button();
}

}
