# Serenity Framework - TDD Example
[![N|Solid](http://www.seleniumhq.org/images/selenium-logo.png)](http://www.seleniumhq.org/)
<img src="http://junit.org/junit4/images/junit-logo.png" style="float: left;"/>
<img src="http://thucydides.info/img/serenity-bdd.png" width="150" height="75" style="float: left;"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Google_Chrome_icon_%28September_2014%29.svg/512px-Google_Chrome_icon_%28September_2014%29.svg.png" width="75" height="75" style="float: left;"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Firefox_Logo%2C_2017.svg/512px-Firefox_Logo%2C_2017.svg.png" width="75" height="75" style="float: left;"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Internet_Explorer_10%2B11_logo.svg/223px-Internet_Explorer_10%2B11_logo.svg.png" width="75" height="75" style="float: left;"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Microsoft_Edge_logo.svg/512px-Microsoft_Edge_logo.svg.png" width="75" height="75" style="float: left;"/>


<div style="text-align: justify"> 
Serenity is a tool that lets you use WebDriver-based unit or BDD tests to write more flexible and more reusable WebDriver-based tests, and also to generate documentation about your acceptance tests, including a narrative description of test, along with the corresponding screen shots, and also high-level summaries and aggregations of the test results
It provides support for running tests and advanced reporting by using BDD.

The sample project defines both a Gradle and Jenkins build to show both integrations</div>

## Project Structure
```cmd
└───src
    ├───main
    │   ├───java
    │   │   ├───controllers
    │   │   └───utils
    │   └───resources
    │       └───drivers
    └───test
        ├───java
        │   ├───pageObjects
        │   │   └───pages
        │   ├───steps
        │   │   ├───initializeSteps
        │   │   └───scenarioSteps
        │   └───tests
        └───resources
            └───CSV Files
|   LICENSE
|   pom.xml
|   README.md
|   serenity.properties
```

## Maven
```cmd
mvn clean verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=./src/main/resources/drivers/chromedriver.exe
```

To use default webdriver:
```cmd
mvn verify
```

## Browser Setup
### File -> serenity.properties
```
webdriver.driver = Chrome
webdriver.chrome.driver = ./src/main/resources/drivers/chromedriver.exe
webdriver.gecko.driver = ./src/main/resources/drivers/geckodriver.exe
webdriver.edge.driver = ./src/main/resources/drivers/MicrosoftWebDriver.exe
webdriver.ie.driver = ./src/main/resources/drivers/IEDriverServer.exe
```

## Examples

### Step 1: Define Page Objects

```java
public class GoogleHomePage extends PageObject
{	
	public GoogleHomePage(WebDriver driver) 
    {
        super(driver);
    }

    //Page Objects

    //Page Methods
}
```

### Step 2: Define Scenario Steps

```java
public class GoogleHomePageSteps extends ScenarioSteps
{
	private static final long serialVersionUID = 1L;
	
	public GoogleHomePageSteps(Pages pages) 
	{
		super(pages);
	}
	
	public GoogleHomePage googleHomePage() 
	{
		return getPages().currentPageAt(GoogleHomePage.class);
	}

    //Define Scenario Steps
}
```
### Step 3: Initialize Scenario Steps

```java
public class ScenarioStepsInitializer extends MainMethod
{	
	@Steps
	public GoogleHomePageSteps googleHomePageSteps;
	
}
```
### Step 4: Write Tests

```java
public class GoogleSearchPassTest extends ScenarioStepsInitializer
{
    @Test
    public void googleSearchPassTest() 
    {   	
		googleHomePageSteps
		.verifyPageTitle()
		.verifyPageElements()
		.searchFor("Naruto Uzumaki");
		googleSearchResultsSteps
		.verifyPageElements()
		.verifyPageTitle("Naruto Uzumaki");
    }
}
```


See example in Jenkins [here](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample).

A sample report can be viewed [here](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample/Serenity_Report/).
