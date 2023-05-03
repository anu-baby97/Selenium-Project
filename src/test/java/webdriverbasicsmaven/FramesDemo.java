package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]")));
		driver.findElement(By.name("mytext1")).sendKeys("Anu");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]")));
		driver.findElement(By.name("mytext2")).sendKeys("Automation");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		driver.findElement(By.xpath("//input[@class=\"Hvn9fb zHQkBf\"]")).sendKeys("Something");
	}

}
