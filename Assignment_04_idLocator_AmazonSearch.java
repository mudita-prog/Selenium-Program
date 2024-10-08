package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_04_idLocator_AmazonSearch {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("iphone 16 256gb");
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);
		
		
		
		
		
	}
}

