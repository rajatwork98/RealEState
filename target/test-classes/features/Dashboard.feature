Feature: Login

Background: Verify login with valid credentials
Given Initialize the browser with chrome
And Navigate to  "http://realty-real-estatem1.upskills.in/" site
And Click on Login link in home page to land on Secure sign in Page
And Click on Login in login page
When I entered valid "mohankrishna176@gmail.com" and valid "Secret@123&&" logs in
Then Click on signin button

  Scenario: Working Functionality of Activity Option
    Given User get the dashboardSR
    And tap on ActivitySR
    And user obtain Some optionsSR
    When person tap on optionSR
    Then Each option should be easily  reachableSR


  Scenario: Checking functionality of At a GlanceSR
    Given User clicks on At a glance drapdownSR
    And User gets few optionsSR
    When User clicks on each optionSR
    Then Each options available should be accessibleSR


  Scenario: Quick Draft Working CapabilitySR
    Given Entering text in Title boxSR
    And Adding text to the content boxSR
    Then hit on Save Draft buttonSR


  Scenario: Check the working of WordPress Events and NewsSR
    Given user go to  WordPress Events and NewsSR
    When Options are available to the userSR
    Then Every choice will display some contentSR

  Scenario: Verify the working functionality of Woocommerce StatusSR
    Given user move to WooCommerce Status OptionsSR
    And Order Status of Woocommerce Should be apperedSR
    Then click on Each optionSR
    And It display the relavent contentSR
    
# Profile section------------------------------------------------------------------------------------------------------------------------
    
  Scenario: Functionality of Admin color scheme
    And click on profilesectionB
    Given User is in Profile sectionB
    When click on Default color optionsB
    And click on blue color schemeB
    And click on Ectoplasm color optionB
    Then check the color is changedB
    And click on the check boxesB
    And validate the emailB


  Scenario: Updating the Name details
    And click on profilesectionB
    Given User is in Name detailsB
    Then Enter name detailsB
    And Using dropdown to display nameB

  Scenario: Customer billing address & customer shipping address
    And click on profilesectionB
    Given User is in billing address detailsB
    When Enter all address related detailsB
    Then Use Autosuggesion to enter country nameB
    And use Autosuggesion to enter state nameB
    And use copy button to copy billing address as shippingB
    Then billing and shipping address is enteredB

  Scenario: Updating the profile
    And click on profilesectionB
    Given user details are filledB
    When click on update profile buttonB
    Then profile will be updatedB
    
  Scenario: Logout from the section
    And click on profilesectionB
    Given User get logout from the sectionB
    When move the cursor on profile sectionB
    Then click on logout optionB
    
# Post Tag section    ----------------------------------------------------------------------------------------------------------------------

Scenario: Verify Weather add post is working or not
And I click on the posts buttonV 
When I click on the posts buttonV
And I click on the add New button in posts pageV
And Enter the post name in the text boxV
And click on publish buttonV
Then close broswerV

Scenario: Verify all posts page
And I click on the posts buttonV
When I click on the posts buttonV
When I click on all posts buttonV
And I click on Bulk Actions dropdown in all posts pageV
And I click on All dates dropdown in all posts pageV
And I click on All Categories dropdown in all posts pageV
And I click on Screen Options dropdown in all posts pageV
And I click on Screen Options dropdown in all posts pageV
And I click on Help dropdown in all posts pageV
And I click on Help dropdown in all posts pageV
Then close broswerV



Scenario: Verify add new Category functionality
And I click on the posts buttonV
When I click on the posts buttonV
When I click on categories buttonV
And Enter category name in name textboxV
And Enter slug in slug textboxV
And I select the option in parent category dropdownV
And I enter the Description in description textboxV
And I click on the Add new category buttonV
And Enter the category name in the search text boxV
And click on Search Categories buttonV
Then close broswerV



Scenario: Verify add new Tag functionality
And I click on the posts buttonV
When I click on the posts buttonV
When I click on Tag buttonV
And Enter Tag name in name textboxV
And Enter slug in slug textboxV
And I enter the Description in description textboxV
And I click on the Add new Tag buttonV
And Enter the Tag name in the search text boxV
And click on Search Tags buttonV
Then close broswerV



Scenario: Verify the working functionality of serch box
And I click on the posts buttonV
When I click on the posts buttonV
And Enter the post name in the search text boxV
And click on Search Posts buttonV
And click on Dashboard buttonV
Then close broswerV

Scenario: Verify Weather all functions is working or not
And I click on the posts buttonV
Given click on the all posts optionV
And user gets some optionsV
When user click on each optionV 
Then very option will display related contentV
Then close broswerV

# media section-----------------------------------------------------------------------------------------------------------------------------
Scenario: Verify the functionality of Media Section
 		And click on mediasectionA
    Given User is on media sectionA
    When click on Library optionA
    And click on Add New buttonA
    And click on select filesA
    Then check file uploading functinalityA
    And close the browserA
    

  Scenario: Verify the functionality of dropdowns 
  	And click on mediasectionA
    Given click on dropdownA
    When User choose any option from dropdownA
    Then Appropriate result should be displayedA
    And close the browserA

	Scenario: Verify Second dropdown functionality
	  And click on mediasectionA
		Given User is in first dropdownA
		Then Choose any option from dropdownA
		And close the browserA
	
	Scenario: Verify Search box functionality
	  And click on mediasectionA
		Given click on search boxA
		When user enters any text inside the search boxA
		Then result should be displayedA
		And close the browserA
# Comments section-----------------------------------------------------------------------------------------------------------------------
	
	Scenario: verify working functionality of Comments
Given user get the DashboardP
When user click on  the Comments iconP
Then user get few optionsP
And each option should be availableP
And close browserP

Scenario Outline: Verify the working functionality of serch box
When user click on  the Comments iconP
Then click on search boxP
And enter <userId>P
And click on search commentP
And shows user commentP
And close browserP

Examples:
|userId|
|Bhavana samudrala|

Scenario: Verify dropdown functionality
When user click on  the Comments iconP
And click on dropdown buttonP
Then select optionP
And click on filterP
And close browserP

Scenario: Verify the reply functionality of comments section
When user click on  the Comments iconP
When user hover to reply optionP
And click on reply buttonP
Then user enter any text in the comment boxP
And click on sendP

# PROPERTIES SECTION---------------------------------------------------------------------------------------------------------------------
Scenario Outline: Working and functionality of screen options in properties module
And Navigate to properties
And Click on Screen options in the Properties page
And Select columns pagination view
Then Apply screen Options

Scenario Outline: Working and Functionality of add new button in Properties page
And Navigate to properties
And Click on add new button
Then Verify it redirects to add new properties

Scenario Outline: Verify the Date Filter and Actions
And Navigate to properties
And Click on Date Filter Select date
And Click on Filter
And Select All Properties are displayed
And Click on Bulk actions Select the action
And Click on Apply
Then Verify the action is performed

Scenario Outline: Verify the functionality of Properties
And Navigate to properties
And Click on Search bar
And Enter the Property Details and click on search button
And Click on Edit
And Click on Quick edit and update the property
Then close the window

Scenario Outline: Verify the working and functionality of add new property
And Navigate to properties
And Click on Add new
And Click on title and Enter the title details
And Click on description enter the description
And Click on add or upload images
And Select images of property
And Click on use these files
And Click on gallery layout select the layout
And Click on Price Details enter the details 
And Click on Main Details enter the details
And Click on location details enter the details
And Click on Details enter the details
And Click on Video urls
And Click on Findeo Property select the image
And Select Keywords of the property
And Click and enter the project details
And Click and enter the builder name
And Click on checkbox of discussion
Then Click on publish

Scenario Outline: Verify the Functionality of Features
And Navigate to properties
And Click on features
And Click on Name enter the feature name
And Click on slug enter the slug
And select the parent feature
And Click on Description enter the feature description
And Click on Addnew feature
And Perform search opertions in features page
Then close the browser

Scenario Outline: Verify the Functionality of Regions
And Navigate to properties
And Click on Regions
And Click on Name enter the region name
And Click on slug enter the region slug
And select the parent region
And Click on Description enter the region description
And Click on Addnew region
And Perform search opertions in region page
Then close the browser  

# Users Section--------------------------------------------------------------------------------------------------------------------------------------
@Users
Scenario: verify Screen option functionality
Given I Click on UsersR
And I Click on screenOptionR
When I select All checkboxR
And I Send user number for user per pageR
And close browserR


Scenario: Verify adduser is working or not
Given I Click on UsersR
Given I Open add user pageR
When I enter all inputs present in add user pageR
And I select role of the userR
Then I Click on add new user buttonR



Scenario: Verify Search functionality
Given I Click on UsersR
And I Search Rajatwork98@gmail.comR
When I Check Rajatwork98@gmail.com present or notR
Then I Delete Rajatwork98@gmail.comR


Given I Click on UsersR
And I Search invalid id Rajatwork9858468@gmail.comR
Then It should display No users foundR
And close browserR

Scenario: Check profile section and admin credential

Given I Click on UsersR
Given I switch to Your profile sectionR
Then I check all the checkboxes are checked or notR
And I change admin color scheme into BlueR

Then I check Email present in email section is correct or notR
And I send some data to adminR
And I clicked on update profileR
Then I check  Profile is updated or notR
And close browserR



 