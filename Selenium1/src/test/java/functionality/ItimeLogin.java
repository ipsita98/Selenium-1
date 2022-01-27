package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_repository.Elements;

public class ItimeLogin {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
     d1.get("https://www.myhcl.com/bprhome/Home/Index");
     
     Elements.sign_in(d1).sendKeys("ipsita.panda@hcl.com");
     Elements.next(d1).sendKeys("burger1234M@");
		
  }
}
