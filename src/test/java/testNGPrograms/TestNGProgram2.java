package testNGPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGProgram2 {
 
 WebDriver driver;
 @BeforeClass
 //@Test(priority=1) //annotations
 public void openapp() {
  System.out.println("Opening app");
  
  driver=new ChromeDriver();
  driver.get("");
  driver.manage().window().maximize();
  
 }
 
 @Test(priority=2)
 public void Login() {
  System.out.println("Login an application");
  driver.findElement(By.xpath("")).sendKeys("");
  driver.findElement(By.xpath(""));
  driver.findElement(By.xpath("")).click();
  
 }
 @AfterClass
 //@Test(priority=3)
 public void closeapp() {
  System.out.println("Logout");
  
  driver.quit();
 }
 
 //Test
 //@Before class
 //@After class
 
 //@Before Method
 //@After Method
 
 //@Before Suite
 //@After Suite
 
 //@After test
 //@before test
 

}