package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUser {

	public WebDriver driver;

	//clicking on add user button and redirected on add user page
	By Adduser=By.className("page-title-action");

	//Now finding input which is used in addnew user
	By Username=By.xpath("//input[@id='user_login']");
	By Email=By.xpath("//input[@id='email']");
	By FirstName=By.xpath("//input[@id='first_name']");
	By LastName=By.xpath("//input[@id='last_name']");
	By Website=By.xpath("//input[@id='url']");
	By Password=By.xpath("//button[text()='Show password']");
	By SendPass=By.xpath("//input[@id='pass1-text']");
	By Addnewuser=By.id("createusersub");
	//By CheckUser=By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[3]/div[2]/p/text()");
	

	//defining the constructor
	public AddUser(WebDriver driver) 
	{
		//assigning driver to the driver variable in this class
		this.driver=driver;
	}
	//returning location of elements 
	public WebElement Sendpassword()
	{
		return driver.findElement(SendPass);
	}
	public WebElement Getpassword()
	{
		return driver.findElement(Password);
	}
	public WebElement GetAddnewuser()
	{
		return driver.findElement(Addnewuser);
	}
	public WebElement Getadduser()
	{
		return driver.findElement(Adduser);
	}
	public WebElement SendUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement SendEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement SendFirstname()
	{
		return driver.findElement(FirstName);
	}
	public WebElement SendLastname()
	{
		return driver.findElement(LastName);
	}
	public WebElement SendWebsite()
	{
		return driver.findElement(Website);
	}
	
//	public WebElement Useradded()
//	{
//		return driver.findElement(CheckUser);
//	}


}
