import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public void run(){
		System.out.println("after the git operation in gitdemo");
	}
    public void type(){
    	System.out.println("Asian guy modification in branch develop");
    }	
    public void American(){
    	System.out.println("American guy pulled and made modifications");
    }
	public static void main(String [] args){
	 Demo a = new Demo();
	 a.run();
	 a.type();
	 a.American();	
	}
	}


