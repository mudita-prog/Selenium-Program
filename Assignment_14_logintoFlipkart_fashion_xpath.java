package Selenum_Assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_14_logintoFlipkart_fashion_xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/big-shopping-utsav-sale-store?fm=neo%2Fmerchandising&iid=M_b9d7bbf9-6ec1-4c23-9fc0-1d06f5dc6ee5_1_KUZ8W60OFFMO_MC.D7M05PTZUYRA&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Top%2BOffers_D7M05PTZUYRA&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=D7M05PTZUYRA");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//span[.='Women']"));
		e1.click();
		

	}

}
