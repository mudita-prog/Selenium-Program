package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_26_RightClickOnBankingAppAndInspectIt {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		
		Actions a1 = new Actions(driver);
		a1.contextClick().perform();
/*	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ENTER);
	*/

	}

}
