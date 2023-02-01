package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_NewTicket_Test extends Base_test_vtiger{
	@Test
	public void NewTicket() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(9,page.quick_dropdown);
		page.Text_area("FIRE_FLINK");
		page.save_button();
}

}
