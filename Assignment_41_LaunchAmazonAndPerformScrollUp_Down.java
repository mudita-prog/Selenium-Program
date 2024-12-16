package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_41_LaunchAmazonAndPerformScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.get("https://www.amazon.in/");
    
     	WebElement e1 = driver.findElement(By.partialLinkText("About Amazon"));
        Point p1 = e1.getLocation();
        int y = p1.getY();
        System.out.println(y);
        
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,5161)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-5161)");
         
     	
	}

}
