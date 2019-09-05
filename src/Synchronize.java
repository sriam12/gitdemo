import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/");
		driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//[input@class='form-control as-datepicker']")).sendKeys(Keys.ENTER);

	}

}
