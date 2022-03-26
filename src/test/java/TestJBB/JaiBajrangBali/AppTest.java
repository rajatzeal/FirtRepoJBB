package TestJBB.JaiBajrangBali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class AppTest 
{
   
	WebDriver wd ;

	
	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method 2");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAJAT\\Downloads\\geckodriver.exe");
		wd = new FirefoxDriver();
	}
	
	@Test
	//@Parameters({"url"})
	public void shouldAnswerWithTrue()
    {
        System.out.println("Chal Gaya JBB 2");
		wd.get("https://www.google.com");
    }
	
	@Test
	public void anotherM() {
	System.out.println("Checking another method");	
	}
	
	
	@AfterMethod
	public void aMethod() {
		System.out.println("After Method 2");
		wd.close();
	}
}
