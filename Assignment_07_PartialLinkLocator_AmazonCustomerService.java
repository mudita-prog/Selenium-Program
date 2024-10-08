package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_07_PartialLinkLocator_AmazonCustomerService {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.partialLinkText("Customer Service"));
		e1.click();
		
	
		
		

	}

}
