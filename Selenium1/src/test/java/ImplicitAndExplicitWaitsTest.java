import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitAndExplicitWaitsTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ipsita.panda\\\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	  d1.get("http://demo.automationtesting.in/Alerts.html");

	  d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

	  WebDriverWait var_wait=new WebDriverWait(d1,20);

	  var_wait.until(ExpectedConditions.alertIsPresent());

	  String msg=d1.switchTo().alert().getText();

	  System.out.println(msg);

	  d1.switchTo().alert().accept();
  }
}
