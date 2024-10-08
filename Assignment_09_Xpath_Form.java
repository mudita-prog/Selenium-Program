package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_09_Xpath_Form {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Documents/learningHTML1%20-%20Copy.html");
		driver.manage().window().maximize();
		
     	WebElement e1 = driver.findElement(By.xpath("(html/body/input)[1]"));
		e1.sendKeys("muditagupta");
	
		WebElement e2 = driver.findElement(By.xpath("(html/body/input)[2]"));
		e2.sendKeys("Mudita");
		
		WebElement e3 = driver.findElement(By.xpath("(html/body/input)[3]"));
		e3.sendKeys("Mg123");
		
		WebElement e4 = driver.findElement(By.xpath("(html/body/form/input)[1]"));
		e4.sendKeys("Mudita");
		
		WebElement e5 = driver.findElement(By.xpath("html/body/input[5]"));
		e5.click();
		
		WebElement e8 = driver.findElement(By.xpath("html/body/form[2]/input[3]"));
		e8.click();
		
		WebElement e6 = driver.findElement(By.xpath("html/body/input[6]"));
		e6.click();

		WebElement e7 = driver.findElement(By.xpath("html/body/a"));
		e7.click();
		
		
	}

}
