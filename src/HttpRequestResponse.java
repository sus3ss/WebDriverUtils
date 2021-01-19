import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpRequestResponse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skadaiahnamath\\Documents\\BrowserExes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String Expectedtt="Github";
		driver.get("http://demo.guru99.com/test/social-icon.html");

	}

}
