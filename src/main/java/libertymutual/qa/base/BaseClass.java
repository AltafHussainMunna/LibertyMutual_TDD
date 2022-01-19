package libertymutual.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverMac");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.libertymutual.com/");
		
	}

}
