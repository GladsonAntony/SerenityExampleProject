/**
 * @Author Gladson Antony
 * @Date 30-Dec-2017 
 * @Time 11:28:38 PM
 */

package steps.initializeSteps;

import org.junit.runner.RunWith;

import controllers.MainMethod;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.scenarioSteps.GoogleHomePageSteps;
import steps.scenarioSteps.GoogleLoginPageSteps;
import steps.scenarioSteps.GoogleSearchResultsPageSteps;

@RunWith(SerenityRunner.class)
public class ScenarioStepsInitializer extends MainMethod
{	
	@Steps
	public GoogleHomePageSteps googleHomePageSteps;
	
	@Steps
	public GoogleSearchResultsPageSteps googleSearchResultsSteps;
	
	@Steps
	public GoogleLoginPageSteps googleLoginPageSteps;
}
