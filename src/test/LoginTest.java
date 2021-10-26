package test;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	 

@Parameters({"UserName","Password"})
        @Test
         public void NegativeLogin(String UserNameVal,String PasswordVal) {
    
		LoginPage login = new LoginPage();
         login.Login(UserNameVal,PasswordVal);
         login.ErrorCheck();
      
       
       }

	@Parameters({"UserName","CorrectPassword"})
	@Test
		public void PositiveLogin(String UserNameVal,String PasswordVal)
     {
		LoginPage login = new LoginPage();
      login.Login(UserNameVal,PasswordVal);

     }
	}
