package testNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Prioritization {

	WebDriver driver;

	@Test(priority = 1)
	@Parameters({"browser","url"})
	public void LaunchBrowser(String browserName, String url) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		else if (browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("No driver found");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.quit();
	}
}
