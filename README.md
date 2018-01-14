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

```sh
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
        │   │   ├───initializePageObjects
        │   │   └───pages
        │   ├───steps
        │   └───tests
        └───resources
            └───CSV Files
```

## Maven

```sh
mvn clean verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/opt/dev/chromedriver
```

To use default webdriver:

```
mvn verify
```

See example in Jenkins [here](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample).

A sample report can be viewed [here](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample/Serenity_Report/).

