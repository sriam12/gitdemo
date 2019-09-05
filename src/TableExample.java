import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		int sum=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21629/indu23-vs-paku23-1st-semi-final-acc-emerging-teams-asia-cup-2018");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int row= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		//parent to child by cssSelector without using any locator
		 int columnCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(columnCount);
		for(int i=0;i<(columnCount-2);i++){
			String value =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int val = Integer.parseInt(value);
			sum=sum+val;
		}
		   //Transverse  to sibling by x path without any locator
		String Text =table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int Te = Integer.parseInt(Text);
		int ActualSum =sum+Te;
		System.out.println(ActualSum);
		String OverallSum= table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int all= Integer.parseInt(OverallSum);
		if(ActualSum == all ){
			System.out.println("We are done with sum of runs");
		}
		else{
			System.out.println("We are not done");
		}
	}

}
