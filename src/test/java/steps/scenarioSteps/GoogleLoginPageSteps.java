/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 9:53:27 PM
 */
package steps.scenarioSteps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.homePage.GoogleHomePage;
import pages.loginPage.GoogleLoginPage;

/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 9:53:27 PM
 */
public class GoogleLoginPageSteps extends ScenarioSteps
{
	private static final long serialVersionUID = 1L;
	
	public GoogleLoginPageSteps(Pages pages) 
	{
		super(pages);
	}
	
	public GoogleHomePage googleHomePage() 
	{
		return getPages().currentPageAt(GoogleHomePage.class);
	}
	
	public GoogleLoginPage googleloginPage() 
	{
		return getPages().currentPageAt(GoogleLoginPage.class);
	}

	public GoogleLoginPageSteps clickOnSignIn() 
	{
		googleHomePage().clickOnSignInButton();
		return this;
	}

	public GoogleLoginPageSteps verifyPageElement() 
	{
		googleloginPage().verifyPageElements();
		return this;
	}

	public GoogleLoginPageSteps enterEMailAddress(String email) 
	{
		googleloginPage().enterEMailAddress(email);
		return this;
	}

	public GoogleLoginPageSteps enterPassword(String password) 
	{
		googleloginPage().enterPassword(password);
		return this;
	}

}
