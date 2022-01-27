import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LocatorsTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ipsita.panda\\\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://demo.automationtesting.in/Register.html");

	  d1.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ipsita");

	  d1.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Panda");


	  d1.findElement(By.xpath("//input[@type='email']")).sendKeys("ipsita98.panda@gmail.com");

	  d1.findElement(By.xpath("//input[@type='tel']")).sendKeys("276456");


	  Select s1=new Select (d1.findElement(By.id("Skills")));
	  s1.selectByValue("Adobe InDesign");



	  d1.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("ipsita");

	  d1.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("ipsita");


	  
  }
}
