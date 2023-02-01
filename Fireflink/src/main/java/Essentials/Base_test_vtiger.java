package Essentials;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_test_vtiger {
public WebDriver driver;
	
	@BeforeClass
	public void Browsersetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		String url=utility_methods.Test_configuration();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	
	
	@BeforeMethod
	public void login() throws IOException {
		String usn= utility_methods.get_Test_configuration("username");
		String ps= utility_methods.get_Test_configuration("pwd");
		
		WebElement usnm=driver.findElement(By.xpath("//input[@name=\"user_name\"]"));
		utility_methods.Enter_Value_In_Textfield(usnm, usn);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
		utility_methods.Enter_Value_In_Textfield(pass, ps);
		
		WebElement lo= driver.findElement(By.xpath("//input[@id='submitButton']"));
		utility_methods.Click_Element(lo);
	
	}
	
	@AfterClass
	public void Teardown() {		
		driver.close();
		}
	}


