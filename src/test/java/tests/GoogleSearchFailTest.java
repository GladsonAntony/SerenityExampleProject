package tests;

import org.junit.Ignore;
import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleSearchFailTest extends PageFactoryInitializer
{
	@Ignore
    @Test
    public void googleSearchFailTest() 
    {
        googleSteps
        .performSearch("42")
        .findSearchResult("Stupidedia")
        .verifyUrl("http://www.wikipedia.org/42");
    }
}