/**
 * @Author Gladson Antony
 * @Date 01-Jan-2018 
 * @Time 9:13:42 AM
 */
package pageObjects.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GoogleHomePage extends PageObject
{			

	public GoogleHomePage(WebDriver driver) 
    {
        super(driver);
    }

	@FindBy(css="#lst-ib")
	private WebElement searchBox;
	
	@FindBy(css="#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)")
	private WebElement button_SearchButton;
	
	@FindBy(css="#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(2)")
	private WebElement button_IAmFeelingLucky;
	
	@FindBy(css="#gbw > div > div > div.gb_je.gb_R.gb_Dg.gb_ug > div:nth-child(1) > a")
	private WebElement link_GMail;
	
	@FindBy(xpath="//a[contains(text(),'Images')]")
	private WebElement link_Images;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement button_SignIn;
	
	
	public GoogleHomePage verifyPageTitle()
	{
		assertThat(getDriver().getTitle(), containsString("Google"));
		return this;
	}
	
	public GoogleHomePage verifyPageElements()
	{
		assertTrue(button_SignIn.isDisplayed());
		assertTrue(searchBox.isDisplayed());
		assertTrue(link_Images.isDisplayed());
		//assertTrue(link_GMail.isDisplayed());
		return this;
	}

	public GoogleHomePage enterSearchText(String string) 
	{
		searchBox.sendKeys(string);
		button_SearchButton.click();
		return this;
	}
	
	public GoogleHomePage clickOnSignInButton()
	{
		button_SignIn.click();
		return this;
	}

}
