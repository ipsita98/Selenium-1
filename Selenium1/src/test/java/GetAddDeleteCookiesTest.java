import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GetAddDeleteCookiesTest {
  @Test
  public void f() throws IOException {
	  
	  
	  WebDriver d1;
	  
	  FileInputStream f1=new FileInputStream("src\\test\\java\\example\\Config.properties");
      Properties prop=new Properties();
      prop.load(f1);
      
      String browser_name=prop.getProperty("browser");
      String path=prop.getProperty("driverpath");

      if(browser_name.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", path);

	  d1=new ChromeDriver();
	  
      }

         else {
       System.setProperty("webdriver.ie.driver",path);

       d1=new InternetExplorerDriver();
       
      
       WebDriver d11;
       FileInputStream f1=new FileInputStream("src\\test\\java\\example\\Config.properties"); Properties prop1=new Properties(); prop1.load(f1); String browser_name=prop1.getProperty("browser"); String path1=prop1.getProperty("driverpath"); if(browser_name.equalsIgnoreCase("chrome")) {
       System.setProperty("webdriver.chrome.driver", path1);
       d11 = new ChromeDriver();
       }
       else if(browser_name.equalsIgnoreCase("firefox")) {
       System.setProperty("webdriver.gecko.driver",path1); d11=new FirefoxDriver(); } else { System.setProperty("webdriver.ie.driver",path1); d11=new InternetExplorerDriver(); }
       d11.get("https://ksrtc.in/oprs-web/login/show.do");
       d11.findElement(By.xpath("//label[normalize-space()='User Name']")).sendKeys("username");
       d11.findElement(By.xpath("//label[normalize-space()='Password']")).sendKeys("password");
       d11.findElement(By.xpath("//input[@id='submitBtn']")).click();
       File fs=new File("C:\\\\Users\\\\bhasw\\\\OneDrive\\\\Desktop\\\\Data HCL.xlsx");
       try {
       fs.createNewFile();
       FileWriter fw1=new FileWriter(fs);
       BufferedWriter bw=new BufferedWriter(fw1);
       for(org.openqa.selenium.Cookie ck:d11.manage().getCookies()) {
       bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry()));
       bw.newLine();
       }
       bw.close();
       fw1.close();
       }
       catch(Exception e) {
       System.out.println(e);


       
       



      }
  }
}
}
