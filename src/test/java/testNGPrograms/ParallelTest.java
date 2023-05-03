package testNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;

	@Test
	public void EdgeTest() {
		// Initializing the edge driver 
		driver = new EdgeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		driver.close();
	}

	@Test
	public void ChromeTest() {
		// Initialize the chrome driver
		driver = new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		driver.close();
	}
}