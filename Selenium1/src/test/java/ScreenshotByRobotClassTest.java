import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotByRobotClassTest {
  @Test
  public void f() throws IOException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/AutoComplete.html");

	  Robot robot1=new Robot();

	  Dimension sc_size= Toolkit.getDefaultToolkit().getScreenSize();

	  Rectangle rect1=new Rectangle(sc_size);

	  BufferedImage Source=robot1.createScreenCapture(rect1);

	  File destination=new File("C:\\Users\\ipsita.panda\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\sc2.jpg");

	  ImageIO.write(Source, "JPG", destination);
  }
}
