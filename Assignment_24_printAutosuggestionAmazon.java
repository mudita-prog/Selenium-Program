package Selenum_Assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_24_printAutosuggestionAmazon {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoe") ;
		Thread.sleep(5000);
		List <WebElement> l1  = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		
		
		for(int i = 0;i<l1.size();i++)
		{
			WebElement print = l1.get(i);
			String s1 = print.getText();
			System.out.println(s1);}

	}

}
