package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_NewCampaign_dropdown_Test extends Base_test_vtiger {
	@Test
	public void NewCampaign_dropdown() throws InterruptedException {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(4,page.quick_dropdown);
		page.camapign_name_textfield("Fireflink");
		page.Quick_dropdown(5,page.campaign_type_dropdown());
		page.save_button();
		driver.close();
}

}
