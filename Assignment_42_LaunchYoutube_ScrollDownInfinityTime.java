package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_42_LaunchYoutube_ScrollDownInfinityTime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.youtube.com");
		WebElement e1=driver.findElement(By.name("search_query"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
		
		Point p1=e1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(2000);
		
		JavascriptExecutor j1=driver;
		while(y>10)
		{
			y=y+4000;
		j1.executeScript("window,scrollBy(0,"+y+")");
		
	}
}
}