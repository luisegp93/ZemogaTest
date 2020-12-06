# ZemogaTest
files related to the Zemoga technical test


### INFO, must read ###

Files folder contains:

- Zemoga_Test_v1.0.xlsx; inside this file are all test case scenarios that were executed with its corresponding evidence.

- Reported_Bugs_Templates_Examples; contains captures o the reported bug templates in JIRA.

- SeleniumTest_Video.mp4; evidence of the automated test executed.

AutomationTest folder contains:

Code for the automated test, this was made in ECLIPSE IDE using java for coding and Maven for the dependencies.

For executing the test, you need to import the project to Eclipse as an Maven project and open the java file SeleniumTest.java

The automated test uses chromedriver which I have installed in C:\\ChromeDriver_New\\chromedriver.exe, it would be necessary to change this route to your current one in order to execute the test.

In the Eclipse enviroment click "Run as > JUnit Test"

Route to java file: src\test\java\com\selenium\test\SeleniumTest.java



