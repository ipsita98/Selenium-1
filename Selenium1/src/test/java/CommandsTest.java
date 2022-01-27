import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.Dimension;
import java.io.Serializable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CommandsTest {
  @Test
  public void f() {
	 	   
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  

	  d1.get("http://demo.automationtesting.in/Register.html");
	  String value = d1.findElement(By.xpath("//a[normalize-space()='Register']")).getText();
	  System.out.println(value);
	  System.out.println(d1.getPageSource());
	  System.out.println(d1.getCurrentUrl());
	  d1.navigate().back();
	  d1.navigate().forward();
	  d1.navigate().refresh();
	  d1.navigate().to("http://leafground.com/pages/Dropdown.html");
	  d1.manage().window().maximize();
	  Serializable dim=new Dimension(350,250);
	  d1.manage().window().setSize((org.openqa.selenium.Dimension) dim);
	  d1.close();
	  d1.quit();


  }
}
