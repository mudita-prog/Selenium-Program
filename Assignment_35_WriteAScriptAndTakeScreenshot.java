package Selenum_Assignments_AB45;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_35_WriteAScriptAndTakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.in");
		
		TakesScreenshot SS = driver;
		File Source = SS.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\hp\\Desktop\\Screenshot Selenium\\1"+Math.random()+".png");
		FileHandler.copy(Source, Destination);
		
		
	}

}