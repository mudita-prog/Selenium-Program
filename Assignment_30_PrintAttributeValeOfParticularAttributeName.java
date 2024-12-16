package Selenum_Assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_30_PrintAttributeValeOfParticularAttributeName {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> e1 = driver.findElements(By.tagName("a"));
		
		int count = e1.size();
		System.out.println(count);
		
		for(int i = 0;i<count;i++)
		{
			WebElement e2 = e1.get(i);
			String s1 = e2.getAttribute("href");
			System.out.println(s1);
		}
	}
}
