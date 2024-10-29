package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.Config;

public class LoginPage {
	
	public LoginPage() {
		
	}
        
	
	
	public void loginWithValidCredantials () {
		
		//WebElement tUsername = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/ul[1]/li[2]/b[1]"));
		//String TextUsername = tUsername.getText();
		
		//WebElement tmdp = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/ul[1]/li[2]/b[1]"));
		//String TextMDP = tmdp.getText();
		
		WebElement username = Config.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/input[1]"));
		username.sendKeys("student");
		
		WebElement password = Config.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/input[1]"));
		password.sendKeys("Password123");
		
		WebElement bouton = Config.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/button[1]"));
		bouton.click();
		
		String expectedTitle = "Logged In Successfully | Practice Test Automation";
        String actualTitle = Config.driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
		
	}	
	
		public void loginWithInvalidCredantials () {
			
			
			
			WebElement username = Config.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/input[1]"));
			username.sendKeys("student");
			
			WebElement password = Config.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/input[1]"));
			password.sendKeys("Pass");
			
			WebElement bouton = Config.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/button[1]"));
			bouton.click();
			
			WebElement errorMessage = Config.driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[2]"));
	        String expectedErrorMessage = "Your password is invalid!";
	        String actualErrorMessage = errorMessage.getText();

	        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
			
			}
}
