/**
 * @Author Gladson Antony
 * @Date 30-Dec-2017 
 * @Time 11:28:38 PM
 */

package pageObjects.initializePageObjects;

import org.junit.runner.RunWith;

import controllers.MainMethod;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.GoogleSteps;

@RunWith(SerenityRunner.class)
public class PageFactoryInitializer extends MainMethod
{
	@Steps
	public GoogleSteps googleSteps;

}
