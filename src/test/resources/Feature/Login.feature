Feature: Verifying OMR Login

Scenario Outline: Verifying valid credentials

Given User is on Omr branch page
When User enters "<username>" and "<password>"
And User clicks the login button
Then User should verfy after Login successful message
	Examples:
			|username|password|
			|sunilragavmech.1999@gmail.com|Sunil@1999|
