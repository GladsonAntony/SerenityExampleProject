package tests;

import org.junit.Test;

import net.thucydides.junit.annotations.UseTestDataFrom;
import pageObjects.initializePageObjects.PageFactoryInitializer;

@UseTestDataFrom(value="./src/test/resources/CSV Files/performLogin.csv")
public class GoogleLoginTest extends PageFactoryInitializer
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
	public void performLogin(/*String email,String password*/)
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