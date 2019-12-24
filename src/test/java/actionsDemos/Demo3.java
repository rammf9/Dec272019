package actionsDemos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("In test method");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  System.out.println(driver.getTitle());
	  Actions act=new Actions(driver);
	  WebElement allcat=driver.findElement(By.xpath("//span[contains(text(),'All')]"));
	  act.moveToElement(allcat)
	  .moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")))
	  .click()
	  .build().perform();
	  
	  Screenshotclass.screensshotmethod(driver, "OCT29v1demo3");
	  Thread.sleep(1000);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")))
	  .click().perform(); 
	  
	  Thread.sleep(5000);
	  driver.close();
  }
  public static String timestamp() {
		return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
	}
}
