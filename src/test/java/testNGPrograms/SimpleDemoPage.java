package testNGPrograms;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import utilpackage.XLUtility;



public class SimpleDemoPage{
 
 

 @Test(priority=3,dataProvider = "testData", dataProviderClass=XLUtility.class)
 public void getSetofUsers(String Message,String ValueA,String ValueB) throws InterruptedException {
  
  
  WebDriver driver=new ChromeDriver();
  
  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
  driver.manage().window().maximize();
  driver.findElement(By.id("single-input-field")).sendKeys(Message);
  driver.findElement(By.id("button-one")).click();
  
  driver.findElement(By.id("value-a")).sendKeys(ValueA);
  driver.findElement(By.id("value-b")).sendKeys(ValueB);
  driver.findElement(By.id("button-two")).click();
  
  driver.findElement(By.id("single-input-field")).clear();
  driver.findElement(By.id("value-a")).clear();
  driver.findElement(By.id("value-b")).clear();
  
  driver.quit();
 }
 
 
}
