package webdriverbasicsmaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
////strong[contains(text(),'First name:  ')]//parent::td//following-sibling::td/input
public class AutomationTaskForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();

		driver.findElement(By.name("firstname")).sendKeys("Anu");
		driver.findElement(By.name("lastname")).sendKeys("Baby");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Female' and @name='sex']")).click();
		driver.findElement(By.xpath("//input[@value='1' and @name='exp']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Date:  ')]//parent::td//following-sibling::td/input")).sendKeys("01/01/2023");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\nithi\\Downloads\\download.jpg");
		
		int size=driver.findElements(By.xpath("//input[@name='tool']")).size();
		
		for(int i=0;i<size;i++) {
			driver.findElements(By.xpath("//input[@name='tool']")).get(i).click();
		}
	
		Select select1 = new Select(driver.findElement(By.name("continents")));
		select1.selectByVisibleText("Africa");
		
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[10]/td[2]/select")));
		select2.selectByVisibleText("Browser Commands");
		select2.selectByVisibleText("Switch Commands");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Button']")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		
		
	}

}
