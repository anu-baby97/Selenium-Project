package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.xpath("//div[contains(text(), 'Drop-down with Category related options')]//following-sibling::div/form/div/select")));
		select.selectByIndex(3);
	}

}
