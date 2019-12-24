package actionsDemos;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  System.out.println("In test method");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 
	  
  }
  @BeforeMethod
  public void browseropen() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  
  }
  @AfterMethod
  public void closebrowser() {
	  driver.close();
  }
}
