/**
 * @Author Gladson Antony
 * @Date 01-Jan-2018 
 * @Time 9:38:13 AM
 */
package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.pages.GoogleHomePage;;

public class GoogleHomePageSteps extends ScenarioSteps
{
	private static final long serialVersionUID = 1L;
	
	public GoogleHomePageSteps(Pages pages) 
	{
		super(pages);
	}
	
	public GoogleHomePage googleHomePage() 
	{
		return getPages().currentPageAt(GoogleHomePage.class);
	}
	
	@Step ("Verify Page Title")
	public GoogleHomePageSteps verifyPageTitle()
	{
		googleHomePage().verifyPageTitle();
		return this;
	}
	
	@Step("Verify Page Elements")
	public void verifyPageElements1()
	{
		googleHomePage().verifyPageElements();
		//return null;
	}
	
	@Step("Verify Page Elements")
	public GoogleHomePageSteps verifyPageElements()
	{
		googleHomePage().verifyPageElements();
		return this;
	}

	@Step("Enter Search Text: {0}")
	public GoogleHomePageSteps searchFor(String string) 
	{
		googleHomePage().enterSearchText(string);
		return this;
	}

	@Step("verify the Search Results")
	public GoogleHomePageSteps verifySearchResults() 
	{
		googleHomePage().verifyPageTitle();
		return this;
	}
	
	@Step("Click On Sign In Button")
	public GoogleHomePageSteps clickOnSignIn() 
	{
		googleHomePage().clickOnSignInButton();
		return this;
	}

}
