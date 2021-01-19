import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skadaiahnamath\\Documents\\BrowserExes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Expectedtt="Github";
		driver.get("http://demo.guru99.com/test/social-icon.html");
		WebElement tooltip=driver.findElement(By.xpath("//*[@class='soc-ico show-round']/a[4]"));
		Actions act=new Actions(driver);
		act.moveToElement(tooltip).perform();;
		String Actualtt=tooltip.getAttribute("title");
		Assert.assertEquals(Actualtt, Expectedtt);
		System.out.println(Actualtt);
		if(Expectedtt.equals(Actualtt)) {
			System.out.println("Testpass");
			
		}
		else 
			System.out.println("Fail");
	
	}

}
