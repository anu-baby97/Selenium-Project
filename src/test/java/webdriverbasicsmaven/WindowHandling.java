package webdriverbasicsmaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']")).click();

		Set<String> windowid = driver.getWindowHandles();
		List<String> windowsids = new ArrayList<String>(windowid);

		String parentid = windowsids.get(0);
		String childid = windowsids.get(1);

		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@class='x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt']//div//span//span[text()='Log in']"))
				.click();

		Thread.sleep(3000);
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());

	}

}
