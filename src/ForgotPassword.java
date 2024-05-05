import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vidisha\\Downloads\\chromedriver-win64.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.findElement(By.cssSelector(".email")).sendKeys("vidisha@gmail.com");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.print(driver.findElement(By.xpath("//body/h1")).getText());
		System.out.println("develop branch");
		driver.close();

	}

}
