package Selenum_Assignments_AB45;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_43_RunBrowserInHeadlessMode {

	public static void main(String[] args) {
		ChromeOptions a1=new ChromeOptions();
		a1.addArguments("--headless");
		
       ChromeDriver driver=new ChromeDriver(a1);
       driver.get("http://www.google.com");
       driver.manage().window().maximize();


	}

}
