package webdriverbasicsmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.id("single-input-field")).sendKeys("Selenium");
		driver.findElement(By.id("button-one")).click();
		
		
		//driver.findElements(By.tagName("input")).get(1).sendKeys("10");
		//Thread.sleep(5000);
		
		WebElement value_a = driver.findElement(By.id("value-a"));
		value_a.sendKeys("10");
		driver.findElement(By.id("value-b")).sendKeys("20");
		driver.findElement(By.id("button-two")).click();
		driver.findElement(By.linkText("Form Submit")).click();
		//Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Form ")).click();//clicks on first form
//		Thread.sleep(3000);
//		List<WebElement> links = driver.findElements(By.partialLinkText("Form "));
//		links.get(2).click();
		driver.findElement(By.cssSelector("input#validationCustom01")).sendKeys("Anu");
		driver.findElement(By.cssSelector("input.form-control[placeholder='Last name']")).sendKeys("Baby");
	}

}
