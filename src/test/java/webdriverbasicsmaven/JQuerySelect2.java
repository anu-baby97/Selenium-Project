package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQuerySelect2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();

		// Selecting Multiple values

		driver.findElement(By.xpath(
				"//div[contains(text(), 'Select Multiple Values')]//following-sibling::div/form/div/span/span/span"))
				.click();

		int n = 1;

		for (int i = 0; i < n; i++) {

			driver.findElement(By.xpath(
					"//div[contains(text(), 'Select Multiple Values')]//following-sibling::div/form/div/span/span/span/span/textarea"))
					.click();
			driver.findElement(By.xpath(
					"//div[contains(text(), 'Select Multiple Values')]//following-sibling::div/form/div/span/span/span/span/textarea"))
					.sendKeys("New");

			int size = driver.findElements(By.xpath("//ul[@role='listbox']/li")).size();
			n = size;
			driver.findElements(By.xpath("//ul[@role='listbox']/li")).get(i).click();

			Thread.sleep(2000);

			// Deleting selected values
			driver.findElement(By.xpath("//button/span[contains(text(),'×')]")).click();

		}

		// Drop-down with Category related options
		driver.findElement(By.xpath(
				"//div[contains(text(), 'Drop-down with Category related options')]//following-sibling::div/form/div/span/span/span/span[1]"))
				.click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Mar");
		driver.findElements(By.xpath("//ul/li[@role='option']")).get(0).click();

		// using select class
		Select select = new Select(driver.findElement(By.xpath(
				"//div[contains(text(), 'Drop-down with Category related options')]//following-sibling::div/form/div/select")));
		select.selectByIndex(3);

	}

}
