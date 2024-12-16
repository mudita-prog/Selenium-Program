package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_18_RevertDragAndDrop {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement e1 = driver.findElement(By.id("container-10"));
		WebElement e2 = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		a1.dragAndDrop(e2, e1).perform();
		
		WebElement e3 = driver.findElement(By.id("drag6"));
		WebElement e3a= driver.findElement(By.id("container-5"));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(e3, e2).perform();
		a2.dragAndDrop(e2, e3a).perform();
	
		WebElement e4 = driver.findElement(By.id("drag1"));
		WebElement e4a = driver.findElement(By.id("container"));
		Actions a3 = new Actions(driver);
		a3.dragAndDrop(e4, e2).perform();
		a3.dragAndDrop(e2, e4a).perform();
		
		WebElement e5 = driver.findElement(By.id("drag4"));
		WebElement e6 = driver.findElement(By.id("container-3"));
		Actions a4 = new Actions(driver);
		a4.dragAndDrop(e5, e2).perform();
		a4.dragAndDrop(e2, e6).perform();
		
		WebElement e7 = driver.findElement(By.id("drag3"));
		WebElement e8 = driver.findElement(By.id("container-2"));
		Actions a5 = new Actions(driver);
		a4.dragAndDrop(e7, e2).perform();
		a4.dragAndDrop(e2, e8).perform();
		
		WebElement e9 = driver.findElement(By.id("drag10"));
		WebElement e10 = driver.findElement(By.id("container-9"));
		Actions a6 = new Actions(driver);
		a4.dragAndDrop(e9, e2).perform();
		a4.dragAndDrop(e2, e10).perform();
		
		WebElement e11 = driver.findElement(By.id("drag9"));
		WebElement e12 = driver.findElement(By.id("container-8"));
		Actions a7 = new Actions(driver);
		a4.dragAndDrop(e11, e2).perform();
		a4.dragAndDrop(e2, e12).perform();
		

	}

}
