/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 8:05:00 PM
 */

package tests;

import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleSearchFailTest extends PageFactoryInitializer
{
    @Test
    public void googleSearchFailTest() 
    {
		googleHomePageSteps
		.verifyPageTitle()
		.verifyPageElements()
		.searchFor("Naruto Uzumaki");
		googleSearchResultsSteps
		.verifyPageElements()
		.verifyPageTitle("Naruto iUzumaki");
    }
}