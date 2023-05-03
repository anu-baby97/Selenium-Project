package webdriverbasicsmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverBasics {
	public static void main(String[] args) throws Exception  {
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getPageSource());
		 
		
		driver.close();
	}
}
