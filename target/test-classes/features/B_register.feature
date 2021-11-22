Feature: Singup Application


Scenario: Register new userP
Given Initialize the browser with chrome
And Navigate to  "http://realty-real-estatem1.upskills.in/my-profile/" site
And Click on Regiter link in home page to land on Secure signup PageP
When entered "suneelv19849r99@gmail.com" and "prudhvi" and "varreP"
Then click on Register buttonP
And getting textP


Scenario: Verify login with invalid credentialsP
Given Initialize the browser with chrome
And Navigate to  "http://realty-real-estatem1.upskills.in/my-profile/" site
And Click on Login link in home page to land on Secure sign in PageP
When I entered "prudhvi@gmail.com"  and "SecrS23&&"  logs inP
Then Click on signin buttonP
And close browserP