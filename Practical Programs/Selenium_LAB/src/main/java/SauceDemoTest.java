import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceDemoTest {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		//name[@id='user-name']
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("error_user");

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
	}
}
