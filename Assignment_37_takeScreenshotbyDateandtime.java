package Selenum_Assignments_AB45;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_37_takeScreenshotbyDateandtime {

	public static void main(String[] args) throws IOException {
		
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		
	
		Date d1=new Date();
	    Date time=new Date(d1.getTime());
	    String ctime = time.toString();
	    String ctime1 = ctime.substring(11,13);
	   System.out.println(ctime1);
	   
		TakesScreenshot SS = driver;
        File source = SS.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\hp\\Desktop\\Screenshot Selenium\\"+ctime1+".png");
        FileHandler.copy(source, destination);
      

	}

}
