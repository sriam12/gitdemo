import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Before clicking on man-city button");
		System.out.println(driver.findElement(By.xpath("//input[@class='checkSpecialCharacters']")).isDisplayed());
		driver.findElement(By.xpath("//lable[@text='multi-city']")).click();
		System.out.println("After clicking on man-city button");
		System.out.println(driver.findElement(By.xpath("//input[@class='checkSpecialCharacters']")).isDisplayed());
       	
	}

}
