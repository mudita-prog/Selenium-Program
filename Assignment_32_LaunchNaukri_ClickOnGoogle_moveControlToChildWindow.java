package Selenum_Assignments_AB45;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_32_LaunchNaukri_ClickOnGoogle_moveControlToChildWindow {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement e1 = driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		Set <String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator <String> i1 = s1.iterator();
		String parentId = i1.next();
		String childId = i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		
		driver.switchTo().window(childId);
		Thread.sleep(5000);
		driver.close();
	}

}
