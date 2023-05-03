package testNGPrograms;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class TestNGProgram1 {
	public Logger logger;
	logger=LogManager.getLogger();
	WebDriver driver;
	
	@BeforeMethod(groups = {"Regression","Sanity"})
	public void Login() {
		
		System.out.println("Opening website..");
		driver = new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"step-0\"]/div[3]/button[3]")).click();
	}
	
	
	@Test(priority = 1,groups ={"Sanity","Regression"})
	public void AddUser() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//a[text()=' Add']")).click();
		driver.findElement(By.id("surname")).sendKeys("Ms");
		driver.findElement(By.id("first_name")).sendKeys("Anu");
		driver.findElement(By.id("last_name")).sendKeys("Baby");
		driver.findElement(By.id("email")).sendKeys("jkachka@gmail.com");
		driver.findElement(By.id("username")).sendKeys("anubab");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("confirm_password")).sendKeys("123456");	
	}
	
	@Test(priority = 2, groups = "Sanity")
	public void AddCustomerContact() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()=' Customers']")).click();
		driver.findElement(By.xpath("//button[text()=' Add']")).click();
		driver.findElement(By.id("name")).sendKeys("ANu");
		driver.findElement(By.id("mobile")).sendKeys("5352576224");
		WebElement save= driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.invisibilityOf(save));
	}
	
	@Test(priority = 3,groups = "Regression", enabled = false)
	public void ViewListProducts() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//a[text()='Add Product']")).click();
		driver.findElement(By.id("name")).sendKeys("Mango");
		

	}
	
	@Test(enabled = false)
	
	public void AssertCheck() {
		//Using Hard Assert & Soft Assert
		String logo_name=driver.findElement(By.xpath("//span[@class='logo-lg']")).getText();
		//Assert.assertEquals("QAlegend  ",logo_name ,"Strings are not equal");
		
		SoftAssert sAssert = new SoftAssert();
		//sAssert.assertEquals("QAlegend  ",logo_name ,"Strings are not equal");
		//sAssert.assertAll();
		
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//a[text()='Add Product']")).click();
		driver.findElement(By.id("name")).sendKeys("Mango");
	}
		
	@AfterMethod(groups = {"Regression","Sanity"})
	public void close() {
		driver.close();
	}

	
}
