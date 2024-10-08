package Selenum_Assignments_AB45;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_08_GetWindowHandle {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.facebook.in");
	System.out.println(driver.getWindowHandle());	

	}

}
