package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_Quick_Create_dropdown_Test extends Base_test_vtiger {
	@Test
	public void Quick_dropdown() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(3,page.quick_dropdown);
		driver.close();
		}
	}



