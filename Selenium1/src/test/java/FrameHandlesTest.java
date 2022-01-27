import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlesTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ipsita.panda\\\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	 
	  d1.get("http://demo.automationtesting.in/Frames.html");
	  d1.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
	  Thread.sleep(2000);
	  d1.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();


  }
}
