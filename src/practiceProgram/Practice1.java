package practiceProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
//https://www.google.com/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Falcon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("kuch bhi");
		text.sendKeys(Keys.ENTER);
		
		
	}

}
