package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_15_hoveroverLanguage_kannada {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2 = driver.findElement(By.xpath("//div[@id=\"nav-flyout-icp\"]/div/a[2]"));
		e2.click();
	
				

	}

}
