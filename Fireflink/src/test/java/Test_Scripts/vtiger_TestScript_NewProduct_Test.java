package Test_Scripts;

import org.testng.annotations.Test;

import Essentials.Base_test_vtiger;
import Web_Pages.vtiger_page;

public class vtiger_TestScript_NewProduct_Test extends Base_test_vtiger{
	@Test
	public void New_PriceBook() {
		vtiger_page page=new vtiger_page(driver);
		page.login();
		page.Quick_dropdown(13,page.quick_dropdown);
		page.Productname_Testfield("chethan_fireflink");
		page.UnitPrice_Testfield("500");
		page.Product_Active_checkBox();
		page.Qty_in_stock_textfield("5");
		page.save_button();
}

}
