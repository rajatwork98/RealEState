package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserProfile {
	public WebDriver driver;
	
	//finding elements
	By UserProfile=By.xpath("//a[text()='Your Profile']");
	By ChangeColor=By.id("admin_color_blue");
	By FirstName=By.id("billing_first_name");
	By LastName=By.id("billing_last_name");
	By UpdateProfile=By.id("submit");
	By ProfileUpdated=By.xpath("//strong[text()='Profile updated.']");
	
	//defining the constructor
	public UserProfile(WebDriver driver) 
	{
		//assigning driver to the driver variable in this class
		this.driver=driver;
	}
	//returning location of elements 
	public WebElement Checkprofile()
	{
		return driver.findElement(ProfileUpdated);
	}
	public WebElement GetUpdateprofile()
	{
		return driver.findElement(UpdateProfile);
	}
	public WebElement Getfirstname()
	{
		return driver.findElement(FirstName);
	}
	public WebElement Getlastname()
	{
		return driver.findElement(LastName);
	}
	public WebElement Getuserprofile()
	{
		return driver.findElement(UserProfile);
	}
	public WebElement Getcolor()
	{
		return driver.findElement(ChangeColor);
	}

}
