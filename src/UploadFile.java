import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skadaiahnamath\\Documents\\BrowserExes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement inputfl=driver.findElement(By.xpath("//input[@type='file']"));
		inputfl.sendKeys("C:\\Users\\skadaiahnamath\\Pictures\\IPL_DIYA.jpg");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("send")).click();
		
	}

}
