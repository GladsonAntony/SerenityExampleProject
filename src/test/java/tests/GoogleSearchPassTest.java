package tests;

import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleSearchPassTest extends PageFactoryInitializer
{
    @Test
    public void googleSearchPassTest() 
    {   	
    	googleSteps
    	.performSearch("42")
    	.findSearchResult("Stupidedia")
    	.verifyUrl("http://www.stupidedia.org/stupi/42");
    }
}