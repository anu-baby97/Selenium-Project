package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Input Form')]") ).click();
		driver.findElement(By.xpath("//a[text()='Ajax Form Submit']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Subject')]//following-sibling::input")).sendKeys("This is the subject");
		driver.findElement(By.xpath("//label[contains(text(),'Description')]//following-sibling::textarea")).sendKeys("This is the description");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		
		if(text.equals("Form has been submitted successfully!")){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	}

}
