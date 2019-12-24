package actionsDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
  @Test
  public void Testcase1() throws InterruptedException {
	 driver.get("http://uitestpractice.com/Students/Index");
	 Actions act=new Actions(driver);
	 WebElement sb=driver.findElement(By.id("Search_Data"));
	 act.keyDown(Keys.SHIFT).click(sb).sendKeys("kamal").keyUp(Keys.SHIFT).build().perform();
	 
	 Thread.sleep(5000);
  }
  @BeforeMethod
  public void blaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  @AfterMethod
  public void cbrowser() {
	driver.close();
  }
}
