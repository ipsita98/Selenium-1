package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	
	public static WebElement emailid(WebDriver d1) {
		return d1.findElement(By.id("email"));
	}
	
	
	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.id("passwd"));
	
	}

	public static WebElement sign_in_button(WebDriver d1) {
		return d1.findElement(By.id("SubmitLogin"));
	}
	
	public static WebElement women(WebDriver d1) {
		return d1.findElement(By.xpath("//a[@class='sf-with-ul'][normalize-space()='Women']"));
	}
	
	public static WebElement tshirts(WebDriver d1) {
		return d1.findElement(By.cssSelector(".replace-2x[src='http://automationpractice.com/img/c/4-medium_default.jpg']"));
	}
	
	public static WebElement faded_short_sleeve_tshirt(WebDriver d1) {
		return d1.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']//img[@title='Faded Short Sleeve T-shirts']"));
    }
	
	public static WebElement add_to_cart_button(WebDriver d1) {
		return d1.findElement(By.xpath("//span[normalize-space()='Add to cart']"));
    }
	
	

	public static WebElement sign_in(WebDriver d1) {
	return d1.findElement(By.xpath("//*[@id=\"i0116\"]"));
	}
	
	public static WebElement next(WebDriver d1) {
	return d1.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	



