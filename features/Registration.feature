Feature: Patient Registration

Background:
Given I am on the registeration page

Scenario: Register with valid data
	When I fill in the following:
			| Name                  | Osama Emad          |
			| Username              | osamaem             |
			| Email                 | osamaem@example.com |
			| Password              | secret              |
			| Password confirmation | secret              |
			| Date                  | 17-02-1992          |
			| City                  | Nablus              |
			| Phone Number          | 0598473345          |
			
	And I press "Register"
	Then I should see a confirmation message
	
Scenario: Register with invalid data
	When I fill in the following:
			| Name                  | Osama Emad          	|
			| Username              | osamaem             	|
			| Email                 | invalid-email-address |
			| Password              | secret              	|
			| Password confirmation | secret              	|
			| Date                  | 17-02-1992            |
			| City                  | Nablus                |
			| Phone Number          | 0598473345            |
	And I press "Register"
	Then I should see an error message
	
Scenario: Register with invalid data
	When I fill in the following:
			| Name                  | John Doe            	|
			| Username              | johndoe             	|
			| Email                 | osamaem@example.com   |
			| Password              | secret              	|
			| Password confirmation | secret33             	|
			| Date                  | 17-02-1992            |
			| City                  | Nablus                |
			| Phone Number          | 0598473345            |
	And I press "Register"
	Then I should see an error message
	
Scenario: Register with invalid data
	When I fill in the following:
			| Name                  | John Doe            	|
			| Username              | johndoe             	|
			| Email                 | osamaem@example.com   |
			| Password              | secret              	|
			| Password confirmation | secret            	|
			| Date                  | 17-02-1992            |
			| City                  | Nablus                |
			| Phone Number          | 059847334             |
	And I press "Register"
	Then I should see an error message
	
	
	