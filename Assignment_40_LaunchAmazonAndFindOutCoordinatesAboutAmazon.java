package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_40_LaunchAmazonAndFindOutCoordinatesAboutAmazon {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.partialLinkText("About Amazon"));
		Point p1 = e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor j1 = driver;
		j1.executeScript("window.scrollBy(0,4900)");
		

	}

}
