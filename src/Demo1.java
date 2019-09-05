import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void main(String [] args){
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("sriramreddy.kallam@gmil.com");
		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("sriramreddy.kallam@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("dollar hai");
       // driver.findElement(By.linkText("Forgotten account?")).click();
        driver.findElement(By.id("u_0_8")).click();
	}
	

}
