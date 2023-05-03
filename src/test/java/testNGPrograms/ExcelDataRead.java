package testNGPrograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilpackage.XLUtility;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		String file = System.getProperty("user.dir")+"\\src\\test\\resources\\exceldata.xlsx";
		
		XLUtility XL = new XLUtility(file);
		
		int rows = XL.getRowCount("Sheet1");
		//int col = XL.getCellCount("Sheet1", rows);
		
		for(int i=1;i<=rows;i++) {
			
			
				String msg = XL.getCellData("Sheet1", i, 0);
				String valueA = XL.getCellData("Sheet1", i, 1);
				String valueB = XL.getCellData("Sheet1", i, 2);
				
				driver.findElement(By.xpath("//input[@placeholder='Message']")).sendKeys(msg);
				driver.findElement(By.id("button-one")).click();
				driver.findElement(By.id("value-a")).sendKeys(valueA);
				driver.findElement(By.id("value-b")).sendKeys(valueB);
				driver.findElement(By.id("button-two")).click();
				
				driver.findElement(By.xpath("//input[@placeholder='Message']")).clear();
				driver.findElement(By.id("value-a")).clear();
				driver.findElement(By.id("value-b")).clear();
		}
	}

}
