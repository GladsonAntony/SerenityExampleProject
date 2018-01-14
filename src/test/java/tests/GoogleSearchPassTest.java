/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 8:02:00 PM
 */

package tests;

import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleSearchPassTest extends PageFactoryInitializer
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