package webdriverbasicsmaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'<<')]")).click();
		
		Select select = new Select(driver.findElement(By.name("duallistbox_demo1[]_helper1")));
		select.selectByValue("option1");
		select.selectByValue("option3");
		select.selectByValue("option5");
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit data')]")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		if(text.contains("option1") && text.contains("option3") && text.contains("option5") ) {
			System.out.println("All options are correct");
		}
		
		alert.accept();
	}

}
