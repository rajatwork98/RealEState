//install tidy gherkin plugin in chrome

package stepDefinations;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Activity;
import pageObjects.AddNewProperties;
import pageObjects.AddUser;
import pageObjects.AddressDetails;
import pageObjects.Comments;
import pageObjects.FeaturesPage;
import pageObjects.Media;
import pageObjects.NameDetails;
import pageObjects.ProfileSection;
import pageObjects.Properties;
import pageObjects.RegionsPage;
import pageObjects.SigninPage;
import pageObjects.SignupPage;
import pageObjects.UserPage;
import pageObjects.UserProfile;

public class StepDefinition  {

	public WebDriver driver;

	//Invoking the chrome browser

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome()  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\New folder\\RealEstateCopy\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
	}

	//Navigating to Url
	@And("^Navigate to  \"([^\"]*)\" site$")
	public void navigate_to_something_site(String url) throws Throwable {
		//Get url
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
	}
	@And("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		//create a sign page object
		SigninPage s = new SigninPage(driver);
		//Click on Login and Register in the Homepage
		s.getSigninbtn().click();
		//Scroll down using java script executor
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	@And("^Click on Login in login page$")
	public void click_on_login_in_login_page() throws Throwable {
		//Sign in page object
		SigninPage l= new SigninPage(driver);
		//Click on the Login button in the Login and Register Page
		l.getLoginbtn().click();
	}
	@When("^I entered valid \"([^\"]*)\" and valid \"([^\"]*)\" logs in$")
	public void i_entered_valid_something_and_valid_something_logs_in(String username, String password) throws Throwable {
		//sign in page object
		SigninPage lp=new SigninPage(driver);
		//Enter The User name and Password
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);

	}  
	@And("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
		//Sign-in page object
		SigninPage lp = new SigninPage(driver);
		//click on the Login button
		lp.getSignin().click();
	}

	//Home Page Section-------------------------------------------------------------------------------------------------------------------
	@Then("^click on invest in overseas$")
	public void click_on_invest_in_overseas() throws Throwable {
		WebElement invest = driver.findElement(By.xpath("//a[text()='Invest in Overseas']"));
		invest.click();
		driver.navigate().back();
	}

	@And("^click on blog$")
	public void click_on_blog() throws Throwable {
		WebElement blog = driver.findElement(By.xpath("//a[text()='Blog']"));
		blog.click();
		driver.navigate().back();
	}

	@When("^click on Realty$")
	public void click_on_realty() throws Throwable {
		WebElement Realty=driver.findElement(By.xpath("//a[text()='Realty']"));
		//Using Actions to move the mouse cursor
		Actions ac=new Actions(driver);
		ac.moveToElement(Realty).click(Realty).build().perform();
		//using windows concept to handle windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);//wait

		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}

	@Then("^navigate to Realty page$")
	public void navigate_to_realty_page() throws Throwable {

	}

	@When("^click on Home loan$")
	public void click_on_home_loan() throws Throwable {

		WebElement Home=driver.findElement(By.xpath("//a[text()='Home Loan']"));
		//Using Actions to move the mouse cursor
		Actions ac=new Actions(driver);
		ac.moveToElement(Home).click(Home).build().perform();
		//using windows concept to handle windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}
	@Then("^navigate to Home loan$")
	public void navigate_to_home_loan() throws Throwable {

	}

	@When("^click on Interior$")
	public void click_on_interior() throws Throwable {
		WebElement Interior=driver.findElement(By.xpath("//a[text()='Interiors']"));
		//Using Actions to move the mouse cursor
		Actions ac=new Actions(driver);
		ac.moveToElement(Interior).click(Interior).build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}

	@Then("^navigate toInteriors$")
	public void navigate_tointeriors() throws Throwable {

	}

	@When("^click on Legal$")
	public void click_on_legal() throws Throwable {
		//finding element using xpath 
		WebElement Legal=driver.findElement(By.xpath("//a[text()='Legal']"));
		//Using Actions to move the mouse cursor
		Actions ac=new Actions(driver);
		ac.moveToElement(Legal).click(Legal).build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//Using JavascriptExecutor for Scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}
	@Then("^navigate to Legal$")
	public void navigate_to_legal() throws Throwable {

	}

	@And("^click on browse properties$")
	public void click_on_browse_properties() throws Throwable {
		//Using JavascriptExecutor for Scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		//finding element using cssSelector 
		WebElement properties = driver.findElement(By.cssSelector("[class='flip-visible']"));
		//Using Actions to move the mouse cursor
		Actions pro=new Actions(driver);
		pro.moveToElement(properties).build().perform();
		//finding element using cssSelector 
		WebElement browseproperties = driver.findElement(By.cssSelector("[class='flip-visible']"));
		//Using Actions to move the mouse cursor
		Actions browse=new Actions(driver);
		browse.moveToElement(browseproperties).click(browseproperties).build().perform();
		System.out.println("Navigated to browse Properties");
		System.out.println("Now Navigating back to Home page");
		driver.navigate().back();
	}

	@When("^click on share details$")
	public void click_on_share_details() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement Management = driver.findElement(By.xpath("//a[text()='Property Management']"));
		Actions mng=new Actions(driver);
		mng.moveToElement(Management).build().perform();
		WebElement PropertyManagement = driver.findElement(By.xpath("//a[@href='http://realty-real-estatem1.upskills.in/contact/']"));
		Actions browser=new Actions(driver);
		browser.moveToElement(PropertyManagement).click(PropertyManagement).build().perform();
		System.out.println("Navigated to share details page");
		System.out.println("Now Navigating back to Home page");
		driver.navigate().back();
	}
	@Then("^I check Helpful links working present in footer$")
	public void i_check_helpful_links_working_present_in_footer() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);//wait

		//jumping to about us page
		driver.findElement(By.xpath("//*[@id='menu-item-276']/a")).click();
		//getting title and comparing it with "About Us – Real Estate"
		Assert.assertEquals("About Us – Real Estate",driver.getTitle());
		System.out.println("about us Working");
		//back to the main page
		driver.navigate().back();

		//jumping to contact us page  
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		//comparing current url with expected url
		Assert.assertEquals("http://realty-real-estatem1.upskills.in/contact/", driver.getCurrentUrl());
		System.out.println("contact Working");
		//back to the main page
		driver.navigate().back();

		//jumping to blog us page  
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		//comparing current url with expected url
		Assert.assertEquals("http://realty-real-estatem1.upskills.in/blog/", driver.getCurrentUrl());
		System.out.println("blog Working");
		//back to the main page
		driver.navigate().back();

		//jumping to Compare Properties  us page  
		driver.findElement(By.xpath("//a[text()='Compare Properties']")).click();
		//comparing title  with expected title
		Assert.assertEquals("Compare Properties – Real Estate", driver.getTitle());
		System.out.println("Compare Properties Working");
		//back to the main page
		driver.navigate().back();


	}


	@When("^I check contact us details presnet in footer or not$")
	public void i_check_contact_us_details_presnet_in_footer_or_not() throws Throwable {

		//creating webelement for  storing address
		WebElement address=driver.findElement(By.xpath("//div[text()='Jayanagar, Bangalore']"));
		//checking address is displayed or not
		Assert.assertTrue(address.isDisplayed());


		//creating webelement for  storing phone number
		WebElement phoneno=driver.findElement(By.xpath("//div[text()='Phone: +91 90000 11111']"));
		//checking phone number  is displayed or not
		Assert.assertTrue(phoneno.isDisplayed());


		//creating webelement for  storing email
		WebElement email=driver.findElement(By.xpath("//div[text()='Email: info@realestate.com']"));
		//checking email  is displayed or not
		Assert.assertTrue(email.isDisplayed());

	}



	@Then("^I print contact details$")
	public void i_print_contact_details() throws Throwable {

		//printing contact details present in the web page

		WebElement address=driver.findElement(By.xpath("//div[text()='Jayanagar, Bangalore']"));
		System.out.println(address.getText());

		WebElement phoneno=driver.findElement(By.xpath("//div[text()='Phone: +91 90000 11111']"));
		System.out.println(phoneno.getText());

		WebElement email=driver.findElement(By.xpath("//div[text()='Email: info@realestate.com']"));
		System.out.println(email.getText());
	}

	@When("^I click on social media links$")
	public void i_click_on_social_media_links() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//using multi windows here for checking page is found or not
		//facebook
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[1]/a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		//after switching checking facebook data  from facebook page

		WebElement text=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		Assert.assertTrue(text.isDisplayed());//checking the data is present or not 
		//printing that data which is grabbed by  from facebook page
		System.out.println("Facebook helps you connect and share with the people in your life.");

		driver.close();
		driver.switchTo().window(parentId);

		//twitter
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[2]/a")).click();
		Set<String> windows2 = driver.getWindowHandles();
		Iterator<String> it2 = windows2.iterator();
		String parentId2 = it2.next();
		String childId2 = it2.next();
		driver.switchTo().window(childId2);

		//after switching checking twitter data  from twitter page
		WebElement twitter=driver.findElement(By.xpath("//span[text()='Join Twitter today.']"));
		Assert.assertTrue(twitter.isDisplayed());//checking the data is present or not

		//printing that data which is grabbed by  from twitter page
		System.out.println("Join Twitter today.");

		driver.close();
		driver.switchTo().window(parentId2);


		//google plus
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[3]/a")).click();
		Set<String> windows3 = driver.getWindowHandles();
		Iterator<String> it3 = windows3.iterator();
		String parentId3 = it3.next();
		String childId3 = it3.next();
		driver.switchTo().window(childId3);
		// Google+ was shut down for business and personal use on April 2, 2019.
		System.out.println("google plus acc is not there");

		driver.close();
		driver.switchTo().window(parentId3);

		//news feed
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[4]/a")).click();
		Set<String> windows4 = driver.getWindowHandles();
		Iterator<String> it4 = windows4.iterator();
		String parentId4 = it4.next();
		String childId4 = it4.next();
		driver.switchTo().window(childId4);

		//checking news page is found or not
		if(driver.findElement(By.xpath("//*[text()='This site can’t be reached']")).isDisplayed())
		{
			System.out.println("news feed Page not found");
		}
		else
		{
			System.out.println("News feed working fine");
		}
		driver.close();
		driver.switchTo().window(parentId4);
	}




	//Dashboard------------------------------------------------------------------------------------------------------------------------------

	@Given("User get the dashboardSR")
	public void user_get_the_dashboardSR() {

		System.out.println("User get the dashboard");
	}

	@And("tap on ActivitySR")
	public void tap_on_activitySR() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");//Scroll down the page


		System.out.println("user Get the Activity option");


	}

	@And("user obtain Some optionsSR")
	public void user_obtain_some_optionsSR() {

		System.out.println("User obtain Different type of comments");

	}

	@When("person tap on optionSR")
	public void person_tap_on_optionSR() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);//wait

		Activity a =new Activity(driver);//Creating object
		a.getAll().click();//All Comments
		driver.navigate().back();

		a.getPending().click();//Pending Comments
		driver.navigate().back();//Get back to the previous page

		a.getApproved().click();//Approved Comments
		driver.navigate().back();

		a.getSpam().click();//Spam Comments
		driver.navigate().back();

		a.getTrash().click();//Trash Comments
		driver.navigate().back();//Get back to the previous page
	}

	@Then("Each option should be easily  reachableSR")
	public void each_option_should_be_easily_reachableSR() {
		System.out.println("Each option is easily  reachable by the User");
		driver.close();//close
	}

	//At a Glance

	@Given("User clicks on At a glance drapdownSR")
	public void user_clicks_on_at_a_glance_drapdownSR() throws InterruptedException {

		System.out.println("User clicks on At a glance drapdown ");
	}

	@And("User gets few optionsSR")
	public void user_gets_few_optionsSR() throws InterruptedException {


		System.out.println("User gets Posts,Pages,Comments,Moderations options");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");//Scroll down the page


	}

	@When("User clicks on each optionSR")
	public void user_clicks_on_each_optionSR() throws InterruptedException  {


		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//*[@id='dashboard_right_now']//ul//li["+ i +"]//a")).click(); //iteration using loops

			driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
			driver.navigate().back();	//Get back to the previous page
		}
	}

	@Then("Each options available should be accessibleSR")
	public void each_options_available_should_be_accessibleSR() {

		System.out.println("Each options accessed by User");
	}

	//Quick Draft--------------------------------

	@Given("Entering text in Title boxSR")
	public void entering_text_in_title_boxSR() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");//Scroll down the page

		driver.findElement(By.id("title")).sendKeys("Real Estate");
	}

	@Given("Adding text to the content boxSR")
	public void adding_text_to_the_content_boxSR() {

		driver.findElement(By.xpath("//*[@id='content']")).sendKeys("Land For Sale sq2000 near by Kphb");
	}

	@Then("hit on Save Draft buttonSR")
	public void hit_on_save_draft_buttonSR() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='save-post'][@name='save']")).click();
		System.out.println("Message saved in draft");
		driver.close();
	}

	//WordPress Event and News----------------------------------

	@Given("user go to  WordPress Events and NewsSR")
	public void user_go_to_word_press_events_and_newsSR() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");//Scroll down the page
	}

	@When("Options are available to the userSR")
	public void options_are_available_to_the_userSR() throws InterruptedException {

		//Get meetups
		driver.findElement(By.xpath("//*[@id=\"dashboard_primary\"]//p//a[1]")).click();

		Set<String> windows = driver.getWindowHandles(); // multiple WindowHandling
		Iterator<String>it = windows.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		driver.switchTo().window(ChildWindow); //Switching to childwindow
		System.out.println("childwindow is opened");

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);//wait
		driver.close();

		driver.switchTo().window(ParentWindow); //Switch to parentwindow
		System.out.println("Meetups is opened");

		//Get Wordcamp
		driver.findElement(By.xpath("//*[@id=\"dashboard_primary\"]//p//a[2]")).click();

		Set<String> window2 = driver.getWindowHandles(); // multiple WindowHandling
		Iterator<String>it2 = window2.iterator();
		String ParentWindow2 = it2.next();
		String ChildWindow2 = it2.next();
		driver.switchTo().window(ChildWindow2); //Switching to childwindow
		System.out.println("ChildWindow is opened");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait
		driver.close();

		driver.switchTo().window(ParentWindow2);//Switch to parentwindow
		System.out.println("Wordcamp is opened");


		//Get News
		driver.findElement(By.xpath("//*[@id=\"dashboard_primary\"]//p//a[3]")).click();

		Set<String> windows3 = driver.getWindowHandles();// multiple WindowHandling
		Iterator<String>it3 = windows3.iterator();
		String ParentWindow3 = it3.next();
		String ChildWindow3 = it3.next();
		driver.switchTo().window(ChildWindow3); //Switching to childwindow
		System.out.println("childwindow is opened");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait
		driver.close();

		driver.switchTo().window(ParentWindow3); //Switch to parentwindow
		System.out.println("Wordcamp is opened");

	}

	@Then("Every choice will display some contentSR")
	public void every_choice_will_display_some_contentSR() {

		System.out.println("Every Option is displaying some content");
		driver.close();
	}

	//Woocommerce Status

	@Given("user move to WooCommerce Status OptionsSR")
	public void user_move_to_woo_commerce_status_optionsSR() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");

		System.out.println("Woocomerce Status option is available");
	}

	@And("^Order Status of Woocommerce Should be apperedSR$")
	public void order_status_of_woocommerce_should_be_apperedSR()  {

		System.out.println("Diiferent kind of status are displayed ");

	}

	@Then("click on Each optionSR")
	public void click_on_each_optionSR() {

		for(int k=1;k<=5;k++) {		
			driver.findElement(By.xpath("//*[@id='woocommerce_dashboard_status']//ul//li["+ k +"]//a")).click(); //iteration using loops

			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);//wait
			driver.navigate().back();

		}

	}

	@And("It display the relavent contentSR")
	public void it_display_the_relavent_contentSR() {
		System.out.println("Status is Displaying");

		driver.close();
	}

	//Post Section------------------------------------------------------------------------------------------------------------------------------------------------------

	//adding a new post
	@When("^I click on the posts buttonV$")
	public void i_click_on_the_posts_button() throws Throwable 
	{
		driver.findElement(By.xpath("//div[text()='Posts']")).click();
	}

	@And("^I click on the add New button in posts pageV$")
	public void i_click_on_the_add_new_button_in_posts_page() throws Throwable 
	{
		driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
	}

	@And("^Enter the post name in the text boxV$")
	public void enter_the_post_name_in_the_text_box() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='post_title']")).sendKeys("whitevillashouse");
	}

	@And("^click on publish buttonV$")
	public void click_on_publish_button() throws Throwable
	{
		driver.findElement(By.xpath("//input[@name='publish']")).click();   
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@Then("^Verify Weather new post is added or notV$")
	public void verify_weather_new_post_is_added_or_not() throws Throwable 
	{
		String post = driver.findElement(By.xpath("//h1[text()='Edit Post']")).getText();
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--------"+post);
		Assert.assertEquals("Edit Post",post);
	}
	@Then("^close broswerV$")
	public void close_broswer() throws Throwable 
	{
		driver.close();
	}

	//checking weather drop down is working or not
	@When("^I click on all posts buttonV$")
	public void i_click_on_all_posts_button() throws Throwable 
	{
		driver.findElement(By.xpath("//a[text()='All Posts']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I click on Bulk Actions dropdown in all posts pageV$")
	public void i_click_on_bulk_actions_dropdown_in_all_posts_page() throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='bulk-action-selector-top']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I click on All dates dropdown in all posts pageV$")
	public void i_click_on_all_dates_dropdown_in_all_posts_page() throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='filter-by-date']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I click on All Categories dropdown in all posts pageV$")
	public void i_click_on_all_categories_dropdown_in_all_posts_page() throws Throwable 
	{
		driver.findElement(By.xpath("//select[@id='cat']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I click on Screen Options dropdown in all posts pageV$")
	public void i_click_on_screen_options_dropdown_in_all_posts_page() throws Throwable 
	{
		driver.findElement(By.xpath("//button[@id='show-settings-link']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I click on Help dropdown in all posts pageV$")
	public void i_click_on_help_dropdown_in_all_posts_page() throws Throwable 
	{
		driver.findElement(By.xpath("//button[@id='contextual-help-link']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	//adding categories
	@When("^I click on categories buttonV$")
	public void i_click_on_categories_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^Enter category name in name textboxV$")
	public void enter_category_name_in_name_textbox() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"tag-name\"]")).sendKeys("whitevillas");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@And("^I select the option in parent category dropdownV$")
	public void i_select_the_option_in_parent_category_dropdown() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"parent\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@And("^I click on the Add new category buttonV$")
	public void i_click_on_the_add_new_category_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@And("^Enter the category name in the search text boxV$")
	public void enter_the_category_name_in_the_search_text_box() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"tag-search-input\"]")).sendKeys("whitevillas");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^click on Search Categories buttonV$")
	public void click_on_search_categories_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	//adding tags
	@When("^I click on Tag buttonV$")
	public void i_click_on_tag_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^Enter Tag name in name textboxV$")
	public void enter_tag_name_in_name_textbox() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"tag-name\"]")).sendKeys("white_villas_house");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^Enter slug in slug textboxV$")
	public void enter_slug_in_slug_textbox() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"tag-slug\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I enter the Description in description textboxV$")
	public void i_enter_the_description_in_description_textbox() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"tag-description\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^I click on the Add new Tag buttonV$")
	public void i_click_on_the_add_new_tag_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@And("^Enter the Tag name in the search text boxV$")
	public void enter_the_tag_name_in_the_search_text_box() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"tag-search-input\"]")).sendKeys("white_villas_house");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}

	@And("^click on Search Tags buttonV$")
	public void click_on_search_tags_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}


	//checking search box
	@And("^Enter the post name in the search text boxV$")
	public void enter_the_post_name_in_the_search_text_box() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"post-search-input\"]")).sendKeys("whitevillashouse");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@And("^click on Search Posts buttonV$")
	public void click_on_search_posts_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	@And("^click on Dashboard buttonV$")
	public void click_on_dashboard_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"menu-dashboard\"]/a/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	}
	//posts
	@Given("^click on the all posts optionV$")
	public void click_on_the_all_posts_option() throws Throwable 
	{

	}

	@When("^user click on each optionV$")
	public void user_click_on_each_option() throws Throwable 
	{

	}

	@Then("^very option will display related contentV$")
	public void very_option_will_display_related_content() throws Throwable 
	{
		for(int i=1;i<=6;i++) {
			driver.findElement(By.xpath("//*[@id='wpbody-content']//div[3]//ul//li["+ i +"]//a")).click();
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		} 
	}

	@And("^user gets some optionsV$")
	public void user_gets_some_options() throws Throwable 
	{

	}

	//Media Section---------------------------------------------------------------------------------------------------------------------------------

	@And("^click on mediasectionA$")
	public void click_on_mediasectiona() throws Throwable {
		Media m = new Media(driver); //creating object for Media class
		m.getMediaOpt().click(); //Using object clicking on getMediaOpt present in media class and clicking on media option
	}
	//Media Section
	@Given("^User is on media sectionA$")
	public void user_is_on_media_sectiona() throws Throwable {
		System.out.println("Sucessfully navigated to media section"); //Printing acknowledgement that user is on media section

	}

	//method for library option
	@When("^click on Library optionA$")
	public void click_on_library_option() throws Throwable {

		Media md = new Media(driver);  //creating object for Media class
		md.getLibraryopt().click(); //Using object calling getLibraryopt present in media class and clicking on library option
	}

	//method for add new button
	@And("^click on Add New buttonA$")
	public void click_on_add_new_buttona() throws Throwable {
		Media m = new Media(driver); //creating object for Media class
		m.getAddnewbtn().click(); //Using object clicking on getAddnewbtn present in media class clicking on add new button
	}

	//method for select files option
	@And("^click on select filesA$")
	public void click_on_select_filesa() throws Throwable {

		Media md = new Media(driver); //creating object for media class

		md.getSelectBtn().click(); //clicking on select files button by calling the getSelectBtn method

	}

	//method for File uploading functionality
	@Then("^check file uploading functinalityA$")
	public void check_file_uploading_functinalitya() throws Throwable {

		Robot rb = new Robot(); //Creating object for robot class

		// pressing keys with the help of keyPress and keyRelease events
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);

		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);

		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);

		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);

		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);

		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //using implicitly wait to wait until file uploading is completed

		System.out.println("File uploading is completed."); //printing acknowledgement for file uploading completion
	}
	//method for closing the browser
	@And("^close the browserA$")
	public void close_the_browsera() throws Throwable {
		driver.close();
	}

	//method for dropdown
	@Given("^click on dropdownA$")
	public void click_on_dropdowna() throws Throwable {

		Media dpdwn = new Media(driver); //creating object for media class

		dpdwn.getdropdownopt().click(); //clicking doropdown using method call
	}

	//method for choosing option fron dropdown
	@When("^User choose any option from dropdownA$")
	public void i_choose_any_option_from_dropdowna() throws Throwable { 
		Select dropdown = new Select(driver.findElement(By.id("media-attachment-filters"))); //finding the element using id

		for(int i=0;i<=4;i++) //using for loop for selecting option from dropdown
		{
			dropdown.selectByIndex(i);
			if(i==4) {

				dropdown.selectByIndex(0); //when loop reached the last option of dropdown again navigating to the first option
			}
		}
		//Acknowledge for dropdown functionality completion 
		System.out.println("DropDown action is completed \nNavigating again to option which has index value '0' ");

	}
	//
	@Then("^Appropriate result should be displayedA$")
	public void appropriate_result_should_be_displayeda() throws Throwable {
		System.out.println("Result is displayed");
	}

	@Given("^User is in first dropdownA$")
	public void user_is_in_first_dropdowna() throws Throwable {
		System.out.println("Now User clicks on second dropdown");
	}

	//method for choosing option from dropdown
	@Then("^Choose any option from dropdownA$")
	public void choose_any_option_from_dropdowna() throws Throwable {
		//finding the element using id 
		Select dropdown = new Select(driver.findElement(By.id("media-attachment-date-filters"))); 
		//using for loop for selecting option from dropdown
		for(int i=0;i<=4;i++) {
			dropdown.selectByIndex(i);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(i==4) {
				//Acknowledge for dropdown functionality completion 
				System.out.println("DropDown action is completed \nNavigating again to option which has index value '0' ");
			}
		}
		//when loop reached the last option of dropdown again navigating to the first option
		dropdown.selectByIndex(0);
	}

	//method for search box 
	@Given("^click on search boxA$")
	public void click_on_search_boxa() throws Throwable {
		Media search= new Media(driver);
		//calling method from media class using object
		search.searchboxopt().click();
	}

	@When("^user enters any text inside the search boxA$")
	public void user_enters_any_text_inside_the_search_boxa() throws Throwable {
		Media search= new Media(driver);
		//sending text to searchbox 
		search.searchboxopt().sendKeys("capgemini");

	}

	@Then("^result should be displayedA$")
	public void result_should_be_displayeda() throws Throwable {
		//Acknowledgement for search box result
		System.out.println("Result displayed");

	}

	// Comments Section-------------------------------------------------------------------------------------------------------------------

	//method for registration
	@And("^Click on Regiter link in home page to land on Secure signup PageP$")
	public void click_on_regiter_link_in_home_page_to_land_on_secure_signup_pagep() throws Throwable {
		SignupPage lpp=new SignupPage(driver);
		lpp.getregister().click();
	}

	//enter email firstname lastname
	 @When("^entered \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void entered_and_andp(String email, String firstname, String lastname) throws Throwable {

		//creating object for signuppage class
		SignupPage lp=new SignupPage(driver);

		//entering required details
		lp.getemail().sendKeys(email);           
		lp.getfirstname().sendKeys(firstname);
		lp.getlastname().sendKeys(lastname);

	}

	//submit details
	@Then("^click on Register buttonP$")
	public void click_on_register_buttonp() throws Throwable {

		//creating object for singuppage 
		SignupPage lp=new SignupPage(driver);
		lp.getregisterbtn().click();

		//scroll up
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");	

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
	}

	//getting text
	@And("^getting textP$")
	public void getting_textP() throws Throwable {
		WebElement msg=driver.findElement(By.xpath("//div[@class='notification success closeable']"));

		//calling gettext method
		String text=msg.getText();
		System.out.println(text);

		//expected text
		String expectedText = "You have successfully registered to Real Estate. We have emailed your password to the email address you entered.";

		//use assertEquals method
		Assert.assertEquals(text,expectedText);
		System.out.println("I didn't get mail");

		//close window
		driver.close();
	}

	//method for login
	@Given("^Click on Login link in home page to land on Secure sign in PageP$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_pagep() throws Throwable {

		//creating object for signinpage
		SigninPage lp=new SigninPage(driver);
		lp.getLoginbtn().click();
	}

	// method for entering details
	 @When("^I entered \"([^\"]*)\"  and \"([^\"]*)\"  logs inP$")
	public void i_entered_and_logs_inp(String username, String password) throws Throwable {

		//craeting object  for signinpage
		SigninPage lp=new SigninPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);	
	}

	//method for signin button
	@Then("^Click on signin buttonP$")
	public void click_on_signin_buttonp() throws Throwable {

		//creating object for signinpage
		SigninPage ll=new SigninPage(driver);		
		ll.getSignin().click();		

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
	}

	//close browser
	@And("^close browserP$")
	public void close_browserP() throws Throwable {
		driver.close();
	}

	//method for opening dashboard
	@Given("^user get the DashboardP$")
	public void user_get_the_dashboardp() throws Throwable {
		System.out.println("dashboard open");

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
	}

	//method for comments icon
	@When("^user click on  the Comments iconP$")
	public void user_click_on_the_comments_iconp() throws Throwable {
		driver.findElement(By.xpath("//div[@class='wp-menu-image dashicons-before dashicons-admin-comments']")).click();

	}

	//methods for allcomments,pending,sapm,approved,trash
	@Then("^user get few optionsP$")
	public void user_get_few_optionsp() throws Throwable {

		//loop for clicking options
		for(int i=1;i<=5;i++) {
			driver.findElement(By.xpath("//*[@id='wpbody-content']//div[3]//ul//li["+ i +"]//a")).click();
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		}
	}
	//method for eac option available
	@And("^each option should be availableP$")
	public void each_option_should_be_availablep() throws Throwable {
		System.out.println("each option available");
	}


	//method for searchbrox
	@Then("^click on search boxP$")
	public void click_on_search_boxp() throws Throwable {

		//creating object for comments
		Comments srch=new Comments(driver);
		srch.getsearch().click();		
	}

	//method for user id
	@And("^enter (.+)P$")
	public void enterp(String userId) throws Throwable {

		//creating object for comment
		Comments src=new Comments(driver);
		src.getsearch().sendKeys(userId);
	}

	//method for search comment
	@And("^click on search commentP$")
	public void click_on_search_commentp() throws Throwable {

		// creating object for comment
		Comments sbtn=new Comments(driver);
		sbtn.getsearchbtn().click();
	}

	//method for shows user comment
	@And("^shows user commentP$")
	public void shows_user_commentp() throws Throwable {		
		System.out.println("Then shows user comment");

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
	} 
	//method for dropdown button
	@And("^click on dropdown buttonP$")
	public void click_on_dropdown_buttonp() throws Throwable {

		//method for find dropdown element
		WebElement testDropDown = driver.findElement(By.cssSelector("[id='filter-by-comment-type']"));

		//creating object for select class
		Select dropdown = new Select(testDropDown);  

		//As this is static dropdown, order will not change
		//find COMMENTS option  using index method
		dropdown.selectByIndex(1); 

		System.out.println(testDropDown.getText());	
		//find COMMENTS option  using value method
		dropdown.selectByValue("pings");
	}
	//method for select option
	@Then("^select optionP$")
	public void select_optionp() throws Throwable {

		System.out.println("select comment option");		
	}

	//method for filter
	@And("^click on filterP$")
	public void click_on_filterp() throws Throwable {

		//creating object for comment
		Comments fltr=new Comments(driver);
		fltr.getfilter().click();
	}

	//method for reply option
	@When("^user hover to reply optionP$")
	public void user_hover_to_reply_optionp() throws Throwable {    	
		WebElement Rpl=driver.findElement(By.xpath("//p[text()='no']"));

		//using action to hovering mouse to the option
		Actions as=new Actions(driver);
		as.moveToElement(Rpl).click(Rpl).build().perform();

		//creating webelement for reply
		WebElement Reply=driver.findElement(By.xpath("//a[text()='Reply']"));
		//using action to click on reply 
		Actions ac=new Actions(driver);
		ac.moveToElement(Reply).click(Reply).build().perform();

	}
	//method for click on reply button
	@And("^click on reply buttonP$")
	public void click_on_reply_buttonp() throws Throwable {
		Comments txt=new Comments(driver);
		txt.gettxt().sendKeys("hii");
	}

	//method for text in comment box
	@Then("^user enter any text in the comment boxP$")
	public void user_enter_any_text_in_the_comment_boxp() throws Throwable {
		System.out.println("hii");
	}

	//method for send button
	@And("^click on sendP$")
	public void click_on_sendp() throws Throwable {
		Comments sd=new Comments(driver);
		sd.getsend().click();

		//method for refresh window
		driver.navigate().refresh();

		driver.close(); //close browser
	}

	// Properties-----------------------------------------------------------------------------------------------------------------------------

	@Then("^Navigate to properties$")
	public void navigate_to_properties() throws Throwable {
		//create Properties object
		Properties p = new Properties(driver);
		//click on the property button
		p.getPropbtn().click();   
	}
	@And("^Click on Screen options in the Properties page$")
	public void click_on_screen_options_in_the_properties_page() throws Throwable {
		//create Properties object
		Properties p = new Properties(driver);
		//Click on Screen option in properties page
		p.getScreenOptBtn().click();
	}
	@And("^Select columns pagination view$")
	public void select_columns_pagination_view() throws Throwable {
		//create Properties object
		Properties p = new Properties(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Columns in the Screen Options
		List<WebElement> columns = p.getColumns();
		//Check every column is selected in the screen options
		for(WebElement col : columns) {
			Assert.assertTrue(col.isSelected());
		}
		//Clear Number of items per page and enter a number
		p.getPagination().clear();
		p.getPagination().sendKeys("50");
		//Types of views in Screen Option
		List<WebElement> optviews = p.getViews();
		//Click on view and check view is selected or not
		for(WebElement opt: optviews) {
			opt.click();
			Assert.assertTrue(opt.isSelected());
		}
	}
	@Then("Apply screen Options")
	public void apply_screen_options() {
		//create Properties object
		Properties apply = new Properties(driver);
		//Click on the apply button
		apply.getApplybtn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Scroll using java script Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		//Close the window
		driver.close();
	}
	@And("^Click on add new button$")
	public void click_on_add_new_button() throws Throwable {
		//create Properties object
		Properties addnew = new Properties(driver);
		//Click on add new button
		addnew.getAddNew().click();
	}
	@Then("^Verify it redirects to add new properties$")
	public void verify_it_redirects_to_add_new_properties() throws Throwable {
		//create Properties object
		Properties addnew = new Properties(driver);
		//Check that add new page is opened or not
		Assert.assertTrue(addnew.getHeading().isDisplayed());
		//Close the window
		driver.close();
	}

	@And("^Click on Date Filter Select date$")
	public void click_on_date_filter_select_date() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Create WebElement of drop down
		WebElement DateDropDown = p.getDates();
		Select se = new Select(DateDropDown);
		//Select option by visible text
		se.selectByVisibleText("August 2021");
	}

	@And("^Click on Filter$")
	public void click_on_filter() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Click on Filter in the properties page
		p.getFilter().click();
	}

	@And("^Select All Properties are displayed$")
	public void select_all_properties_are_displayed() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Click on select all button
		p.getSelectAll().click();
	}

	@And("^Click on Bulk actions Select the action$")
	public void click_on_bulk_actions_select_the_action() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Create a WebElement for actions
		WebElement BulkActions = p.getBulkActions();
		Select bulkaction = new Select(BulkActions);
		//Select option by Visible Text
		bulkaction.selectByVisibleText("Move to Trash");
	}

	@And("^Click on Apply$")
	public void click_on_apply() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Click on the Action button
		p.getActionBtn().click();

	}
	@Then("^Verify the action is performed$")
	public void verify_the_action_is_performed() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//message after deleting the Properties
		String msg = p.getPropDetails().getText();
		String expectedmsg = "No Properties found";
		//Check message as expected message
		Assert.assertEquals(msg,expectedmsg);
		//Close the browser
		driver.close();
	}
	@And("^Click on Search bar$")
	public void click_on_search_bar() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Click on the search bar
		p.getSearchBar().click();

	}
	@And("^Enter the Property Details and click on search button$")
	public void enter_the_property_details_and_click_on_search_button() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Enter the Details of Property
		p.getSearchBar().sendKeys("Sun City");
		//Click on Search Button
		p.getSearchBtn().click();
		//Scroll Using Java Script Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
	}
	@And("^Click on Edit$")
	public void click_on_edit() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Click on the edit button
		p.getEdit().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Navigate back
		driver.navigate().back();
	}
	@And("^Click on Quick edit and update the property$")
	public void click_on_quick_edit_and_update_the_property() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on Quick Edit button
		p.getQuickEdit().click();
		//Click on Update button
		p.getUpdatebtn().click();
	}
	@Then("^close the window$")
	public void close_the_window() throws Throwable {
		//Close the browser
		driver.close();
	}
	@And("^Click on Add new$")
	public void click_on_add_new() throws Throwable {
		//Create a object of AddNewProperties
		Properties p = new Properties(driver);
		//Click on add new button
		p.getAddNew().click();
	}

	@And("^Click on title and Enter the title details$")
	public void click_on_title_and_enter_the_title_details() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Enter the Title
		an.getTitleTxt().sendKeys("Green Parks");
	}

	@And("^Click on description enter the description$")
	public void click_on_description_enter_the_description() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//an.getTextbtn().click();
		an.getDescTxt().sendKeys("One of Hyderabad's tallest towers in the making at the city's most happening locale, \"Financial District, Nanakramguda\". The 44-storey twin towers are ultra-luxe apartments designed by the finest architects along the sleek lines & minimalist sophistication. Subtle yet sparkling, they are enchanting from the outside, and magnificently crafted on inside, are comparable in design to the best in the world.\r\n"
				+ "The Olympus is a positive place with happy vibes. Step out to the nature, ensconced in a play of vividity of greenery and the flora. Experience an outdoor as exciting as the cozy world of indoor and let life happen engulfed in the splendor of nature’s colors. Let the excitement spill over inside-out.");
	}
	@And("^Click on add or upload images$")
	public void click_on_add_or_upload_images() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Click on Gallery button
		an.getGalleryAddbtn().click();
	}
	@And("^Select images of property$")
	public void select_images_of_property() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Click on image
		an.getImage().click();
	}

	@And("^Click on use these files$")
	public void click_on_use_these_files() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Click on Use these button after image is selected
		an.getUseTheseBtn().click();
	}
	@And("^Click on gallery layout select the layout$")
	public void click_on_gallery_layout_select_the_layout() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Select the layout by visible text
		Select se = new Select(an.getLayout());
		se.selectByVisibleText("Style 3");
	}
	@Then("Click on Price Details enter the details")
	public void click_on_price_details_enter_the_details() {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on price button
		an.getPriceBtn().click();
		//Click on Price text area and enter the price details
		an.getPriceTxt().click();
		an.getPriceTxt().sendKeys("5000000");
		//Enter the Price per sq.feet
		an.getPricePreSq().sendKeys("10000");
		//Select the offer type 
		Select se = new Select(an.getOfferType());
		se.selectByVisibleText("For Sale");
		se.selectByVisibleText("For Rent");
		se.selectByVisibleText("For Sale");
		//select the property type
		Select proptype = new Select(an.getPropertyType());
		proptype.selectByVisibleText("Villas");
	}
	@And("^Click on Main Details enter the details$")
	public void click_on_main_details_enter_the_details() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//CLick on Main details button
		an.getMainDetBtn().click();
		//Click on Status Text area and enter the status
		an.getStatus().click();
		an.getStatus().sendKeys("Available");
		//Click on Location text area and enter the Location text area
		an.getLoactiontxt().click();
		an.getLoactiontxt().sendKeys("Hyderabad - Narsapur Road, Kondapur, Telangana, India");
		//Click on Possession and enter the possession text area
		an.getPossession().click();
		an.getPossession().sendKeys("1 Year Agreement");
	}

	@And("^Click on location details enter the details$")
	public void click_on_location_details_enter_the_details() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click on Location button 
		an.getLocationbtn().click();
		//Click on Address text area and enter the Address,Google Address, latitude, and longitude
		an.getAddresstxt().click();
		an.getAddresstxt().sendKeys("Hyderabad - Narsapur Road, Kondapur, Telangana, India");
		an.getGoogleAddress().click();
		an.getGoogleAddress().sendKeys("Hyderabad - Narsapur Road, Kondapur, Telangana, India");
		an.getLatitude().click();
		an.getLatitude().sendKeys("17.7132661");
		an.getLongitude().click();
		an.getLongitude().sendKeys("78.31320529999999");
	}

	@And("^Click on Details enter the details$")
	public void click_on_details_enter_the_details() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on Other details and Enter the Details
		an.getOtherDet().click();
		an.getStorage().click();
		an.getStorage().sendKeys("Available");
	}

	@And("^Click on Video urls$")
	public void click_on_video_urls() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on video button and enter the url
		an.getVideo().click();
		an.getVideoUrl().click();
		an.getVideoUrl().sendKeys("https://www.youtube.com/watch?v=y9j-BL5ocW8");
	}
	@And("^Click on Findeo Property select the image$")
	public void click_on_findeo_property_select_the_image() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Select the Findeo property
		Select sidebar = new Select(an.getFindeoSelect());
		sidebar.selectByVisibleText("Footer 1st Column");
		sidebar.selectByVisibleText("Single property sidebar");
		//Click on FindeoImg Button and select the image
		an.getFindeoImgBtn().click();
		driver.findElement(By.xpath("//*[@id='__attachments-view-234\']/li[1]")).click();
		an.getUseThisFile().click();
	}

	@And("^Select Keywords of the property$")
	public void select_keywords_of_the_property() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//List of Keywords and select the keywords
		List<WebElement> keywordlist = an.getKeywords();
		for(WebElement keyword : keywordlist) {
			if(keyword.getAttribute("value").contains("2004")) {
				keyword.click();
				//check the Keyword is selected
				Assert.assertTrue(keyword.isSelected());
			}
			if(keyword.getAttribute("value").contains("1989")) {
				keyword.click();
				//check the Keyword is selected
				Assert.assertTrue(keyword.isSelected());
			}
		}
	}

	@And("^Click and enter the project details$")
	public void click_and_enter_the_project_details() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on the project details and enter the details
		an.getProjectTxt().click();
		an.getProjectTxt().sendKeys("West Brook enables you to connect to the city and the world without stress or strain. Feel the power of this connectivity through conveniently located Metro Stations, IT Hubs, Schools, Hospitals, Malls and much more.");
	}

	@And("^Click and enter the builder name$")
	public void click_and_enter_the_builder_name() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on the builder name and enter the name
		an.getBuilderName().click();
		an.getBuilderName().sendKeys("West Brook");
	}

	@And("^Click on checkbox of discussion$")
	public void click_on_checkbox_of_discussion() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on check boxes in discussion
		an.getCmtCheckbox().click();
		an.getPingCheckbox().click();
	}

	@Then("^Click on publish$")
	public void click_on_publish() throws Throwable {
		//Create a object of AddNewProperties
		AddNewProperties an = new AddNewProperties(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Scroll in the window
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", an.getPublishbtn());
		an.getPublishbtn().click();
		/*String msg = an.getPublishMsg().getText();
	    	String expectedmsg = "Post published. ";
	    	Assert.assertEquals(msg, expectedmsg);*/
		//click on the view post 
		an.getViewPost().click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1500)", "");
		driver.close();
	}
	@And("^Click on features$")
	public void click_on_features() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Click on the features
		f.getFeatures().click();
	} 

	@And("^Click on Name enter the feature name$")
	public void click_on_name_enter_the_feature_name() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on feature name and enter the name
		f.getFeatName().click();
		f.getFeatName().sendKeys("Double Bedroom");
	}

	@And("^Click on slug enter the slug$")
	public void click_on_slug_enter_the_slug() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on the slug and enter the slug
		f.getSlug().click();
		f.getSlug().sendKeys("Double-bed-room");
	}

	@And("^select the parent feature$")
	public void select_the_parent_feature() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on parent feature
		f.getParentFeatures().click();
	}

	@And("^Click on Description enter the feature description$")
	public void click_on_description_enter_the_feature_description() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on Description and enter the description
		f.getDescription().click();
		f.getDescription().sendKeys("Beautiful Double Bed Room in the Property With cupboards");
	}

	@And("^Click on Addnew feature$")
	public void click_on_addnew_feature() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on add feature button
		f.getAddFeatbtn().click();
	}

	@And("^Perform search opertions in features page$")
	public void perform_search_opertions_in_features_page() throws Throwable {
		//Create a object of FeaturesPage
		FeaturesPage f = new FeaturesPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on Search area and enter the feature
		f.getSearchTxt().click();
		f.getSearchTxt().sendKeys("Double Bedroom");
		//Click on search button
		f.getSearchBtn().click();
		String msg = f.getSearchMsg().getText();
		String expectedmsg = "Search results for “Double Bedroom”";
		//Check the expected message is same as message
		Assert.assertEquals(msg, expectedmsg);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		//Close the driver
		driver.close();
	}

	@And("^Click on Regions$")
	public void click_on_regions() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on regions
		r.getRegions().click();
	}

	@And("^Click on Name enter the region name$")
	public void click_on_name_enter_the_region_name() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on region name and enter the region name
		r.getRegName().click();
		r.getRegName().sendKeys("Kondapur");
	}

	@And("^Click on slug enter the region slug$")
	public void click_on_slug_enter_the_region_slug() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//click on slug and enter the slug
		r.getSlug().click();
		r.getSlug().sendKeys("Kondapur-hyderabad");
	}


	@And("^select the parent region$")
	public void select_the_parent_region() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//click on Parent region
		r.getParentRegion().click();
	}

	@And("^Click on Description enter the region description$")
	public void click_on_description_enter_the_region_description() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on Description and enter the description
		r.getDescription().click();
		r.getDescription().sendKeys("Kondapur, Hyderabad. 5000078");
	}

	@And("^Click on Addnew region$")
	public void click_on_addnew_region() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on add region button
		r.getAddRegbtn().click();
	}

	@And("^Perform search opertions in region page$")
	public void perform_search_opertions_in_region_page() throws Throwable {
		//Create a object of RegionsPage
		RegionsPage r = new RegionsPage(driver);
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on search text area and enter the region
		r.getSearchTxt().click();
		r.getSearchTxt().sendKeys("Kondapur");
		//click on search button
		r.getSearchBtn().click();
		String msg = r.getSearchMsg().getText();
		String expectedmsg = "Search results for “Kondapur”";
		//Check the expected message as same as message
		Assert.assertEquals(msg, expectedmsg);
	}

	// Users Section----------------------------------------------------------------------------------------------------------------------------------
	//clicking on user to redirecting on user page
	@Given("I Click on UsersR")
	public void i_click_on_usersr() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		UserPage Up=new UserPage(driver);
		Up.getUsers().click();
	}
	//checking screen option is working fine or not
	@And("^I Click on screenOptionR$")
	public void i_click_on_screenoptionr() throws Throwable {
		UserPage SO=new UserPage(driver);
		SO.Getscreenoption().click();

	}

	//checking all check boxes working or not
	@When("^I select All checkboxR$")
	public void i_select_all_checkboxr() throws Throwable {

		//deSelecting Post CheckBox	

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement option1 = driver.findElement(By.id("posts-hide"));	
		{
			// This will uncheck the Check box 		
			option1.click();	

			// Check whether the Check box is toggled on 		
			if (option1.isSelected())
			{					
				System.out.println("Post Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Post Checkbox is Toggled Off");					
			}	
		}

		//Selecting role CheckBox
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement option2 = driver.findElement(By.id("role-hide"));	
		{

			// Check whether the Check box is toggled on 		
			if (option2.isSelected())
			{					
				System.out.println("Role Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Role Checkbox is Toggled Off");					
			}	
		}

		//Selecting email CheckBox
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement option3 = driver.findElement(By.id("email-hide"));	
		{

			// Check whether the Check box is toggled on 		
			if (option3.isSelected())
			{					
				System.out.println("Email Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Email Checkbox is Toggled Off");					
			}	
		}
	}

	@And("^I Send user number for user per pageR$")
	public void i_send_user_number_for_user_per_pager() throws Throwable {

		UserPage SUN=new UserPage(driver);

		//here we are using KeyControl for pressing control plus a to select previous text
		SUN.GetUsernumber().sendKeys(Keys.CONTROL + "a");
		//after removing previous value send 50 for 50 user on the page
		SUN.GetUsernumber().sendKeys("50");
		SUN.Getapply().click();
	}

	@And("^close browserR$")
	public void close_browser() throws Throwable {
		driver.close();
	}


	/////
	//add user page starting 

	@Given("^I Open add user pageR$")
	public void i_open_add_user_pager() throws Throwable {
		AddUser AU=new AddUser(driver);
		AU.Getadduser().click();

	}


	@When("^I enter all inputs present in add user pageR$")
	public void i_enter_all_inputs_present_in_add_user_pager() throws Throwable {
		AddUser AU1=new AddUser(driver);

		//implicit wait for 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Sending data to the all fields for adding new user
		AU1.SendUsername().sendKeys("Rajat123");
		AU1.SendEmail().sendKeys("Rajatwork98@gmail.com");
		AU1.SendFirstname().sendKeys("Rajat");
		AU1.SendLastname().sendKeys("Work");
		AU1.SendWebsite().sendKeys("www.google.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AU1.Getpassword().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AU1.Sendpassword().sendKeys("RajatKumar@8979055365");

		WebElement Usernotification = driver.findElement(By.id("send_user_notification"));	
		{

			// Check whether the Check box is toggled on 		
			if (Usernotification.isSelected())
			{					
				System.out.println("User notification Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("User notification Checkbox is Toggled Off");					
			}	
		}

	}


	@And("^I select role of the userR$")
	public void i_select_role_of_the_userR() throws Throwable {

		//selecting customer from the role dropdown 
		Select dropdown = new Select(driver.findElement(By.id("role")));
		dropdown.selectByVisibleText("Customer");
	}

	@Then("^I Click on add new user buttonR$")
	public void i_click_on_add_new_user_buttonr() throws Throwable {
		//implicit wait for 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AddUser AU2=new AddUser(driver);
		AU2.GetAddnewuser().click();

	}

	//here checking user is successfully added or not with assertion
	//    @And("^I check user added or not$")
	//    public void i_check_user_added_or_not() throws Throwable {
	//        AddUser UA=new AddUser(driver);
	//		String text=UA.Useradded().getText();
	//		 Assert.assertEquals("New user created. ", text);
	//		 System.out.println("New user added successfully");
	//    }

	//Search and delete start from here
	//Search user here which we add previously Rajatwork98@gmail.com

	@And("^I Search Rajatwork98@gmail.comR$")
	public void i_search_rajatwork98gmailcomr() throws Throwable {
		UserPage SI=new UserPage(driver);

		SI.Sendsearch().sendKeys("Rajatwork98@gmail.com");
		SI.getSearch().click();
	}


	@When("^I Check Rajatwork98@gmail.com present or notR$")
	public void i_check_rajatwork98gmailcom_present_or_notr() throws Throwable {
		UserPage SC=new UserPage(driver);

		String text=SC.CheckEmail().getText();
		//implicit wait for 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//using assert for checking user is present or not
		Assert.assertEquals("rajatwork98@gmail.com", text);
		System.out.println("Assert is working fine and rajatwork98@gmail.com is present in users");

	}

	//deleting that user which we create in previous scenario 
	@Then("^I Delete Rajatwork98@gmail.comR$")
	public void i_delete_rajatwork98gmailcomr() throws Throwable {
		UserPage DU=new UserPage(driver);
		DU.Getdelete().click();
	}

	//checking search with invalid user id
	@And("^I Search invalid id Rajatwork9858468@gmail.comR$")
	public void i_search_invalid_id_rajatwork9858468gmailcomr() throws Throwable {
		UserPage AS=new UserPage(driver);
		//implicit wait for 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AS.Getsearch().sendKeys("Rajatwork9858468@gmail.com");
		AS.Getsearchbutton().click();

	}

	//it should display no user found
	@Then("^It should display No users foundR$")
	public void it_should_display_no_users_foundr() throws Throwable {
		UserPage NUF=new UserPage(driver);
		String text=NUF.Nouserfound().getText();
		Assert.assertEquals("No users found.", text);
		System.out.println("Assert is working fine and Rajatwork9858468@gmail.com is not present in users");
	}


	/////
	//User profile starting here

	//For jumping on user profile section
	@Given("^I switch to Your profile sectionR$")
	public void i_switch_to_your_profile_sectionr() throws Throwable {
		UserProfile UP=new UserProfile(driver);
		UP.Getuserprofile().click();

	}

	//For checking checkboxes
	@Then("^I check all the checkboxes are checked or notR$")
	public void i_check_all_the_checkboxes_are_checked_or_notr() throws Throwable {

		//implicit wait for 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//for Visual editor check box
		WebElement VisualBox = driver.findElement(By.id("rich_editing"));	
		{

			// Check whether the Check box is toggled on 		
			if (VisualBox.isSelected())
			{					
				System.out.println("Visual ediyot Box Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Visual ediyot Box Checkbox is Toggled Off");					
			}	
		}

		//for syntaxHighlight check box
		WebElement SyntaxHighlighting = driver.findElement(By.id("syntax_highlighting"));	
		{

			// Check whether the Check box is toggled on 		
			if (SyntaxHighlighting.isSelected())
			{					
				System.out.println("Syntax Highlighting Box Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Syntax Highlighting Box Checkbox is Toggled Off");					
			}	
		}

		//for Keyboard Shortcuts check box
		WebElement KeyboardShortcuts = driver.findElement(By.id("comment_shortcuts"));	
		{

			// Check whether the Check box is toggled on 		
			if (KeyboardShortcuts.isSelected())
			{					
				System.out.println("Keyboard Shortcuts Box Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Keyboard Shortcuts Box Checkbox is Toggled Off");					
			}	
		}

		//for Toolbar check box
		WebElement Toolbar = driver.findElement(By.id("admin_bar_front"));	
		{

			// Check whether the Check box is toggled on 		
			if (Toolbar.isSelected())
			{					
				System.out.println("Toolbar Box Checkbox is Toggled On");					

			} 
			else 
			{			
				System.out.println("Toolbar Box Checkbox is Toggled Off");					
			}	
		}

	}

	//change color to blue
	@And("^I change admin color scheme into BlueR$")
	public void i_change_admin_color_scheme_into_bluer() throws Throwable {
		UserProfile UP=new UserProfile(driver);
		UP.Getcolor().click();

	}

	//Checking admin email is correct or not
	@Then("^I check Email present in email section is correct or notR$")
	public void i_check_email_present_in_email_section_is_correct_or_notr() throws Throwable {

		//implicit wait for 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//getting email from the attribute and used assertion for checking that value
		String input = driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals(input,"mohankrishna176@gmail.com");
		System.out.println("Admin Email is presnet");

	}


	@And("^I send some data to adminR$")
	public void i_send_some_data_to_adminr() throws Throwable {
		UserProfile SD=new UserProfile(driver);
		//here we are using KeyControl for pressing control plus a to select previous text
		SD.Getfirstname().sendKeys(Keys.CONTROL + "a");
		//after removing previous value and  send rajat 
		SD.Getfirstname().sendKeys("Rajat");

		//here we are using KeyControl for pressing control plus a to select previous text
		SD.Getlastname().sendKeys(Keys.CONTROL + "a");
		//after removing previous value and send kumar 
		SD.Getlastname().sendKeys("kumar");

	}

	//Updating profile here
	@And("^I clicked on update profileR$")
	public void i_clicked_on_update_profiler() throws Throwable {
		UserProfile UP=new UserProfile(driver);
		UP.GetUpdateprofile().click();

	}

	//checking profile is updated or not 
	@Then("^I check  Profile is updated or notR$")
	public void i_check_profile_is_updated_or_notr() throws Throwable {
		UserProfile PU=new UserProfile(driver);
		String text=PU.Checkprofile().getText();
		Assert.assertEquals("Profile updated.", text);
		System.out.println("Profile updated successfully");
	}

	//PROFILE SECTION-------------------------------------------------------------------------------------------------------------------------------------------

	//Navigated to profile section
	@And("^click on profilesectionB$")
	public void click_on_profilesection() throws Throwable {
		SigninPage ps= new SigninPage(driver);
		ps.getProfilebtn().click();   

		System.out.println("Navigated to ProfileSection");

		//clicking on alert
		driver.findElement(By.xpath("//*[@class='notice-dismiss vc-notice-dismiss']")).click();
	}
	// Enabling Admin color schemes
	@Given("^User is in Profile sectionB$")
	public void user_is_in_profile_section() throws Throwable {

		System.out.println("Admin color options is displayed");

	}
	//Enabling Radio buttons
	@When("^click on Default color optionsB$")
	public void click_on_default_color_options() throws Throwable {
		ProfileSection cs =new ProfileSection(driver);
		cs.getdefaultclr().click();//Radio button
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	@And("^click on blue color schemeB$")
	public void click_on_blue_color_scheme() throws Throwable {
		ProfileSection bc =new ProfileSection(driver);
		bc.getBlueclr().click();//Radio button
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	@And("^click on Ectoplasm color optionB$")
	public void click_on_ectoplasm_color_option() throws Throwable {
		ProfileSection e =new ProfileSection(driver);
		e.getEctoplasm().click();//Radio button
	}

	@Then("^check the color is changedB$")
	public void check_the_color_is_changed() throws Throwable {
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		System.out.println("colors are changed");
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");  
	}

	@And("^click on the check boxesB$")
	public void click_on_the_check_boxes() throws Throwable {
		//Enabling keyboard shortcuts  
		WebElement keyboardshortcut = driver.findElement(By.xpath("//*[@id=\"comment_shortcuts\"]"));//check box
		{
			//wait
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

			// Check whether the Check box is toggled on
			if (keyboardshortcut.isSelected())
			{
				System.out.println("User keyborad shortcut Checkbox is Toggled On");

			}
			else
			{
				System.out.println("User keyborad shortcut Checkbox is Toggled Off");
			}
		} 
		// enabling Toolbar 
		WebElement Toolbar = driver.findElement(By.xpath("//*[@id=\"admin_bar_front\"]"));//check box
		{

			//wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// Check whether the Check box is toggled on
			if (Toolbar.isSelected())
			{
				System.out.println("User Toolbar Checkbox is Toggled On");

			}
			else
			{
				System.out.println("User Toolbar Checkbox is Toggled Off");
			}
		}

	}	

	@And("^validate the emailB$")
	public void validate_the_email() throws Throwable {

		WebElement Email= driver.findElement(By.id("email"));
		WebElement Submit= driver.findElement(By.id("submit"));

		Actions a = new Actions(driver);
		a.moveToElement(Email).click(Email)
		.sendKeys("bhavna6457454@gmail.com").moveToElement(Submit).click(Submit).build().perform();

		WebElement Emailalert = driver.findElement(By.xpath("//*[@id=\"profile-page\"]/div[1]/p"));
		Assert.assertTrue(Emailalert.isDisplayed());//Email Address has not been updated

		System.out.println("Confirmation mail not recieved");// DEFECT ID :PS1111- Defect in Email Verification
		//Raised in Jira
		driver.close();//Close browser

	}


	//Enter Name Details
	@Given("^User is in Name detailsB$")
	public void user_is_in_name_details() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");  

		System.out.println("Enter Name details");  
	}

	//Entering name details
	@Then("^Enter name detailsB$")
	public void enter_name_details() throws Throwable {
		NameDetails fn= new NameDetails(driver);

		Actions action = new Actions(driver);
		//to move the element
		action.moveToElement(fn.getFirstnme()).click(fn.getFirstnme()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Bhavana").build().perform();

		//Entering last name by removing existed name using actions
		action.moveToElement(fn.getLastnme()).click(fn.getLastnme()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Samudrala").build().perform();

		action.moveToElement(fn.getNicknme()).click(fn.getNicknme()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Sam").build().perform();
	}
	//Enabling Drop down box
	@And("^Using dropdown to display nameB$")
	public void using_dropdown_to_display_name() throws Throwable {
		NameDetails dn= new NameDetails(driver);
		dn.getDisplynme();
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		Select select = new Select(dn.getDisplynme());
		//Using select by visible text
		select.selectByVisibleText("admin");

		driver.close();//closing browser
	}

	//entering customer billing address details
	@Given("^User is in billing address detailsB$")
	public void user_is_in_billing_address_details() throws Throwable {

		System.out.println("Entering customer billing address details");
	}

	//Entering billing address details
	@When("^Enter all address related detailsB$")
	public void enter_all_address_related_details() throws Throwable {
		AddressDetails Ad =new AddressDetails(driver);

		//create Action
		Actions action = new Actions(driver);
		action.moveToElement(Ad.getCfname()).click(Ad.getCfname()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Bhavana").build().perform();

		//To move Element
		action.moveToElement(Ad.getClname()).click(Ad.getClname()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Samudrala").build().perform();

		//Sending data to textbox
		Ad.getCompany().sendKeys("Capgemini");
		Ad.getAddress1().sendKeys("hanamkonda");
		Ad.getCity().sendKeys("Warangal");
		Ad.getpostcode().sendKeys("506001");
	}

	//Enabling Autosuggesions
	@Then("^Use Autosuggesion to enter country nameB$")
	public void use_autosuggesion_to_enter_country_name() throws Throwable {
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");  

		//clicking on autosuggession box
		driver.findElement(By.xpath("//*[@id=\"select2-billing_country-container\"]")).click();

		AddressDetails dd =new AddressDetails(driver);
		dd.getcountry().sendKeys("ind");// giving suggesion using sendkeys
		// choosing suggesion using this
		List <WebElement> options =driver.findElements(By.cssSelector(".select2-results__option"));
		//checking
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		System.out.println("Country India is selected");

		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	//Using Autosuggession to select state
	@And("^use Autosuggesion to enter state nameB$")
	public void use_autosuggesion_to_enter_state_name() throws Throwable {
		//clicking on Autosuggession box
		driver.findElement(By.xpath("//*[@id='select2-billing_state-container']")).click();

		AddressDetails ss =new AddressDetails(driver);
		ss.getState().sendKeys("tel");// Giving Suggesion

		ss.sendkeys(Keys.ARROW_DOWN);// using Arrow Down key
		ss.sendkeys(Keys.ENTER);

		System.out.println("State Telangana is selected");

	}

	@And("^use copy button to copy billing address as shippingB$")
	public void use_copy_button_to_copy_billing_address_as_shipping() throws Throwable {

		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		AddressDetails Cb= new AddressDetails(driver);
		//copying billing address as shipping address
		Cb.getcopybtn().click();
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
	}

	@Then("^billing and shipping address is enteredB$")
	public void billing_and_shipping_address_is_entered() throws Throwable {
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); 

		System.out.println("Billing and shipping address is filled");
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		driver.close();//closing browser

	}


	//updating the profile
	@Given("^user details are filledB$")
	public void user_details_are_filled() throws Throwable {
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", ""); 

		System.out.println("All the above details are filled");

	}
	@When("^click on update profile buttonB$")
	public void click_on_update_profile_button() throws Throwable {
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		//clicking on update profile button
		driver.findElement(By.id("submit")).click();

	}

	@Then("^profile will be updatedB$")
	public void profile_will_be_updated() throws Throwable {

		WebElement msg=driver.findElement(By.xpath("//*[@id='message']/p"));

		String text=msg.getText();
		String expectedText = "Profile updated.";
		//assert equals
		Assert.assertEquals(text,expectedText);

		System.out.println("Profile section is updated");//Profile is updated

		driver.close();//closing browser
	}

	//user get logout
	@Given("^User get logout from the sectionB$")
	public void user_get_logout_from_the_section() throws Throwable {

		System.out.println("user can logout") ; 

	}

	@When("^move the cursor on profile sectionB$")
	public void move_the_cursor_on_profile_section() throws Throwable {

		WebElement Profilebtn = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"));
		//Using Actions
		Actions builder =new Actions(driver);

		//to move the element
		builder.moveToElement(Profilebtn).build().perform();

	}

	@Then("^click on logout optionB$")
	public void click_on_logout_option() throws Throwable {
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();// user get log out

		System.out.println("user get logged out");

		driver.close();

	}





}




