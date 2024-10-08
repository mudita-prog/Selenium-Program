package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_03_loginToFacebook_Amazon {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement e1 = driver.findElement(By.name("email"));
		e1.sendKeys("muditagupta1994@gmail.com");
		e1.findElement(By.name("pass")).sendKeys("ABC123@");
		e1.findElement(By.name("login")).click();
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgoogmantxtmob170-21%26ascsubtag%3D_k_Cj0KCQjw6oi4BhD1ARIsAL6pox3NZPc_gX_qfNmMQQC6xXzVXhiWiP92SrUK2m8is6CDSko97Xw0QfkaAo21EALw_wcB_k_%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement e2 = driver1.findElement(By.name("email"));
		e2.sendKeys("muditagupta1994@gmail.com");
		e2.findElement(By.id("continue")).click();
		e2.findElement(By.name("password")).sendKeys("ABC123@");
		e2.findElement(By.id("signInSubmit")).click();
		

	}

}
