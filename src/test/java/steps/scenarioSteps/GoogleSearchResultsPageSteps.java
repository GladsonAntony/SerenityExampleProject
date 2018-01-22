/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 7:02:00 PM
 */
package steps.scenarioSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.homePage.GoogleHomePage;
import pages.searchPage.GoogleSearchResultsPage;

/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 7:02:00 PM
 */
public class GoogleSearchResultsPageSteps extends ScenarioSteps
{
	private static final long serialVersionUID = 1L;
	
	public GoogleSearchResultsPageSteps(Pages pages) 
	{
		super(pages);
	}
	
	public GoogleHomePage googleHomePage() 
	{
		return getPages().currentPageAt(GoogleHomePage.class);
	}
	
	public GoogleSearchResultsPage googleSearchResultsPage() 
	{
		return getPages().currentPageAt(GoogleSearchResultsPage.class);
	}

	@Step("Verify the Page Elements")
	public GoogleSearchResultsPageSteps verifyPageElements() 
	{
		googleSearchResultsPage().verifyPageElements();
		return this;
	}

	@Step("Verify the Page Title")
	public GoogleSearchResultsPageSteps verifyPageTitle(String string) 
	{
		googleSearchResultsPage().verifyPageTitle(string);
		return this;
	}

}
