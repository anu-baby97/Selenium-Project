package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupRadioButtonDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Input Form')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Radio Buttons Demo')]") ).click();
		String displayedText, genderText,genderPart,agePart,ageText;
		String[] textParts;
		
		//for Male
        driver.findElement(By.xpath("//input[@id='inlineRadio11' and @value='Male']")).click(); //selecting radio button 1
        driver.findElement(By.xpath("//input[@id='inlineRadio23' and @value='19 to 44']")).click();//selecting radio button 2
        driver.findElement(By.xpath("//button[text()='Get Results']")).click(); //Click Get Results Button
        
        displayedText = driver.findElement(By.xpath("//div[@id='message-two']")).getText();
        textParts = displayedText.split("\n");
        genderPart=textParts[0].substring(9);
        
        //validating gender displayed
        genderText = driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
        if(genderPart.equals(genderText)) {
        	System.out.println(genderText);
        	System.out.println(genderPart);
        	System.out.println("Gender is correctly displayed for the radio button");
        }
        else {
        	System.out.println("Gender not correctly displayed for the radio button");
		}
        
        //validating age group displayed
        agePart=textParts[1].substring(11);
        ageText = driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
        System.out.println(ageText);
    	System.out.println(agePart);
        if(ageText.contains(agePart)) {
        	System.out.println("Age group is correctly displayed for the radio button");
        }
        else {
        	System.out.println("Age group not correctly displayed for the radio button");
		}
	}

}
