import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileTest {
  @Test
  public void f() throws AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  
	  d1.get("https://www.ilovepdf.com/excel_to_pdf");
	  d1.findElement(By.xpath("//span[normalize-space()='Select EXCEL files']")).click();
	  
	  String file="C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32\\doc";
	  StringSelection sc=new StringSelection(file); Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  Robot r1=new Robot(); r1.keyPress(KeyEvent.VK_CONTROL);
	  r1.keyPress(KeyEvent.VK_V);
	  r1.keyRelease(KeyEvent.VK_V);
	  r1.keyRelease(KeyEvent.VK_CONTROL);
	  r1.keyPress(KeyEvent.VK_ENTER);
	  r1.keyRelease(KeyEvent.VK_ENTER);


  }
}
