import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustamizedCss {

	    public static void main(String [] args){
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abcdef");
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hello");
			driver.findElement(By.cssSelector("input[class='button r4 wide primary']")).click();
			
			
	    }
}
