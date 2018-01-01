package tests;

import org.junit.Ignore;
import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleLoginTest extends PageFactoryInitializer
{
	@Ignore
	@Test
	public void performLogin() throws Exception 
	{
		googleSteps
		.clickOnSignIn()
		.performLogin("google@gmail.com", "pass");
	}
}