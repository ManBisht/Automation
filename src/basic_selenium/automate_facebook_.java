package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate_facebook_ {

	public static void main(String[] args) {
		//set the path of the executable web driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Falcon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver= new ChromeDriver(); // parent p = new child    this will open the chrome browser

driver.get("https://www.facebook.com/");  //opening facebook in chrome
WebElement email = driver.findElement(By.id("email"));  //we get this by inspecting the email text field in the facebook webpage
email.sendKeys("abcd@gmail.com");  //here abcd@gmail.com is just used as a reference email a valid email has to be used here

WebElement password = driver.findElement(By.name("pass")); // //we get this by inspecting the pasword text field in the facebook webpage
password.sendKeys("19951996"); //here 19951996 is just used as a reference password a valid password has to be used here

WebElement login = driver.findElement(By.name("login")); //finding login button on the facebook page
login.click();  //this is used to click on the login button

//if the login credentials are correct it will lead you to the facebook feed else it will give an error to enter valid email

	}

}
