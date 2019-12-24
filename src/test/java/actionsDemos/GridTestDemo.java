package actionsDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTestDemo {
WebDriver driver;
    
    @Parameters({"node","browser"})
    @Test
    public void f(String node , String browser) throws MalformedURLException, InterruptedException {
    
      DesiredCapabilities capability=new DesiredCapabilities();
 
      capability.setBrowserName(browser);
      capability.setPlatform(Platform.WIN10);
      //capability.setPlatform(Platform.);
    
      //driver=new ChromeDriver()
      WebDriver driver=new RemoteWebDriver(new URL(node),capability);
      driver.get("http://newtours.demoaut.com");
      driver.findElement(By.name("userName")).sendKeys("demo");
      driver.findElement(By.name("password")).sendKeys("demo");
      driver.findElement(By.name("login")).click();
      Thread.sleep(2000);
      driver.close();
      
}

}
