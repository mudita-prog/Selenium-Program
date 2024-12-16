package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_31_handleFileUploadPopup {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e2 = driver.findElement(By.name("Present-Address"));
		Point p1 = e2.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor j1 = driver;
		j1.executeScript("window.scrollBy(0,794)");
		
		WebElement e1 = driver.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\hp\\Desktop\\67 Wedding.pdf");
	}

}
