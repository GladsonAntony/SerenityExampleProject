/**
 * 
 */
package pageObjects.initializePageObjects;

import org.junit.runner.RunWith;

import controllers.MainMethod;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import pageObjects.steps.GoogleSteps;

/**
 * @author ${Gladson Antony}
 * @date Sep 17, 2016
 * 
 */

@RunWith(SerenityRunner.class)
public class PageFactoryInitializer extends MainMethod
{
	@Steps
	public GoogleSteps googleSteps;

}
