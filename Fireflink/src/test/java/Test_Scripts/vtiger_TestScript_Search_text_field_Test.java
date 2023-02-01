package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_Search_text_field_Test extends Base_test_vtiger{
	@Test
	public void search_text_field() {
		vtiger_page page =new vtiger_page(driver);
		page.login();
		page.search_text_field("calender");
		page.Search_icon();
		driver.close();
	}

}
