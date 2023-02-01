package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_testScript_Contacts_searchbox_Test extends Base_test_vtiger{
	@Test
	public void contacts_searchbox() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.contacts_tab();
		page.contacts_search_text_field("chethan");
		driver.close();
	}

}
