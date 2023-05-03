package webdriverbasicsmaven;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQueryListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-dual-list.php");
		driver.manage().window().maximize();

		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"list\"]/div[1]/select")));
		List<WebElement> optionsList1 = select.getOptions();

		driver.findElement(By.xpath("//button[text()='Remove All']")).click();// Remove All
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"list\"]/div[3]/select")));
		List<WebElement> optionsList2 = select2.getOptions();

		driver.findElement(By.xpath("//button[text()='selected']")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.dismiss();

		// Validating Remove all using select list and alert text
		if (optionsList2.isEmpty() && text.equals("[]")) {
			System.out.println("All options removed");
		} else {
			System.out.println("All options are not removed");
		}

		// Add button

		select.selectByVisibleText("Java");
		select.selectByVisibleText("Flutter");

		driver.findElement(By.xpath("//button[text()='Add']")).click();

		select2 = new Select(driver.findElement(By.xpath("//*[@id=\"list\"]/div[3]/select")));
		optionsList2 = select2.getOptions();

		driver.findElement(By.xpath("//button[text()='selected']")).click();
		String text1 = alert.getText();

		// Validating Add using alert text
		if (text1.contains("Java") && text1.contains("Flutter")) {

			System.out.println("Options correctly selected");
		}

		else {
			System.out.println("Not in text");
		}
		alert.dismiss();

		// Validating Add using select list
		for (int i = 0; i < optionsList2.size(); i++) {
			if ((optionsList2.get(0).getText()).equals("Java") && (optionsList2.get(1).getText()).equals("Flutter")) {

				System.out.println("Options correctly selected");
				break;
			}

			else {
				System.out.println("Not in list");
			}
		}

		// Add all button

		driver.findElement(By.xpath("//button[text()='Add All']")).click();
		select = new Select(driver.findElement(By.xpath("//*[@id=\"list\"]/div[1]/select")));
		optionsList1 = select.getOptions();

		// validating add all using select list
		if (optionsList1.isEmpty()) {
			System.out.println("All options are added");
		} else {
			System.out.println("Not all options are added");
		}

		driver.findElement(By.xpath("//button[text()='selected']")).click();
		String text2 = alert.getText();
		alert.dismiss();

		select2 = new Select(driver.findElement(By.xpath("//*[@id=\"list\"]/div[3]/select")));
		optionsList2 = select2.getOptions();

		// validating add all using alert text
		for (WebElement i : optionsList2) {
			if (text2.contains(i.getText())) {
				continue;
			} else {
				System.out.println("Option not present in text");
			}
		}
		System.out.println("All options are present in the text");

		// Remove button
		select2.selectByValue("Python");
		select2.selectByValue("Swift");

		driver.findElement(By.xpath("//button[text()='Remove']")).click();

		select = new Select(driver.findElement(By.xpath("//*[@id=\"list\"]/div[1]/select")));
		optionsList1 = select.getOptions();

		// Validating Remove using select list
		for (int i = 0; i < optionsList1.size(); i++) {
			if ((optionsList1.get(0).getText()).equals("Python") && (optionsList1.get(1).getText()).equals("Swift")) {

				System.out.println("Options correctly removed");
				break;
			}

			else {
				System.out.println("Not in list");
			}
		}
		driver.findElement(By.xpath("//button[text()='selected']")).click();
		String text3 = alert.getText();
		alert.dismiss();

		// validating remove using alert text
		for (WebElement j : optionsList1) {
			if (text3.contains(j.getText())) {
				System.out.println("Option not removed correctly");
			} else {
				continue;
			}
		}
		System.out.println("Options are correctly removed");

	}

}
