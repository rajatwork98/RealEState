package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage{
	
	public WebDriver driver;
	
	//for screen option 
	By users=By.xpath("//div[text()='Users']");
	By ScreenOption=By.id("show-settings-link");
	By Usernumber=By.xpath("//*[@id='users_per_page']");
	By Apply=By.id("screen-options-apply");
	
	
	//for Search functionality
	By Searchinput=By.xpath("//input[@id='user-search-input']");
	By SearchButton=By.xpath("//input[@id='search-submit']");
	By SearchCheck=By.xpath("//a[text()='rajatwork98@gmail.com']");
	By DeleteUser=By.xpath("//a[text()='Delete']");
	
	//For invalid id
	By Search1=By.xpath("//input[@id='user-search-input']");
	By SearchButton1=By.xpath("//input[@id='search-submit']");
	By Usernotfound=By.className("colspanchange");
	
	
	//defining the constructor
	public UserPage(WebDriver driver) 
	{
		//assigning driver to the driver variable in this class
		this.driver=driver;
	}
	//returning location of elements 
	public WebElement Nouserfound()
	{
		return driver.findElement(Usernotfound);
	}
	public WebElement Getsearch()
	{
		return driver.findElement(Search1);
	}
	public WebElement Getsearchbutton()
	{
		return driver.findElement(SearchButton1);
	}
	public WebElement Getdelete()
	{
		return driver.findElement(DeleteUser);
	}
	public WebElement CheckEmail()
	{
		return driver.findElement(SearchCheck);
	}
	public WebElement Sendsearch()
	{
		return driver.findElement(Searchinput);
	}
	public WebElement getSearch()
	{
		return driver.findElement(SearchButton);
	}
	public WebElement getUsers()
	{
		return driver.findElement(users);
	}
	public WebElement Getscreenoption()
	{
		return driver.findElement(ScreenOption);
	}
	public WebElement GetUsernumber()
	{
		return driver.findElement(Usernumber);
	}
	
	public WebElement Getapply()
	{
		return driver.findElement(Apply);
	}
}
