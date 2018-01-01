/**
 * @Author Gladson Antony
 * @Date 01-Jan-2018 
 * @Time 9:38:13 AM
 */
package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.pages.GoogleHomePageObjects;;

public class GoogleHomePageSteps extends ScenarioSteps
{
	private static final long serialVersionUID = 1L;
	
	public GoogleHomePageSteps(Pages pages) 
	{
		super(pages);
	}
	
	public GoogleHomePageObjects googleHomePageObjects() 
	{
		return getPages().currentPageAt(GoogleHomePageObjects.class);
	}
	
	@Step
	public GoogleHomePageSteps verifyPageTitle()
	{
		googleHomePageObjects().verifyPageTitle();
		return this;
	}
	
	@Step
	public GoogleHomePageSteps verifyPageElements()
	{
		googleHomePageObjects().verifyPageElements();
		return this;
	}
	
}
