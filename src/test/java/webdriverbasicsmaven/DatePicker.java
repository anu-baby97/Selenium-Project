package webdriverbasicsmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/date-picker.php");
		driver.manage().window().maximize();
		
		
		String year = "2025";
		String month = "Jul";
		String date ="25";
	
		driver.findElement(By.xpath("//input[@id='single-input-field']")).click();
		  driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-title']//parent::tr//following-sibling::tr//th[@class='datepicker-switch']")).click();
		  
		  while(true) {
		   String yr=driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-title']//parent::tr//following-sibling::tr//th[@class='datepicker-switch']")).getText();
		   
		   if(yr.equals(year)) {
		    break;
		   }
		   
		   else if(Integer.parseInt(year)>Integer.parseInt(yr)) {
		    driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-title']//parent::tr//following-sibling::tr//th[@class='next']")).click();
		    if(yr.equals(year)) {
		     break;
		    }
		   
		   }
		   
		   else {
		    driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-title']//parent::tr//following-sibling::tr//th[@class='prev']")).click();
		    if(yr.equals(year)) {
		     break;
		    }
		   }
		   
		   
		   
		  
		  }
		  
		  int mosize=driver.findElements(By.xpath("//div[@class='datepicker-months']//td//span")).size();
		  
		  for(int i=0;i<mosize;i++) {
		   String mo=driver.findElements(By.xpath("//div[@class='datepicker-months']//td//span")).get(i).getText();
		   
		   if(month.equals(mo)) {
		    driver.findElements(By.xpath("//div[@class='datepicker-months']//td//span")).get(i).click();
		    break;
		   }
		   
		   
		  }
		  
		  int size=driver.findElements(By.xpath("//div[@class='datepicker-days']//tbody//tr//td")).size();
		  for(int i=0;i<size;i++) {
		   String d=driver.findElements(By.xpath("//div[@class='datepicker-days']//tbody//tr//td")).get(i).getText();
		   
		   if(date.equals(d)) {
		    driver.findElements(By.xpath("//div[@class='datepicker-days']//tbody//tr//td")).get(i).click();
		    break;
		   }
		   
		   
		  }	
	}
}
