package Selenum_Assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_23_Print_Autosuggestions {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(5000);
		List <WebElement> l1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	
		for(int i=0;i<l1.size();i++)
		{
			WebElement print = l1.get(i);
			String s1 = print.getText();
			System.out.println(s1);
		}
		
	}

}
