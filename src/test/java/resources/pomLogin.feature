@Test
Feature: Login page fields

Scenario: Validate the Web Elements on Login Page
	Given I launch Chrome web browser
	When Access National Merit application at https://www.nationalmerit.org 
	Then I verify the displayed Web Elements on Login Page


