package actionsDemos;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
	WebDriver driver;
  @Test(dataProvider="Logindata")
  public void f(String uid, String pwd) throws InterruptedException {
	 
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys(uid);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals("Home", driver.getTitle());
	  
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("SignOut")).click();
	  Thread.sleep(3000);
	 
  }

  @BeforeClass
  public void browserlaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	  
  }
  @AfterClass
  public void closebrowser() {
	  driver.close();
  }
  @DataProvider
  public Object[][] Logindata(){
	Object[][] data= {
			{"lalitha","password12"},
			{"lalitha","password123"}
	};	  
	return data;
  }
}
