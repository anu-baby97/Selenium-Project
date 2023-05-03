package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//label[contains(text(),'Enter Message')]//following-sibling::input")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("20");
	}

}
