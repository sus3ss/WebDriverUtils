import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closewin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skadaiahnamath\\Documents\\BrowserExes\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.navigate().to("http://www.popuptest.com/popuptest2.html");
		//driver.close();
		driver.quit();
	}

}
