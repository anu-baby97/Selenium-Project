package webdriverbasicsmaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	//open
	//login
	//search
	//adv search
	//close
	
	@BeforeClass	//annotations
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
	
	@AfterClass
	public void close() {
		System.out.println("Closing App");
		
	}
}
