import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoT {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://magento.com");
		welcome w = new welcome(driver);
		w.Click();
		login l = new login(driver);
		l.Click();
		home h = new home(driver);
		h.click();
		driver.quit();
		}

}
