package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Input Form')]") ).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		
		WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"gridCheck\"]"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		
		driver.findElement(By.xpath("//input[@id='button-two']")).click();
		
		boolean checked = true;
		int size=driver.findElements(By.xpath("//input[@class='check-box-list']")).size();
		for(int i=0;i<size;i++) {
			checked=driver.findElements(By.xpath("//input[@class='check-box-list']")).get(i).isSelected(); //conditional method: isSelected(), isDisplayed(), isEnabled()
			
			if (checked==false) {
				System.out.println("Checkbox " + (i+1)+ " not selected");
			}
			else {
				System.out.println("Checkbox " + (i+1)+ " selected");
			}
		}
		
		driver.findElement(By.xpath("//input[@id='button-two']")).click();
		
		for(int i=0;i<size;i++) {
			checked=driver.findElements(By.xpath("//input[@class='check-box-list']")).get(i).isSelected();
			
			if (checked==false) {
				System.out.println("Checkbox " + (i+1)+ " unchecked");
			}
			else {
				System.out.println("Checkbox " + (i+1)+ " checked");
			}
		}

	}

}
