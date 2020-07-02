Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User launch the browser
	When User Navigate to LogIn Page
	And User enters "mercury" and "mercury"
	Then Message displayed Login Successfully
