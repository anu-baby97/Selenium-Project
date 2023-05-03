package webdriverbasicsmaven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTest {

	//open
	//login
	//close
	
	//open
	//search
	//close
	
	
	@BeforeMethod	//annotations
	public void openapp() {
		System.out.println("Opening App");
	}
	
	@Test(priority=2)	
	public void login() {
		System.out.println("Login App");
		
	}
	
	@Test(priority=3)	
	public void search() {
		System.out.println("Searching in App");
		
	}
	
	@Test(priority=4)	
	public void advsearch() {
		System.out.println("Advance Searching in App");
		
	}
	
	@AfterMethod
	public void close() {
		System.out.println("Closing App");
		
	}
	
	
}
