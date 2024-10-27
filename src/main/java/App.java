import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class App{
	public static void main (String [] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.github.com/shayan729");
	}
}