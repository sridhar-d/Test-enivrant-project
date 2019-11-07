package sri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testdoc01 
{
	private static final String Element = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch240\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.get("http://54.72.6.187/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("24/08/1994");
		driver.findElement(By.xpath("//button[@class='btn rounded-pill border-0 text-uppercase valider-btn mb-3 mb-md-0']")).click();
		jse.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("//a[contains(text(),'en savoir plus')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions actions=new Actions(driver);	
	    WebElement element=driver.findElement(By.xpath("//body"));
        Actions scrollDown = actions.moveToElement(element);
        scrollDown.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	jse.executeScript("window.scrollTo,(0, document.body.ScrollHeight)");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Actions scrollUp=actions.moveToElement(element);
	scrollUp.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	jse.executeScript("window.scrollTo,(0, -document.body.ScrollHeight)");
	
	driver.findElement(By.xpath("//ul//li[@class='menu-list']//a[contains(text(),'produits')]")).click();
	//jse.executeScript("window.scrollBy(0,1000)");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='navbar-brand m-0']//img[@class='logo']")).click();
	}

}
