@Test
Feature: Login page fields

Scenario: Validate the Web Elements on Home Page
	Given I launch Chrome web browser
	When Access National Merit application at https://www.nationalmerit.org 
	Then I verify the displayed Web Elements on Home Page


Scenario: Validate Search functionality on the Home Page
Given I Validate the Web Elements on Home Page
When I key Text in Search Text Box and Click Search icon
Then I verify the displayed results
