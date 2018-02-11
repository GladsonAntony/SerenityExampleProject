/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 8:02:00 PM
 */

package tests;

import org.junit.Test;

import net.thucydides.core.annotations.WithTag;
import steps.initializeSteps.ScenarioStepsInitializer;


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