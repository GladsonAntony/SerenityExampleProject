package tests;

import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleSearchFailTest extends PageFactoryInitializer
{
    @Test
    public void googleSearchFailTest() 
    {
        googleSteps
        .performSearch("42")
        .findSearchResult("Stupidedia")
        .verifyUrl("http://www.wikipedia.org/42");
    }
}