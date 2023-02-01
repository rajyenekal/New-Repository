package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_New_contact_dropdown_Test extends Base_test_vtiger {
	@Test
	public void New_contact_dropdown() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(6,page.quick_dropdown);
		page.Quick_dropdown(1,page.Firstname_dropdown());
		page.Firstname_testfield("Chethan");
		page.Email_textfield("chethankumarhmm@gmail.com");
		page.Lastname_testfield("Kumar HM");
		page.save_button();
		
	}

}
