import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownsTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ipsita.panda\\\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("http://leafground.com/pages/Dropdown.html");

	  Select s1=new Select(d1.findElement(By.id("dropdown1")));
	  s1.selectByVisibleText("Selenium");

	  Select s2=new Select(d1.findElement(By.name("dropdown2")));
	  s2.selectByIndex(1);


	  Select s3=new Select(d1.findElement(By.xpath("//select[@id='dropdown3']")));
	  s2.selectByValue("3");


  }
}
