import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpsTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Alerts.html");

	  d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

	  Thread.sleep(5000);

	  String msg = d1.switchTo().alert().getText();

	  System.out.println(msg);

	  Thread.sleep(5000);

	  d1.switchTo().alert().accept();

	  d1.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();


	  d1.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();

	  Thread.sleep(5000);


	  d1.switchTo().alert().dismiss();

	  d1.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();

	  Thread.sleep(5000);

	  d1.findElement(By.xpath("//button[@onclick='promptbox()']")).click();



	  Thread.sleep(2000);

	  d1.switchTo().alert().sendKeys("IPSITA");

	  Thread.sleep(2000);


	  d1.switchTo().alert().accept();


  }
}
