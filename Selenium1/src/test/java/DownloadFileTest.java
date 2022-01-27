import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFileTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ipsita.panda\\\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  
	  d1.get("http://leafground.com/pages/download.html");
	  d1.findElement(By.xpath("//a[normalize-space()='Download Excel']")).click();
	  Thread.sleep(3000);
	  File f1=new File("C:\\Users\\ipsita.panda\\Downloads");
	  File[] total_files=f1.listFiles();
	  for(File fs:total_files) {
	  if(fs.getName().equalsIgnoreCase("testleaf (6).xlsx")) {
	  System.out.println("File downloaded");
	  break;


  }
}
  }
  
}
