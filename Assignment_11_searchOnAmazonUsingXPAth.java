package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_11_searchOnAmazonUsingXPAth {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("Curtains"  +  Keys.ENTER);

	}

}
