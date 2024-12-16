package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_19_GrotechWebsite_skillsReligionCountry {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("Skills"));
		Select s1 = new Select(e1);
		s1.selectByIndex(1);
		
        WebElement e2 = driver.findElement(By.id("Country"));
		Select s2 = new Select(e2);
		s2.selectByValue("India");
		
		WebElement e3 = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(e3);
		s3.selectByVisibleText("Hindu");
		
		

	}

}
