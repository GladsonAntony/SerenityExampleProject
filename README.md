# Serenity Framework - TDD Example
[![N|Solid](http://www.seleniumhq.org/images/selenium-logo.png)](http://www.seleniumhq.org/) 
[![N|Solid](http://thucydides.info/img/serenity-bdd.png =100x20)](http://thucydides.info) 
<!-- [![N|Solid](http://junit.org/junit5/assets/img/junit5-logo.png)](http://junit.org/junit5/)  -->

<img src="http://junit.org/junit5/assets/img/junit5-logo.png" alt="http://junit.org/junit5/" style="height: 20px; width: 200px;"/>

<img src="http://thucydides.info/img/serenity-bdd.png" width="200" height="200" />

<div style="text-align: justify"> 
Serenity is a tool that lets you use WebDriver-based unit or BDD tests to write more flexible and more reusable WebDriver-based tests, and also to generate documentation about your acceptance tests, including a narrative description of test, along with the corresponding screen shots, and also high-level summaries and aggregations of the test results
It provides support for running tests and advanced reporting by using BDD.

The sample project defines both a Gradle and Jenkins build to show both integrations

</div>

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


# Serenity Sample Project
=================
[Serenity](https://github.com/serenity-bdd/serenity-core) 

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

