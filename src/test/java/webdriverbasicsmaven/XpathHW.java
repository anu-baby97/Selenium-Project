package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Input Form')]") ).click();
		driver.findElement(By.xpath("//a[text()='Form Submit']")).click();
		
		driver.findElement(By.xpath("//label[text()='First name']//following-sibling::input")).sendKeys("Anu");
		driver.findElement(By.xpath("//label[text()='Last name']//following-sibling::input")).sendKeys("Baby");
		//driver.findElement(By.xpath("//label[@for='validationCustom02']//following-sibling::input")).sendKeys("Baby");
		
		driver.findElement(By.xpath("//label[text()='Username']//following-sibling::div//input")).sendKeys("ababy");
		driver.findElement(By.xpath("//label[text()='City']//following-sibling::input")).sendKeys("Calicut");
		driver.findElement(By.xpath("//label[text()='State']//following-sibling::input")).sendKeys("Kerala");
		driver.findElement(By.xpath("//label[text()='Zip']//following-sibling::input")).sendKeys("673010");
		
		driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		driver.findElement(By.xpath("//button[text()='Submit form']")).click();
		
		String text = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		
		if(text.equals("Form has been submitted successfully!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");	
		}
		
	}

}
