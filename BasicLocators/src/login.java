import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login 
{
	WebDriver driver;
	public login(WebDriver driver) 
	{
		this.driver = driver;
	}
	By email = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='pass']");
	By login = By.xpath("//button[@id='send2']");
	public void Click()
	{
		driver.findElement(email).sendKeys("keerthanar812@gmail.com");
		driver.findElement(pass).sendKeys("Keerthanar812");
		driver.findElement(login).click();
	}
}
