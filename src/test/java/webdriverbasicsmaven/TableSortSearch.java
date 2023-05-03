package webdriverbasicsmaven;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TableSortSearch {

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);

		// Open url

		driver.get("https://selenium.obsqurazone.com/index.php");

		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Table Sort And Search')]")).click();
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"dtBasicExample_length\"]/label/select")));
		select.selectByValue("100");

		driver.findElement(By.xpath("//*[@id=\"dtBasicExample_filter\"]/label/input")).sendKeys("tokyo");

		String text = driver.findElement(By.xpath("//div[@class='dataTables_info']")).getText();
		System.out.println(text);
		int rowsize = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr")).size();
		int colsize = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//th")).size();

		for (int i = 0; i < colsize; i++) {
			System.out.print(driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//th")).get(i).getText()
					+ "                    ");

		}
		System.out.println();

		for (int j = 1; j <= rowsize; j++) {
			for (int k = 1; k <= colsize; k++) {

				System.out.print(driver
						.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[" + j + "]//td[" + k + "]"))
						.getText() + "   	 ");

			}

			System.out.println();

		}

	}

}
