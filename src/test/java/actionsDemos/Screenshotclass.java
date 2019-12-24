package actionsDemos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotclass {
	public static void screensshotmethod(WebDriver driver,String Screenshot) throws IOException {
		  //(TakesScreenshot) - Is interface and typing casting driver to Takesscreenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			  //object after typing casting is ts

			 File fls=ts.getScreenshotAs(OutputType.FILE);
			 //Storing screenshot in the form of File class object getscreenshot is method 

		                   //File is class importing from Java class
			 FileHandler.copy(fls, new File("./Screenshots/"+timestamp()+Screenshot+".png"));
			 System.out.println("Screenshot taken..");
			 //copying from the file from memory(buffer) fls to project location,screenshots folder and name is fb 
	}
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
	}


}
