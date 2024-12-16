package Selenum_Assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_22_autosuggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Mobiles");
		Thread.sleep(3000);
		List <WebElement> l1 =driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		l1.get(7).click();
	}

}
