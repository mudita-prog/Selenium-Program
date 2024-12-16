package Selenum_Assignments_AB45;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_33_LoginToAmazon_ClickOnFirstShoe_Addtocart {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe" + Keys.ENTER);
		
		
		WebElement e2 = driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-no-outline\"])[1]"));
		Point p1 = e2.getLocation();
		int y = p1.getY();
		System.out.println(y);
		JavascriptExecutor j1 = driver;
		j1.executeScript("window.scrollBy(0,695)");
		e2.click();
		
		Set <String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator <String> i1 = s1.iterator();
		String parentId = i1.next();
		String childId = i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		driver.switchTo().window(childId);
	    
	    Thread.sleep(6000);
	    WebElement e4 = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
	    e4.click();
	}

}
