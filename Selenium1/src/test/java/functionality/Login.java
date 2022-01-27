package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_repository.Elements;

public class Login {
	

	@Test
	public void f() throws AWTException, IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account%22);%22");
		
      JavascriptExecutor jse=(JavascriptExecutor) d1;
      jse.executeScript("scroll(0,250)");

        Elements.emailid(d1).sendKeys("ipsita.panda@gmail.com");
		Elements.password(d1).sendKeys("12345");
		Elements.sign_in_button(d1).click();
		Elements.women(d1).click();
		Elements.tshirts(d1).click();
		Elements.faded_short_sleeve_tshirt(d1).click();
		Elements.add_to_cart_button(d1).click();
		
		
		Thread.sleep(5000);
		
		Robot robot1=new Robot();
        Dimension sc_size= Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect1=new Rectangle(sc_size);
        BufferedImage Source=robot1.createScreenCapture(rect1);
        File destination=new File("C:\\Users\\ipsita.panda\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\scC.jpg");
        ImageIO.write(Source, "JPG", destination);
        
        d1.close();
		
		
	
	

}
}
