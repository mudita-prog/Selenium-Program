package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_05_youtubeSearchbyIDLocator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.youtube.com");
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.click();
		e1.sendKeys("Grotech Minds");
		e1.sendKeys(Keys.ENTER);

	}

}
