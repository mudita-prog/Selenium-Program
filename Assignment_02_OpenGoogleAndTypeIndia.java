package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_02_OpenGoogleAndTypeIndia {

	public static void main(String[] args) {
	
		ChromeDriver a = new ChromeDriver();
		
		a.get("http://www.google.com");
		a.findElement(By.name("q")).sendKeys("India");
		a.findElement(By.name("btnK")).click();
		a.manage().window().maximize();
		a.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
	}

}
