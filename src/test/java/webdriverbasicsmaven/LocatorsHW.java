package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHW {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"step-0\"]/div[3]/button[3]")).click();
		
		String text = driver.findElement(By.linkText("QAlegend")).getText();
		if(text.equals("QAlegend")) {
			System.out.println("Pass");
		}
		
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id("surname")).sendKeys("Ms");
		driver.findElement(By.id("first_name")).sendKeys("Anu");
		driver.findElement(By.id("last_name")).sendKeys("Baby");
		driver.findElement(By.id("email")).sendKeys("jkachka@gmail.com");
		driver.findElement(By.id("username")).sendKeys("anubab");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("confirm_password")).sendKeys("123456");
		
		
	}

}
