import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@id='searchform']/div[1]/div/div/div/div/div[2]/a")).click();
     */
       //snapdeal  was successful
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//div[@id='sdHeader']/div[4]/div[2]/div/div[2]/input")).sendKeys("causal shoe for men");
	}

}
