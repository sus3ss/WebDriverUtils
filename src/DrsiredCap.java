import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DrsiredCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        DesiredCapabilities cap=DesiredCapabilities.firefox();
        cap.setCapability(CapabilityType.BROWSER_NAME, "FE");
        cap.setCapability(FirefoxDriver.PROFILE,"ss");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\skadaiahnamath\\Documents\\BrowserExes\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
	}

}
