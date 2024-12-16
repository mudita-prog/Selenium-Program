package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_38_handleJAvaScriptPopupRegistrationPage {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.get("https://grotechminds.com/javascript-popup/");
     	
     	WebElement e1 = driver.findElement(By.xpath("//button[@class=\"btnjs\"]"));
     	e1.click();
     	driver.switchTo().alert().dismiss();
     	
     	
     	}
}
