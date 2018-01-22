/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 8:05:00 PM
 */

package tests;

import org.junit.Test;

import steps.initializeSteps.ScenarioStepsInitializer;

public class GoogleSearchFailTest extends ScenarioStepsInitializer
{
    @Test
    public void googleSearchFailTest1() 
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