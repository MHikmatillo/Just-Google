import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

/**
 * Created by Maruf on 9/15/2014.
 */
public class SimpleTestRun {
    @Test
    public void testRun() {
    	System.setProperty("webdriver.chrome.driver","/Users/khikmatillo"
				+ "/Documents/Libraries/Drivers/chromedriver");
    	WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Wooden Spoon");
        driver.findElement(By.name("q")).submit();
        assertEquals(true, true);
       System.out.println("JAVA IS FUN");
        
    }
}
