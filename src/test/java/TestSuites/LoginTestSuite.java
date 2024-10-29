package TestSuites;

import Helper.Config;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTestSuite {

    @Test
    public void testLoginWithValidCredentials()  {
        
    	
    	Config.initDriver();
       
        Config.driver.get("https://practicetestautomation.com/practice-test-login/");
        
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithValidCredantials();
                
        
       
    }

    @Test
    public void testLoginWithInvalidCredentials()  {
      
         Config.initDriver();
        
        Config.driver.get("https://practicetestautomation.com/practice-test-login/");
        
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithInvalidCredantials();

        
        
    }
}
