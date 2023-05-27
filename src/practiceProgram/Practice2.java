package practiceProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\Falcon\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gb_g")).click();

		driver.switchTo().frame(driver.findElement(By.name("app")));
		driver.findElement(By.className("Rq5Gcb")).click();

		
		
		
		
	}

}
