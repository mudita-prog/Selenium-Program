package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_12_WAP_UsingTagNameLocator {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Documents/learningHTML1%20-%20Copy.html");
		WebElement e1 = driver.findElement(By.xpath("(//input)[@id ='1']"));
		e1.sendKeys("mudita2611");
		
		WebElement e2 = driver.findElement(By.xpath("(//input)[@id = '2']"));
		e2.sendKeys("old");
		WebElement e3 = driver.findElement(By.xpath("(//input)[@id = '3']"));
		e3.sendKeys("mg123");
		WebElement e4 = driver.findElement(By.xpath("//input[@name = 'fname']"));
		e4.sendKeys("Mudita");
		WebElement e6 = driver.findElement(By.xpath("//input[@id='321']"));
		e6.click();
		WebElement e7 = driver.findElement(By.xpath("//input[@type='radio']"));
		e7.click();
		


	}

}
