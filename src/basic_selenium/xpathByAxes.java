package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //open chrome
		driver.manage().window().maximize(); //maximizing chrome browser
		//here we are trying to get the price of a particular item however there are multiple item's with the same price so we are using xpath
		driver.get("https://www.flipkart.com/search?q=iphone+14&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_4_6_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_6_na_na_na&as-pos=4&as-type=RECENT&suggestionId=iphone+14&requestId=ccd1b9df-3f2f-4468-b2dd-7dd0556edd4a&as-searchtext=iphone");
WebElement price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='col col-7-12']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹71,999']"));
		System.out.println(price.getText()); //here we are printing price of the item

	}

}
