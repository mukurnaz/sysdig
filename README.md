# sysdig
## Test FrameWork Overview
The sample code in this repository uses sysdig login pages to validate that UI Automation operations work for all built-in. You can use this code to perform login test case suite.

This GitHub repository contains following projects:

### `test/java/pages/ForgotPasswordPage`

This project use Page Object Model(POM) design technics that every page includes own web element in this class. 
In this file , You can find related web elements of test case about Forgot Password Test cases.

### `test/java/pages/LoginPage`

This project use Page Object Model(POM) design technics that every page includes own web element in this class. 
In this file , You can find related web elements of test case about Login Test cases.

### `test/java/runners/Runner`

This project use Cucumber Framework for understandable the other team members. Also It provides running central repository and easy maintainability.
Runner class provides to run and manage out codes.

### `test/java/stepDefinitions/ForgotPasswordStepDefinitions`

This project use Cucumber Framework for understandable the other team members. Also It provides running central repository and easy maintainability.
StepDefinitions class implements actual code from Feature files.
You can look at the ForgotPasswordStepDefinitions for forgot password test steps. 

### `test/java/stepDefinitions/LoginStepDefinitions`

This project use Cucumber Framework for understandable the other team members. Also It provides running central repository and easy maintainability.
StepDefinitions class implements actual code from Feature files.
You can look at the LoginStepDefinitions for login test steps. 

### `test/java/utilities/BrowserUtils`

This project includes utilities package under the test/java folder. It provides common codes and It provides reduce code and easily maintanance.
BrowserUtils.class file includes common methods for wait, getAlertMessages and waitForVisibility.
You can use Wait method for waiting any seconds time in the code. 
You can use getAlertMessages for password and email textbox field with invalid input.
You can use waitForVisibility that includes Explicitly wait for waiting visibility of target element.

### `test/java/utilities/ConfigurationReader`

This project includes utilities package under the test/java folder. It provides common codes and It provides reduce code and easily maintanance.
ConfigurationReader make to easy to read input from configuration.properties file. it reads data and give data to us for relevant codes.
Also It provides readable code.

### `test/java/utilities/Driver`

This project includes utilities package under the test/java folder. It provides common codes and It provides reduce code and easily maintanance.
Driver class provides to create Web driver. It supports chrome,firefox,safari,opera browser. Managing driver for timeout and maximize.

### `test/resources/features/login.feature`

This project use Cucumber Framework for understandable the other team members. Feature file use gherkin language to make sure that understandable to each memmber in the team.
Feature file has test cases for login process. It provides tags for select to running.


### `configuration.properties`

Properties file includes data for browser selection , home page url address , user email addresses , user password.

### `pom.xml`

This project use Maven for central repository. It provides automatically download and usable libraries framework.
it includes like WebDriverManager , Selenium-java , TestNG , Cucumber-junit.

