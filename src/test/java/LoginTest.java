import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver; 
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\Code Practice\\Selenium\\WebDriverMaven\\src\\test\\resources\\executables\\chromedriver.exe");
<<<<<<< HEAD

=======
>>>>>>> parent of f13bc70... modify setUp()
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void doLogin() {
		driver.get("https://www.google.com/");
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
