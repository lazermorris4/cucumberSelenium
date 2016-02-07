package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private static WebDriver driver = null;
    public static WebElement userId;
    public static WebElement password;
    private static String path ="C:\\Users\\Lazer\\workspace\\home\\Resources\\chromedriver.exe";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.reliant.com/public/altLogon.htm");
		userId=driver.findElement(By.id("altLoginUsername"));
		userId.sendKeys("lazermorris@gmail.com");
		password=driver.findElement(By.id("altLoginPassword"));
		password.sendKeys("Reenu285");
		driver.findElement(By.cssSelector("button[class='controlText-A myaccount-btn b_submit_login']")).click();
		System.out.println("Login suuccessfull");
	}

}
