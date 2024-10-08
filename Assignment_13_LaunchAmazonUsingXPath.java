package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_13_LaunchAmazonUsingXPath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	    WebElement e1 = driver.findElement(By.xpath("(//select)[@id='searchDropdownBox']/option[text()='Books']"));
		e1.click();
		
		 WebElement e2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 e2.sendKeys("Power of Minds" + Keys.ENTER);
		
		
	
	
	
	

	}

}
