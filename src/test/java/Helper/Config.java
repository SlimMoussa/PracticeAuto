package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	

	public static WebDriver driver;  
	
		
	public static void initDriver() {
		
		 driver = new ChromeDriver ();
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			driver.manage().window().maximize();
					
  }	
}