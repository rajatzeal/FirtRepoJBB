package TestJBB.JaiBajrangBali;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AppTest2 
{
   
	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method");
		Assert.assertEquals("hj", "hj");
	}
	
	@Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Chal Gaya JBB");
    }
	
	@AfterMethod
	public void aMethod() {
		System.out.println("After Method");
	}
}
