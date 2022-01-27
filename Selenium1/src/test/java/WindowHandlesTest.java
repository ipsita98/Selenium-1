import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Windows.html");

	  String title1=d1.getTitle();

	  d1.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();

	  Set <String>window_value=d1.getWindowHandles();

	  Iterator <String> iter= window_value.iterator();

	  String window1=iter.next();

	  String window2=iter.next();

	  d1.switchTo().window(window2);


	  String title2=d1.getTitle();

	  System.out.println(title1);

	  System.out.println(title2);

	  System.out.println(window1);

	  System.out.println(window2);


  }
}
