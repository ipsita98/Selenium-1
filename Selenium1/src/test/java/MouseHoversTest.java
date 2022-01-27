import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoversTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  
	  d1.get("http://demo.automationtesting.in/Static.html");
	  WebElement drag1=d1.findElement(By.className("dragged"));
	  Actions act1=new Actions(d1);
	  act1.dragAndDropBy(drag1, 250, 450).build().perform();


  }
}
