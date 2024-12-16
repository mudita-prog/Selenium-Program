package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment_16_hoveroverOnGrotechminds {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
	    WebElement e1 = driver.findElement(By.xpath(("//div[@data-id='1857001']")));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.xpath("(//div)[@class=\"popup4\"][3]"));
		e2.click();
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://grotechminds.com/hoverover/");
		driver1.manage().window().maximize();
		WebElement e3 = driver1.findElement(By.xpath("(//div)[@data-id=\"824f369\"]"));
		Actions a2 = new Actions(driver1);
		a2.moveToElement(e3).perform();
		WebElement e4 = driver1.findElement(By.xpath("(//div)[@class='popup6'][10]"));
		e4.click();
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://grotechminds.com/hoverover/");
		driver2.manage().window().maximize();
		WebElement e5 = driver2.findElement(By.xpath("(//div)[@data-id=\"551f3a8\"]"));
		Actions a3 = new Actions(driver2);
		a3.moveToElement(e5).perform();
		WebElement e6 = driver2.findElement(By.xpath("(//div)[@class=\"popup7\"][1]"));
		e6.click();
		
		ChromeDriver driver3 = new ChromeDriver();
		driver3.get("https://grotechminds.com/hoverover/");
		driver3.manage().window().maximize();
		WebElement e7 = driver3.findElement(By.xpath("(//div)[@data-id=\"ab4cf56\"]"));
		Actions a4 = new Actions(driver3);
		a4.moveToElement(e7).perform();
		WebElement e8 = driver3.findElement(By.xpath("(//div)[@class=\"popup4\"][16]"));
		e8.click();
	
		ChromeDriver driver4 = new ChromeDriver();
		driver4.get("https://grotechminds.com/hoverover/");
		driver4.manage().window().maximize();
		WebElement e9 = driver4.findElement(By.xpath("(//div)[@data-id=\"ab4cf56\"]"));
		Actions a5 = new Actions(driver4);
		a5.moveToElement(e9).perform();
		WebElement e10 = driver4.findElement(By.xpath("(//div)[@class='popup4'][18]"));
		e10.click();
		
		ChromeDriver driver5 = new ChromeDriver();
		driver5.get("https://grotechminds.com/hoverover/");
		driver5.manage().window().maximize();
		WebElement e11 = driver5.findElement(By.xpath("(//div)[@data-id='ab4cf56']"));
		Actions a6 = new Actions(driver5);
		a6.moveToElement(e11).perform();
		WebElement e12 = driver5.findElement(By.xpath("(//div)[@class='popup4'][19]"));
		e12.click();
		
		ChromeDriver driver6 = new ChromeDriver();
		driver6.get("https://grotechminds.com/dropdown/");
		driver6.manage().window().maximize();
		WebElement e13 = driver.findElement(By.name("Choice8"));
		Select s1 = new Select (e13);
		s1.selectByVisibleText("QTP9");
		
		ChromeDriver driver7 = new ChromeDriver();
		driver7.get("https://grotechminds.com/dropdown/");
		driver7.manage().window().maximize();
		WebElement e14 = driver7.findElement(By.name("Choice4"));
		Select s2 = new Select (e14);
		s2.selectByVisibleText("Energy14");
	}

}
