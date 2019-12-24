package actionsDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.loginpage;

public class LoginTestcase {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignIn")).click();
	  loginpage obj=new loginpage(driver);
	  obj.um("lalitha");
	  obj.pm("password123");
	  obj.lm();
	  //obj.nm();
	  Thread.sleep(20000);
	  driver.close();
  }
}
