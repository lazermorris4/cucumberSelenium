package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	    public static WebDriver driver = null;
	    public static WebElement userId;
	    public static WebElement password;
	    public String LoginID ="Lazermorris@gmail.com";
	    public String pwd ="Reenu285";
	    //public static String path ="C:\\Users\\Lazer\\workspace\\home\\Resources\\chromedriver.exe";
	    public static String path1 = "Resources/chromedriver.exe";
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver",path1);
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	@Given("^User is on login page$")
	public void User_is_on_login_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.navigate().to("https://www.reliant.com/public/altLogon.htm");
		Thread.sleep(3000);
	    //throw new PendingException();
	}

	@When("^User enters userId and password and clicks on login$")
	public void User_enters_userId_and_password_and_clicks_on_login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('altLoginUsername').setAttribute('value','"+LoginID+"')");
		js.executeScript("document.getElementById('altLoginPassword').setAttribute('value','"+pwd+"')");		/*userId=driver.findElement(By.id("altLoginUsername"));
		userId.sendKeys("lazermorris@gmail.com");
		password=driver.findElement(By.id("altLoginPassword"));
		password.sendKeys("Reenu285");*/
		driver.findElement(By.cssSelector("button[class='controlText-A myaccount-btn b_submit_login']")).click();
	    //throw new PendingException();
	}

	@Then("^Login success$")
	public void Login_success() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Login suuccessfull");
		driver.quit();
	    //throw new PendingException();
	}

}
