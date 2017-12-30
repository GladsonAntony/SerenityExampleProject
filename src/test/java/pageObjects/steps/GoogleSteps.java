package pageObjects.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.pages.GoogleLoginPage;
import pageObjects.pages.GoogleResultsPage;
import pageObjects.pages.GoogleSearchPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSteps extends ScenarioSteps {

	private static final long serialVersionUID = 5416584546042922230L;

	public GoogleSteps(Pages pages) 
	{
		super(pages);
	}

	public GoogleSearchPage googleSearchPage() {
		return getPages().currentPageAt(GoogleSearchPage.class);
	}

	public GoogleResultsPage googleResultsPage() 
	{
		return getPages().currentPageAt(GoogleResultsPage.class);
	}

	public GoogleLoginPage googleLoginPage() 
	{
		return getPages().currentPageAt(GoogleLoginPage.class);
	}

	@Step
	public GoogleSteps inputEmail(String email) 
	{
		googleLoginPage().inputUserName(email);
		return this;
	}

	@Step
	public GoogleSteps inputPassword(String pass) 
	{
		googleLoginPage().inputPassword(pass);
		return this;
	}

	@Step
	public GoogleSteps clickOnLogin() 
	{
		googleLoginPage().clickOnLogin();
		return this;
	}

	@StepGroup
	public GoogleSteps performLogin(String email, String pass) 
	{
		inputEmail(email);
		inputPassword(pass);
		clickOnLogin();
		return this;
	}

	@Step
	public GoogleSteps inputSearchTerm(String search) 
	{
		googleSearchPage().inputTerm(search);
		return this;
	}

	@Step
	public GoogleSteps clickOnSearch() 
	{
		googleSearchPage().clickOnSearch();
		return this;
	}

	@Step
	public GoogleSteps clickOnSignIn() 
	{
		googleSearchPage().clickOnSignIn();
		waitABit(5000);
		return this;
	}

	@StepGroup
	public GoogleSteps performSearch(String search) 
	{
		inputSearchTerm(search);
		clickOnSearch();
		return this;
	}

	@Step
	public GoogleSteps findSearchResult(String search) 
	{
		googleResultsPage().findResult(search);
		return this;
	}

	@Step
	public GoogleSteps verifyUrl(String url) 
	{
		assertThat("Url pattern does not match! ", getDriver().getCurrentUrl().contains(url));
		return this;
	}
}