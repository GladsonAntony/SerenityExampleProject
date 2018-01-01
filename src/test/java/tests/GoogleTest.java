/**
 * @Author Gladson Antony
 * @Date 01-Jan-2018 
 * @Time 10:02:22 AM
 */
package tests;

import org.junit.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class GoogleTest extends PageFactoryInitializer
{	
	@Test
	public void googleTest() throws Exception
	{
		googleHomePageSteps
		.verifyPageTitle()
		.verifyPageElements();
	}

}
