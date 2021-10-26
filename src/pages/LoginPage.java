package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import test.BaseClass;

public class LoginPage {
	WebDriver driver = BaseClass.driver;
	
	public void Login(String UName,String Pwd) {
	    
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
 
		WebDriverWait wait=new  WebDriverWait(driver,30);
 
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
  
		LoginLink.click();

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UName);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Pwd);
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
        RememberMe.click();

		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
	}

		public void ErrorCheck() {
		WebElement Error=driver.findElement(By.id("msg_box"));
	       String ActualMsg =Error.getText();
	       String ExpMsg ="The email or password you have entered is invalid.";
	       //Assert.assertEquals(ActualMsg,ExpMsg);
	       SoftAssert soft=new SoftAssert();
	       soft.assertEquals(ActualMsg,ExpMsg);
	       soft.assertAll();
	}

}
