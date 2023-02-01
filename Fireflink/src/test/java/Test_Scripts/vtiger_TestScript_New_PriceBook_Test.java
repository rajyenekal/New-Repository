package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_New_PriceBook_Test extends Base_test_vtiger{
	@Test
	public void New_PriceBook() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(12,page.quick_dropdown);
		page.Bookname_textfield("Fireflink");
		page.Active_checkBox();
		page.save_button();
	}

}
