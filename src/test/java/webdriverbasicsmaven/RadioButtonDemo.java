package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Input Form')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Radio Buttons Demo')]") ).click();
		String displayedText, radioButtonText;
		String[] textParts;
		
		//for Male
        driver.findElement(By.xpath("//input[@id='inlineRadio1' and @value='Male']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]")).click();
         displayedText = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
         textParts = displayedText.split("'");
        
        radioButtonText = driver.findElement(By.xpath("//label[contains(text(), 'Male')]")).getText();
        if(textParts[1].equals(radioButtonText)) {
        	System.out.println(textParts[1]);
        	System.out.println(radioButtonText);
        	System.out.println("Text is correctly displayed for the radio button");
        }
        
        //for Female
        driver.findElement(By.xpath("//input[@id='inlineRadio2' and @value='Female']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]")).click();
        displayedText = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
        textParts = displayedText.split("'");
        
        radioButtonText = driver.findElement(By.xpath("//label[contains(text(), 'Female')]")).getText();
        if(textParts[1].equals(radioButtonText)) {
        	System.out.println(textParts[1]);
        	System.out.println(radioButtonText);
        	System.out.println("Text is correctly displayed for the radio button");
        }
       
       

	}

}
