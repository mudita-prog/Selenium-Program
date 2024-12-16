package Selenum_Assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_20_Autosuggestion_Bangalore {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(5000);
		List <WebElement> l1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = l1.size();
		System.out.println(count);
		Thread.sleep(5000);
		l1.get(5).click();
		

	}

}
