Feature: Login Functionality

Scenario: Login with valid User id and Password

Given user launches chrome browser
And user opens url "http://demo.guru99.com/Agile_Project/Agi_V1/index.php"
When user enters userId as "1303" and password as "Guru99"
And user clicks LogIn button
Then the tilte of page should be "Guru99 Bank Customer HomePage"
When user clicks LogOut button
Then the tilte of page should be "Guru99 Bank Home Page"
And Browser should close

Scenario: Login with invalid User id and Password
Given user launches chrome browser
And user opens url "http://demo.guru99.com/Agile_Project/Agi_V1/index.php"
When user enters userId as "130" and password as "Guru99"
And user clicks LogIn button
Then the tilte of page should not be "Guru99 Bank Customer HomePage"
And Browser should close

