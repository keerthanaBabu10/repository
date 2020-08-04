import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcome
{
	WebDriver driver;
	public welcome(WebDriver driver)
	{
		this.driver = driver;
	}
	By myacct = By.xpath("//a[text()='My Account']");
	public void Click()
	{
		driver.findElement(myacct).click();
	}
}
