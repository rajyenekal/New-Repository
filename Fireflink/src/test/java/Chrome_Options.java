import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Options {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opti=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opti);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://demowebshop.tricentis.com/");
		opti.addArguments("--Incognito");
		opti.addArguments("--MaximizeAction");
		opti.addArguments("--disable-notification");
	
		
		
		
		
	}

}
