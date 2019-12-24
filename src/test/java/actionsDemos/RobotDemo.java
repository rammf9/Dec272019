package actionsDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class RobotDemo {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException, IOException {
	  
	  String command = "notepad.exe"; 
      Runtime run = Runtime.getRuntime(); 
      run.exec(command); 
      
   // Create an instance of Robot class 
      Robot robot = new Robot(); 

      // Press keys using robot. A gap of 
      // of 500 mili seconds is added after 
      // every key press 
      robot.keyPress(KeyEvent.VK_S);
      robot.keyPress(KeyEvent.VK_E);
      robot.keyPress(KeyEvent.VK_L);
      robot.keyPress(KeyEvent.VK_E);
      robot.keyPress(KeyEvent.VK_N);
      robot.keyPress(KeyEvent.VK_I);
      robot.keyPress(KeyEvent.VK_U);
      robot.keyPress(KeyEvent.VK_M);
      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyPress(KeyEvent.VK_D);
      robot.keyPress(KeyEvent.VK_E);
      robot.keyPress(KeyEvent.VK_M);
      robot.keyPress(KeyEvent.VK_O);
      
      Thread.sleep(10000);
	  /*System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.edureka.co/");
	  driver.manage().window().maximize();
	    */
  }
}
