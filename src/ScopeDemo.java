import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		WebElement coloumdriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());
		 for(int i=1;i<coloumdriver.findElements(By.tagName("a")).size();i++)
		 {
			 String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(newtab);
			 Thread.sleep(5000L);
		 }
		 
		Set<String>abc= driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		 
		 

	}

}
