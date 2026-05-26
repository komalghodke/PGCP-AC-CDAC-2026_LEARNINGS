import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement {

	// To find WebElement
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		//ACCESS THE URL
		driver.get("https://www.google.com/");
		
		//FIND WEB Element by using Web Locator, inspect
		
//		driver.findElement(By.name("q")).sendKeys("MSD");
//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("MSD");
		// driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.id("APjFqb")).submit();
	}
}
