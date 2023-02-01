package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_Calculator_icon_Test extends Base_test_vtiger {

@Test
public void Calculator() throws InterruptedException {
	vtiger_page page=new vtiger_page(driver);
	page.login();
	page.calculator();
	page.number6();
	Thread.sleep(2000);
	page.calculator_cancel_button();
	
}

}
