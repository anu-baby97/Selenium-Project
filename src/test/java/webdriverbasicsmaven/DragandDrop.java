package webdriverbasicsmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);

		// Open url

		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//  WebElement img1=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//  WebElement trash=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
//  
//  Actions action=new Actions(driver);
//  //action.dragAndDrop(img1, trash).build().perform();
//  
//  action.clickAndHold(img1).moveToElement(trash).release().build().perform();

		WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions action = new Actions(driver);
		// action.dragAndDrop(dragElement, dropElement).build().perform();
		action.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform();

	}

}