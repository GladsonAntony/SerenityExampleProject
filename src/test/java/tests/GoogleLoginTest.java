package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.initializeSteps.ScenarioStepsInitializer;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="./src/test/resources/CSV Files/performLogin.csv")
public class GoogleLoginTest extends ScenarioStepsInitializer
{	
	private String EmailAddress;                      
	private String Password;
	
	
	public void  setEmailAddress(String EmailAddress) {
		this.EmailAddress= EmailAddress;
	}
	
	public void  setPassword(String Password) {
		this.Password= Password;
	}
    
	@Test	
	public void performLogin()
	{
		googleHomePageSteps 
		.verifyPageElements()
		.clickOnSignIn();
		
		googleLoginPageSteps
		.verifyPageElement()
		.enterEMailAddress(EmailAddress)
		.enterPassword(Password);
	}
}