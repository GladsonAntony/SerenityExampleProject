package tests;

import org.junit.Ignore;
import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleSearchPassTest extends PageFactoryInitializer
{
	@Ignore
    @Test
    public void googleSearchPassTest() 
    {   	
    	googleSteps
    	.performSearch("42")
    	.findSearchResult("Stupidedia")
    	.verifyUrl("http://www.stupidedia.org/stupi/42");
    }
}