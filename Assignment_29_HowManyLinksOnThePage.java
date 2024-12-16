package Selenum_Assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_29_HowManyLinksOnThePage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		List <WebElement> l1 = driver.findElements(By.tagName("a"));//it is universal that a tagname is common
		int count = l1.size();
		System.out.println(count);
		
		for(int i=0;i<l1.size();i++)
		{
			WebElement e1 = l1.get(i);
	        String s1 = e1.getText();
	        System.out.println(s1);
		}
	}

}
