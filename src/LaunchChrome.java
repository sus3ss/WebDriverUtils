import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skadaiahnamath\\Documents\\BrowserExes\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    String currentUrl=driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    driver.close();
	    System.out.println("Sushanth's changes");
}

}
