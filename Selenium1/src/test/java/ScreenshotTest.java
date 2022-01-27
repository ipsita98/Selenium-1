import java.io.File;

import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTest {
  private static final String Destination = null;

@Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	 
	  d1.get("http://demo.automationtesting.in/AutoComplete.html");
	  TakesScreenshot ts=(TakesScreenshot) d1;
	  File Source=ts.getScreenshotAs(OutputType.FILE);
	  File destination=new File("C:\\Users\\ipsita.panda\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\sc1.jpg");
	  FileHandler.copy(Source, destination);
	  


  }
}
